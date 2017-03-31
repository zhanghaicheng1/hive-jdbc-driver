package veil.hdp.hive.jdbc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;
import java.util.Properties;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public class HiveConnection extends AbstractConnection {

    private static final Logger log = LoggerFactory.getLogger(HiveConnection.class);

    private static final SQLPermission SQL_PERMISSION_ABORT = new SQLPermission("callAbort");

    private final ThriftSession thriftSession;

    private SQLWarning sqlWarning = null;

    private HiveConnection(ThriftSession thriftSession) {
        this.thriftSession = thriftSession;
    }

    public ThriftSession getThriftSession() {
        return thriftSession;
    }

    @Override
    public void close() throws SQLException {
        thriftSession.close();
    }

    @Override
    public boolean isClosed() throws SQLException {
        return thriftSession.isClosed();
    }

    @Override
    public Statement createStatement() throws SQLException {
        return new HiveStatement.Builder()
                .connection(this)
                .type(ResultSet.TYPE_FORWARD_ONLY)
                .concurrency(ResultSet.CONCUR_READ_ONLY)
                .holdability(getHoldability())
                .build();
    }

    @Override
    public DatabaseMetaData getMetaData() throws SQLException {
        return new HiveDatabaseMetaData(this);
    }

    @Override
    public boolean getAutoCommit() throws SQLException {
        return Boolean.TRUE;
    }

    @Override
    public void setAutoCommit(boolean autoCommit) throws SQLException {
        // no-op; don't support setting this value
    }

    @Override
    public Statement createStatement(int resultSetType, int resultSetConcurrency) throws SQLException {
        return new HiveStatement.Builder()
                .connection(this)
                .type(resultSetType)
                .concurrency(resultSetConcurrency)
                .holdability(getHoldability())
                .build();
    }

    @Override
    public Statement createStatement(int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException {
        return new HiveStatement.Builder()
                .connection(this)
                .type(resultSetType)
                .concurrency(resultSetConcurrency)
                .holdability(resultSetHoldability)
                .build();
    }

    @Override
    public int getHoldability() throws SQLException {
        return ResultSet.CLOSE_CURSORS_AT_COMMIT;
    }

    @Override
    public void setHoldability(int holdability) throws SQLException {
        // no-op; don't support setting this value
    }

    @Override
    public boolean isReadOnly() throws SQLException {
        return Boolean.FALSE;
    }

    @Override
    public void setReadOnly(boolean readOnly) throws SQLException {
        // no-op; connection does not use
    }

    @Override
    public String getCatalog() throws SQLException {
        return null;
    }

    @Override
    public void setCatalog(String catalog) throws SQLException {
        // no-op; no catalog in hive
    }

    @Override
    public SQLWarning getWarnings() throws SQLException {
        return sqlWarning;
    }

    @Override
    public void clearWarnings() throws SQLException {
        sqlWarning = null;
    }

    @Override
    public int getTransactionIsolation() throws SQLException {
        return Connection.TRANSACTION_NONE;
    }

    @Override
    public void setTransactionIsolation(int level) throws SQLException {
        // no-op; don't support transactions yet
    }

    @Override
    public void setNetworkTimeout(Executor executor, int milliseconds) throws SQLException {
        // no-op; need to better understand how this differs from DriverManager.getLoginTimeout()
    }

    @Override
    public int getNetworkTimeout() throws SQLException {
        return 0;
    }

    @Override
    public String getSchema() throws SQLException {
        return HiveServiceUtils.getSchema(this);
    }

    @Override
    public void setSchema(String schema) throws SQLException {
        HiveServiceUtils.setSchema(this, schema);
    }

    @Override
    public boolean isValid(int timeout) throws SQLException {
        if (timeout < 0) {
            throw new SQLDataException("timeout must be greater than or equal to 0.  Current value is " + timeout);
        }

        return HiveServiceUtils.isValid(this, timeout);
    }

    @Override
    public void abort(Executor executor) throws SQLException {

        if (thriftSession.isClosed()) {
            return;
        }

        SQL_PERMISSION_ABORT.checkGuard(this);

        AbortCommand command = new AbortCommand();
        if (executor != null) {
            executor.execute(command);
        } else {
            command.run();
        }
    }


    // --------------------- TODO --------------------------------------------------------------------------------------------------------------------------------------


    @Override
    public PreparedStatement prepareStatement(String sql) throws SQLException {
        return super.prepareStatement(sql);
    }

    @Override
    public PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency) throws SQLException {
        return super.prepareStatement(sql, resultSetType, resultSetConcurrency);
    }

    @Override
    public PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException {
        return super.prepareStatement(sql, resultSetType, resultSetConcurrency, resultSetHoldability);
    }

    @Override
    public PreparedStatement prepareStatement(String sql, int autoGeneratedKeys) throws SQLException {
        return super.prepareStatement(sql, autoGeneratedKeys);
    }

    @Override
    public PreparedStatement prepareStatement(String sql, int[] columnIndexes) throws SQLException {
        return super.prepareStatement(sql, columnIndexes);
    }

    @Override
    public PreparedStatement prepareStatement(String sql, String[] columnNames) throws SQLException {
        return super.prepareStatement(sql, columnNames);
    }

    // --------------------- TODO --------------------------------------------------------------------------------------------------------------------------------------


    @Override
    public String toString() {
        return "HiveConnection{" +
                "thriftSession=" + thriftSession +
                ", sqlWarning=" + sqlWarning +
                '}';
    }

    public static class Builder {

        private Properties properties;

        public HiveConnection.Builder properties(Properties properties) {
            this.properties = properties;
            return this;
        }

        public HiveConnection build() throws SQLException {
            ThriftSession thriftSession = new ThriftSession.Builder()
                    .properties(properties)
                    .timeout(getLoginTimeout())
                    .build();

            return new HiveConnection(thriftSession);
        }

        private int getLoginTimeout() {
            long timeOut = TimeUnit.SECONDS.toMillis(DriverManager.getLoginTimeout());

            if (timeOut > Integer.MAX_VALUE) {
                timeOut = Integer.MAX_VALUE;
            }

            return (int) timeOut;
        }

    }

    public class AbortCommand implements Runnable {
        public void run() {
            try {
                log.debug("attempting to close from abort command");
                close();
            } catch (SQLException e) {
                log.error("error closing during abort: sql state [" + e.getSQLState() + "]", e);
            }
        }
    }
}
