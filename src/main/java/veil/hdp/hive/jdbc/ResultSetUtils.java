package veil.hdp.hive.jdbc;

import org.slf4j.Logger;

import java.sql.SQLException;

import static org.slf4j.LoggerFactory.getLogger;

public class ResultSetUtils {

    private static final Logger log = getLogger(ResultSetUtils.class);

    public static int findColumnIndex(Schema schema, String columnLabel) throws SQLException {
        ColumnDescriptor columnDescriptor = schema.getColumn(columnLabel);

        if (columnDescriptor != null) {
            return columnDescriptor.getPosition();
        }

        throw new SQLException("Could not find column for name " + columnLabel + " in Schema " + schema);
    }

}
