package veil.hdp.hive.jdbc.utils;

import org.apache.hadoop.hive.conf.HiveConf;
import org.apache.hive.service.cli.HiveSQLException;
import org.apache.hive.service.cli.RowSet;
import org.apache.hive.service.cli.RowSetFactory;
import org.apache.hive.service.cli.thrift.*;
import org.apache.thrift.TException;
import org.slf4j.Logger;
import veil.hdp.hive.jdbc.HiveDriverStringProperty;

import java.sql.SQLException;
import java.sql.SQLTimeoutException;
import java.util.*;

import static org.apache.hive.service.cli.thrift.TCLIService.Client;
import static org.apache.hive.service.cli.thrift.TStatusCode.SUCCESS_STATUS;
import static org.apache.hive.service.cli.thrift.TStatusCode.SUCCESS_WITH_INFO_STATUS;
import static org.slf4j.LoggerFactory.getLogger;

public class HiveServiceUtils {

    private static final Logger log = getLogger(HiveServiceUtils.class);

    public static void verifySuccessWithInfo(TStatus status) throws SQLException {
        verifySuccess(status, true);
    }

    public static void verifySuccess(TStatus status) throws SQLException {
        verifySuccess(status, false);
    }

    private static void verifySuccess(TStatus status, boolean withInfo) throws SQLException {
        if (status.getStatusCode() == SUCCESS_STATUS || (withInfo && status.getStatusCode() == SUCCESS_WITH_INFO_STATUS)) {
            return;
        }

        throw new HiveSQLException(status);
    }

    public static TRowSet fetchResults(Client client, TOperationHandle operationHandle, TFetchOrientation orientation, int fetchSize) throws TException {
        TFetchResultsReq fetchReq = new TFetchResultsReq(operationHandle, orientation, fetchSize);
        fetchReq.setFetchType((short)0);
        TFetchResultsResp fetchResults = client.FetchResults(fetchReq);

        if (log.isDebugEnabled()) {
            log.debug(fetchResults.toString());
        }

        return fetchResults.getResults();
    }

    public static List<String> fetchLogs(Client client, TOperationHandle operationHandle, TProtocolVersion protocolVersion) {

        List<String> logs = new ArrayList<>();

        TFetchResultsReq tFetchResultsReq = new TFetchResultsReq(operationHandle, TFetchOrientation.FETCH_FIRST, Integer.MAX_VALUE);
        tFetchResultsReq.setFetchType((short)1);

        try {
            TFetchResultsResp fetchResults = client.FetchResults(tFetchResultsReq);


            if (log.isDebugEnabled()) {
                log.debug(fetchResults.toString());
            }

            RowSet rowSet = RowSetFactory.create(fetchResults.getResults(), protocolVersion);

            for (Object[] row : rowSet) {
                logs.add(String.valueOf(row[0]));
            }

        } catch (TException e) {
           log.error("error fetching logs: {}", e.getMessage(), e);
        }


        return logs;
    }

    public static void closeOperation(Client client, TOperationHandle operationHandle) {
        TCloseOperationReq closeRequest = new TCloseOperationReq(operationHandle);

        try {
            client.CloseOperation(closeRequest);

            if (log.isDebugEnabled()) {
                log.debug(closeRequest.toString());
            }

        } catch (TException e) {
            log.warn(e.getMessage(), e);
        }
    }

    public static void cancelOperation(Client client, TOperationHandle operationHandle) {
        TCancelOperationReq cancelRequest = new TCancelOperationReq(operationHandle);

        try {
            client.CancelOperation(cancelRequest);

            if (log.isDebugEnabled()) {
                log.debug(cancelRequest.toString());
            }

        } catch (TException e) {
            log.warn(e.getMessage(), e);
        }
    }

    public static void closeSession(Client client, TSessionHandle sessionHandle) {
        TCloseSessionReq closeRequest = new TCloseSessionReq(sessionHandle);

        try {
            client.CloseSession(closeRequest);

            if (log.isDebugEnabled()) {
                log.debug(closeRequest.toString());
            }

        } catch (TException e) {
            log.warn(e.getMessage(), e);
        }
    }

    public static TOperationHandle executeSql(Client client, TSessionHandle sessionHandle, long queryTimeout, String sql) throws TException {
        TExecuteStatementReq executeStatementReq = new TExecuteStatementReq(sessionHandle, sql);
        executeStatementReq.setRunAsync(true);
        executeStatementReq.setQueryTimeout(queryTimeout);
        // allows per statement configuration of session handle
        //executeStatementReq.setConfOverlay(null);

        TExecuteStatementResp executeStatementResp = client.ExecuteStatement(executeStatementReq);

        if (log.isDebugEnabled()) {
            log.debug(executeStatementResp.toString());
        }

        return executeStatementResp.getOperationHandle();


    }

    public static void waitForStatementToComplete(Client client, TOperationHandle statementHandle) throws TException, SQLException {
        boolean isComplete = false;

        while (!isComplete) {

            TGetOperationStatusReq statusReq = new TGetOperationStatusReq(statementHandle);
            TGetOperationStatusResp statusResp = client.GetOperationStatus(statusReq);

            if (statusResp.isSetOperationState()) {

                switch (statusResp.getOperationState()) {
                    case CLOSED_STATE:
                    case FINISHED_STATE:
                        isComplete = true;
                        break;
                    case CANCELED_STATE:
                        throw new SQLException("Query was cancelled", "01000");
                    case TIMEDOUT_STATE:
                        throw new SQLTimeoutException("Query timed out");
                    case ERROR_STATE:
                        throw new SQLException(statusResp.getErrorMessage(), statusResp.getSqlState(), statusResp.getErrorCode());
                    case UKNOWN_STATE:
                        throw new SQLException("Unknown query", "HY000");
                    case INITIALIZED_STATE:
                    case PENDING_STATE:
                    case RUNNING_STATE:
                        break;
                }
            }

        }
    }


    public static TOpenSessionResp openSession(Properties properties, Client client) throws TException {
        TOpenSessionReq openSessionReq = new TOpenSessionReq();
        String username = properties.getProperty(HiveDriverStringProperty.USER.getName());

        if (username != null) {
            openSessionReq.setUsername(username);
            openSessionReq.setPassword(properties.getProperty(HiveDriverStringProperty.PASSWORD.getName()));
        }

        // set properties for session
        Map<String, String> configuration = buildSessionConfig(properties);

        if (log.isDebugEnabled()) {
            log.debug("configuration for session provided to thrift {}", configuration);
        }

        openSessionReq.setConfiguration(configuration);

        if (log.isDebugEnabled()) {
            log.debug(openSessionReq.toString());
        }

        return client.OpenSession(openSessionReq);

    }


    private static Map<String, String> buildSessionConfig(Properties properties) {
        Map<String, String> openSessionConfig = new HashMap<>();

        for (String property : properties.stringPropertyNames()) {
            HiveConf.ConfVars confVar = HiveConf.getConfVars(property);

            if (confVar != null) {
                openSessionConfig.put("set:hiveconf:" + property, properties.getProperty(property));
            }
        }

        openSessionConfig.put("use:database", properties.getProperty(HiveDriverStringProperty.DATABASE_NAME.getName()));

        return openSessionConfig;
    }

    public static TTableSchema getSchema(Client client, TOperationHandle operationHandle) throws TException {

        TGetResultSetMetadataReq metadataReq = new TGetResultSetMetadataReq(operationHandle);
        TGetResultSetMetadataResp metadataResp = client.GetResultSetMetadata(metadataReq);

        if (log.isDebugEnabled()) {
            log.debug(metadataResp.toString());
        }

        return metadataResp.getSchema();
    }
}