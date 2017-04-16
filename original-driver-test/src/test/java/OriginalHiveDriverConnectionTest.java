import org.apache.hive.jdbc.HiveDriver;
import veil.hdp.hive.jdbc.BaseConnectionTest;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;


public class OriginalHiveDriverConnectionTest extends BaseConnectionTest {

    @Override
    public Connection createConnection() throws SQLException {

        Properties properties = new Properties();
        properties.setProperty("user", "hive");

        String url = "jdbc:hive2://hive.hdp.local:10000/default";

        return new HiveDriver().connect(url, properties);
    }
}