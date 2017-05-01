/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package veil.hdp.hive.jdbc.thrift;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
public class TCLIServiceConstants {

  public static final Set<TTypeId> PRIMITIVE_TYPES = new HashSet<TTypeId>();
  static {
    PRIMITIVE_TYPES.add(veil.hdp.hive.jdbc.thrift.TTypeId.BOOLEAN_TYPE);
    PRIMITIVE_TYPES.add(veil.hdp.hive.jdbc.thrift.TTypeId.TINYINT_TYPE);
    PRIMITIVE_TYPES.add(veil.hdp.hive.jdbc.thrift.TTypeId.SMALLINT_TYPE);
    PRIMITIVE_TYPES.add(veil.hdp.hive.jdbc.thrift.TTypeId.INT_TYPE);
    PRIMITIVE_TYPES.add(veil.hdp.hive.jdbc.thrift.TTypeId.BIGINT_TYPE);
    PRIMITIVE_TYPES.add(veil.hdp.hive.jdbc.thrift.TTypeId.FLOAT_TYPE);
    PRIMITIVE_TYPES.add(veil.hdp.hive.jdbc.thrift.TTypeId.DOUBLE_TYPE);
    PRIMITIVE_TYPES.add(veil.hdp.hive.jdbc.thrift.TTypeId.STRING_TYPE);
    PRIMITIVE_TYPES.add(veil.hdp.hive.jdbc.thrift.TTypeId.TIMESTAMP_TYPE);
    PRIMITIVE_TYPES.add(veil.hdp.hive.jdbc.thrift.TTypeId.BINARY_TYPE);
    PRIMITIVE_TYPES.add(veil.hdp.hive.jdbc.thrift.TTypeId.DECIMAL_TYPE);
    PRIMITIVE_TYPES.add(veil.hdp.hive.jdbc.thrift.TTypeId.NULL_TYPE);
    PRIMITIVE_TYPES.add(veil.hdp.hive.jdbc.thrift.TTypeId.DATE_TYPE);
    PRIMITIVE_TYPES.add(veil.hdp.hive.jdbc.thrift.TTypeId.VARCHAR_TYPE);
    PRIMITIVE_TYPES.add(veil.hdp.hive.jdbc.thrift.TTypeId.CHAR_TYPE);
    PRIMITIVE_TYPES.add(veil.hdp.hive.jdbc.thrift.TTypeId.INTERVAL_YEAR_MONTH_TYPE);
    PRIMITIVE_TYPES.add(veil.hdp.hive.jdbc.thrift.TTypeId.INTERVAL_DAY_TIME_TYPE);
  }

  public static final Set<TTypeId> COMPLEX_TYPES = new HashSet<TTypeId>();
  static {
    COMPLEX_TYPES.add(veil.hdp.hive.jdbc.thrift.TTypeId.ARRAY_TYPE);
    COMPLEX_TYPES.add(veil.hdp.hive.jdbc.thrift.TTypeId.MAP_TYPE);
    COMPLEX_TYPES.add(veil.hdp.hive.jdbc.thrift.TTypeId.STRUCT_TYPE);
    COMPLEX_TYPES.add(veil.hdp.hive.jdbc.thrift.TTypeId.UNION_TYPE);
    COMPLEX_TYPES.add(veil.hdp.hive.jdbc.thrift.TTypeId.USER_DEFINED_TYPE);
  }

  public static final Set<TTypeId> COLLECTION_TYPES = new HashSet<TTypeId>();
  static {
    COLLECTION_TYPES.add(veil.hdp.hive.jdbc.thrift.TTypeId.ARRAY_TYPE);
    COLLECTION_TYPES.add(veil.hdp.hive.jdbc.thrift.TTypeId.MAP_TYPE);
  }

  public static final Map<TTypeId,String> TYPE_NAMES = new HashMap<TTypeId,String>();
  static {
    TYPE_NAMES.put(veil.hdp.hive.jdbc.thrift.TTypeId.BOOLEAN_TYPE, "BOOLEAN");
    TYPE_NAMES.put(veil.hdp.hive.jdbc.thrift.TTypeId.INTERVAL_DAY_TIME_TYPE, "INTERVAL_DAY_TIME");
    TYPE_NAMES.put(veil.hdp.hive.jdbc.thrift.TTypeId.DATE_TYPE, "DATE");
    TYPE_NAMES.put(veil.hdp.hive.jdbc.thrift.TTypeId.UNION_TYPE, "UNIONTYPE");
    TYPE_NAMES.put(veil.hdp.hive.jdbc.thrift.TTypeId.ARRAY_TYPE, "ARRAY");
    TYPE_NAMES.put(veil.hdp.hive.jdbc.thrift.TTypeId.STRUCT_TYPE, "STRUCT");
    TYPE_NAMES.put(veil.hdp.hive.jdbc.thrift.TTypeId.INTERVAL_YEAR_MONTH_TYPE, "INTERVAL_YEAR_MONTH");
    TYPE_NAMES.put(veil.hdp.hive.jdbc.thrift.TTypeId.VARCHAR_TYPE, "VARCHAR");
    TYPE_NAMES.put(veil.hdp.hive.jdbc.thrift.TTypeId.NULL_TYPE, "NULL");
    TYPE_NAMES.put(veil.hdp.hive.jdbc.thrift.TTypeId.MAP_TYPE, "MAP");
    TYPE_NAMES.put(veil.hdp.hive.jdbc.thrift.TTypeId.DECIMAL_TYPE, "DECIMAL");
    TYPE_NAMES.put(veil.hdp.hive.jdbc.thrift.TTypeId.CHAR_TYPE, "CHAR");
    TYPE_NAMES.put(veil.hdp.hive.jdbc.thrift.TTypeId.BINARY_TYPE, "BINARY");
    TYPE_NAMES.put(veil.hdp.hive.jdbc.thrift.TTypeId.SMALLINT_TYPE, "SMALLINT");
    TYPE_NAMES.put(veil.hdp.hive.jdbc.thrift.TTypeId.STRING_TYPE, "STRING");
    TYPE_NAMES.put(veil.hdp.hive.jdbc.thrift.TTypeId.TINYINT_TYPE, "TINYINT");
    TYPE_NAMES.put(veil.hdp.hive.jdbc.thrift.TTypeId.INT_TYPE, "INT");
    TYPE_NAMES.put(veil.hdp.hive.jdbc.thrift.TTypeId.BIGINT_TYPE, "BIGINT");
    TYPE_NAMES.put(veil.hdp.hive.jdbc.thrift.TTypeId.FLOAT_TYPE, "FLOAT");
    TYPE_NAMES.put(veil.hdp.hive.jdbc.thrift.TTypeId.DOUBLE_TYPE, "DOUBLE");
    TYPE_NAMES.put(veil.hdp.hive.jdbc.thrift.TTypeId.TIMESTAMP_TYPE, "TIMESTAMP");
  }

  public static final String CHARACTER_MAXIMUM_LENGTH = "characterMaximumLength";

  public static final String PRECISION = "precision";

  public static final String SCALE = "scale";

}
