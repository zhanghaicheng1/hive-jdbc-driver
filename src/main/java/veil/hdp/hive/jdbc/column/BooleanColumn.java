package veil.hdp.hive.jdbc.column;

import veil.hdp.hive.jdbc.ColumnDescriptor;

import java.sql.SQLException;

/**
 * Created by tveil on 4/4/17.
 */
public class BooleanColumn extends AbstractColumn<Boolean> {
    public BooleanColumn(ColumnDescriptor descriptor, Boolean value) {
        super(descriptor, value);
    }

    @Override
    public Boolean getValue() {
        return value != null ? value : false;
    }

    @Override
    public Boolean asBoolean() throws SQLException {
        return getValue();
    }


    @Override
    public String asString() throws SQLException {
        if (value != null) {
            return Boolean.toString(value);
        }

        return null;
    }
}
