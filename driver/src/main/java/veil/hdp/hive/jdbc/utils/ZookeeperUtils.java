/*
 *    Copyright 2018 Timothy J Veil
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package veil.hdp.hive.jdbc.utils;


import com.google.common.base.Splitter;
import org.apache.commons.lang3.StringUtils;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.RetryOneTime;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import veil.hdp.hive.jdbc.HiveDriverProperty;
import veil.hdp.hive.jdbc.HiveException;

import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Random;

final class ZookeeperUtils {

    private static final Logger log = LogManager.getLogger(ZookeeperUtils.class);
    private static final Charset UTF_8 = Charset.forName("UTF-8");

    private ZookeeperUtils() {
    }


    static void loadPropertiesFromZookeeper(String authority, Properties properties) {

        String zooKeeperNamespace = HiveDriverProperty.ZOOKEEPER_DISCOVERY_NAMESPACE.get(properties);
        int retry = HiveDriverProperty.ZOOKEEPER_DISCOVERY_RETRY.getInt(properties);

        /*

          example string returned from zookeeper

          hive.server2.authentication=NONE;hive.server2.transport.mode=binary;hive.server2.thrift.sasl.qop=auth;hive.server2.thrift.bind.host=hive-large.hdp.local;hive.server2.thrift.port=10000;hive.server2.use.SSL=false

          hive.server2.authentication=NONE
          hive.server2.transport.mode=binary
          hive.server2.thrift.sasl.qop=auth
          hive.server2.thrift.bind.host=hive-large.hdp.local
          hive.server2.thrift.port=10000
          hive.server2.use.SSL=false

          todo: hive.server2.thrift.http.path
          todo: hive.server2.authentication.kerberos.principal
            current code doesn't like _HOST returned by server
         */


        Random random = new Random();

        try (CuratorFramework zooKeeperClient = CuratorFrameworkFactory.builder().connectString(authority).retryPolicy(new RetryOneTime(retry)).build()) {

            zooKeeperClient.start();

            List<String> hosts = zooKeeperClient.getChildren().forPath('/' + zooKeeperNamespace);

            String randomHost = hosts.get(random.nextInt(hosts.size()));

            String hostData = new String(zooKeeperClient.getData().forPath('/' + zooKeeperNamespace + '/' + randomHost), UTF_8);

            Map<String, String> config = Splitter.on(";").trimResults().omitEmptyStrings().withKeyValueSeparator("=").split(hostData);

            for (Entry<String, String> entry : config.entrySet()) {
                String value = StringUtils.trimToNull(entry.getValue());

                if (value != null) {

                    String key = entry.getKey();

                    HiveDriverProperty hiveDriverProperty = HiveDriverProperty.forAlias(key);

                    if (hiveDriverProperty != null) {

                        String originalValue = hiveDriverProperty.get(properties);

                        if (!value.equals(originalValue)) {

                            log.debug("updating existing property [{}] from zookeeper:  Old value [{}], New value [{}].  hive configuration parameter [{}].", hiveDriverProperty.getKey(), originalValue, value, key);

                            hiveDriverProperty.set(properties, value);
                        }
                    } else {

                        log.warn("adding new property [{}] with value [{}] from zookeeper. this could likely be handled better by the driver.  possible bug!", key, value);

                        properties.setProperty(key, value);
                    }
                }
            }


        } catch (Exception e) {
            throw new HiveException(e);
        }
    }

}
