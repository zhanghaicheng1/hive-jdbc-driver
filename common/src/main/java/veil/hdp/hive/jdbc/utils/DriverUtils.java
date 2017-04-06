package veil.hdp.hive.jdbc.utils;


import com.google.common.base.Splitter;
import com.google.common.base.Strings;
import com.google.common.collect.Maps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import veil.hdp.hive.jdbc.HiveDriverProperty;
import veil.hdp.hive.jdbc.PropertiesCallback;

import java.net.URI;
import java.sql.DriverPropertyInfo;
import java.sql.SQLException;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class DriverUtils {

    private static final Logger log = LoggerFactory.getLogger(DriverUtils.class);

    private static final String JDBC_PART = "jdbc:";
    private static final String HIVE2_PART = "hive2:";
    private static final String JDBC_HIVE2_PREFIX = JDBC_PART + HIVE2_PART + "//";


    public static boolean acceptURL(String url) {
        return url.startsWith(JDBC_HIVE2_PREFIX);
    }


    public static Properties buildProperties(String url, Properties suppliedProperties, PropertiesCallback callback) throws SQLException {

        Properties properties = new Properties();

        loadDefaultProperties(properties);

        parseUrl(url, properties, callback);

        for (String key : suppliedProperties.stringPropertyNames()) {

            String value = Strings.emptyToNull(suppliedProperties.getProperty(key));

            if (value != null) {
                properties.setProperty(key, value);
            }

        }

        validateProperties(properties);

        printProperties(properties);

        return properties;

    }

    private static void loadDefaultProperties(Properties properties) {
        for (HiveDriverProperty property : HiveDriverProperty.values()) {
            property.setDefaultValue(properties);
        }
    }

    private static void printProperties(Properties properties) {
        StringBuilder builder = new StringBuilder("\n******************************************\n");
        builder.append("connection properties\n");
        builder.append("******************************************\n");

        Set<String> strings = properties.stringPropertyNames();

        for (String key : strings) {
            builder.append("\t").append(key).append(" : ").append(properties.getProperty(key)).append("\n");
        }
        builder.append("******************************************\n");

        log.debug(builder.toString());
    }

    public static DriverPropertyInfo[] buildDriverPropertyInfo(String url, Properties suppliedProperties, PropertiesCallback callback) throws SQLException {
        Properties properties = buildProperties(url, suppliedProperties, callback);

        HiveDriverProperty[] driverProperties = HiveDriverProperty.values();

        DriverPropertyInfo[] driverPropertyInfoArray = new DriverPropertyInfo[driverProperties.length];

        for (int i = 0; i < driverPropertyInfoArray.length; i++) {
            driverPropertyInfoArray[i] = driverProperties[i].toDriverPropertyInfo(properties);
        }

        return driverPropertyInfoArray;

    }


    private static void validateProperties(Properties properties) throws SQLException {

        for (String key : properties.stringPropertyNames()) {

            boolean valid = false;

            for (HiveDriverProperty property : HiveDriverProperty.values()) {
                if (property.getName().equalsIgnoreCase(key)) {
                    valid = true;
                    break;
                }
            }

            if (key.startsWith("hive.")) {
                valid = true;
            }

            if (!valid) {
                log.warn("property [{}] is not valid", key);
            }

        }

        for (HiveDriverProperty property : HiveDriverProperty.values()) {
            if (property.isRequired() && property.get(properties) == null) {
                throw new SQLException("property [" + property.getName() + "] is required");
            }
        }

    }


    private static void parseUrl(String url, Properties properties, PropertiesCallback callback) throws SQLException {

        URI uri = URI.create(stripPrefix(url));

        String databaseName = Strings.emptyToNull(getDatabaseName(uri));

        HiveDriverProperty.DATABASE_NAME.set(properties, databaseName);

        String uriQuery = uri.getQuery();

        parseQueryParameters(uriQuery, properties);

        callback.merge(properties, uri);

        /*if (HiveDriverProperty.ZOOKEEPER_DISCOVERY_ENABLED.getBoolean(properties)) {

            String authority = uri.getAuthority();

            loadPropertiesFromZookeeper(authority, properties);

        } else {
            HiveDriverProperty.HOST_NAME.set(properties, uri.getHost());

            if (uri.getPort() != -1) {
                HiveDriverProperty.PORT_NUMBER.set(properties, uri.getPort());
            }

        }*/

    }

    private static void parseQueryParameters(String path, Properties properties) {

        Map<String, String> parameters = Maps.newHashMap();

        if (path != null) {
            parameters.putAll(Splitter.on("&").trimResults().omitEmptyStrings().withKeyValueSeparator("=").split(path));
        }

        for (String key : parameters.keySet()) {
            String value = Strings.nullToEmpty(parameters.get(key));

            if (value != null) {
                properties.setProperty(key, value);
            }
        }

    }

    private static String getDatabaseName(URI uri) {
        String path = uri.getPath();

        if (path != null && path.startsWith("/")) {
            return path.replaceFirst("/", "");
        }

        return null;
    }


    private static String stripPrefix(String url) {
        return url.replace(DriverUtils.JDBC_PART, "").trim();
    }


}