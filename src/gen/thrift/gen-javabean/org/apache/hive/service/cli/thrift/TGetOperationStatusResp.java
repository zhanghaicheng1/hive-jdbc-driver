/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hive.service.cli.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-03-30")
public class TGetOperationStatusResp implements org.apache.thrift.TBase<TGetOperationStatusResp, TGetOperationStatusResp._Fields>, java.io.Serializable, Cloneable, Comparable<TGetOperationStatusResp> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TGetOperationStatusResp");

  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField OPERATION_STATE_FIELD_DESC = new org.apache.thrift.protocol.TField("operationState", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField SQL_STATE_FIELD_DESC = new org.apache.thrift.protocol.TField("sqlState", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField ERROR_CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("errorCode", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField ERROR_MESSAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("errorMessage", org.apache.thrift.protocol.TType.STRING, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TGetOperationStatusRespStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TGetOperationStatusRespTupleSchemeFactory();

  private TStatus status; // required
  private TOperationState operationState; // optional
  private java.lang.String sqlState; // optional
  private int errorCode; // optional
  private java.lang.String errorMessage; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STATUS((short)1, "status"),
    /**
     * 
     * @see TOperationState
     */
    OPERATION_STATE((short)2, "operationState"),
    SQL_STATE((short)3, "sqlState"),
    ERROR_CODE((short)4, "errorCode"),
    ERROR_MESSAGE((short)5, "errorMessage");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // STATUS
          return STATUS;
        case 2: // OPERATION_STATE
          return OPERATION_STATE;
        case 3: // SQL_STATE
          return SQL_STATE;
        case 4: // ERROR_CODE
          return ERROR_CODE;
        case 5: // ERROR_MESSAGE
          return ERROR_MESSAGE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __ERRORCODE_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.OPERATION_STATE,_Fields.SQL_STATE,_Fields.ERROR_CODE,_Fields.ERROR_MESSAGE};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TStatus.class)));
    tmpMap.put(_Fields.OPERATION_STATE, new org.apache.thrift.meta_data.FieldMetaData("operationState", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TOperationState.class)));
    tmpMap.put(_Fields.SQL_STATE, new org.apache.thrift.meta_data.FieldMetaData("sqlState", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ERROR_CODE, new org.apache.thrift.meta_data.FieldMetaData("errorCode", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.ERROR_MESSAGE, new org.apache.thrift.meta_data.FieldMetaData("errorMessage", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TGetOperationStatusResp.class, metaDataMap);
  }

  public TGetOperationStatusResp() {
  }

  public TGetOperationStatusResp(
    TStatus status)
  {
    this();
    this.status = status;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TGetOperationStatusResp(TGetOperationStatusResp other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetStatus()) {
      this.status = new TStatus(other.status);
    }
    if (other.isSetOperationState()) {
      this.operationState = other.operationState;
    }
    if (other.isSetSqlState()) {
      this.sqlState = other.sqlState;
    }
    this.errorCode = other.errorCode;
    if (other.isSetErrorMessage()) {
      this.errorMessage = other.errorMessage;
    }
  }

  public TGetOperationStatusResp deepCopy() {
    return new TGetOperationStatusResp(this);
  }

  @Override
  public void clear() {
    this.status = null;
    this.operationState = null;
    this.sqlState = null;
    setErrorCodeIsSet(false);
    this.errorCode = 0;
    this.errorMessage = null;
  }

  public TStatus getStatus() {
    return this.status;
  }

  public void setStatus(TStatus status) {
    this.status = status;
  }

  public void unsetStatus() {
    this.status = null;
  }

  /** Returns true if field status is set (has been assigned a value) and false otherwise */
  public boolean isSetStatus() {
    return this.status != null;
  }

  public void setStatusIsSet(boolean value) {
    if (!value) {
      this.status = null;
    }
  }

  /**
   * 
   * @see TOperationState
   */
  public TOperationState getOperationState() {
    return this.operationState;
  }

  /**
   * 
   * @see TOperationState
   */
  public void setOperationState(TOperationState operationState) {
    this.operationState = operationState;
  }

  public void unsetOperationState() {
    this.operationState = null;
  }

  /** Returns true if field operationState is set (has been assigned a value) and false otherwise */
  public boolean isSetOperationState() {
    return this.operationState != null;
  }

  public void setOperationStateIsSet(boolean value) {
    if (!value) {
      this.operationState = null;
    }
  }

  public java.lang.String getSqlState() {
    return this.sqlState;
  }

  public void setSqlState(java.lang.String sqlState) {
    this.sqlState = sqlState;
  }

  public void unsetSqlState() {
    this.sqlState = null;
  }

  /** Returns true if field sqlState is set (has been assigned a value) and false otherwise */
  public boolean isSetSqlState() {
    return this.sqlState != null;
  }

  public void setSqlStateIsSet(boolean value) {
    if (!value) {
      this.sqlState = null;
    }
  }

  public int getErrorCode() {
    return this.errorCode;
  }

  public void setErrorCode(int errorCode) {
    this.errorCode = errorCode;
    setErrorCodeIsSet(true);
  }

  public void unsetErrorCode() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ERRORCODE_ISSET_ID);
  }

  /** Returns true if field errorCode is set (has been assigned a value) and false otherwise */
  public boolean isSetErrorCode() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ERRORCODE_ISSET_ID);
  }

  public void setErrorCodeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ERRORCODE_ISSET_ID, value);
  }

  public java.lang.String getErrorMessage() {
    return this.errorMessage;
  }

  public void setErrorMessage(java.lang.String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public void unsetErrorMessage() {
    this.errorMessage = null;
  }

  /** Returns true if field errorMessage is set (has been assigned a value) and false otherwise */
  public boolean isSetErrorMessage() {
    return this.errorMessage != null;
  }

  public void setErrorMessageIsSet(boolean value) {
    if (!value) {
      this.errorMessage = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((TStatus)value);
      }
      break;

    case OPERATION_STATE:
      if (value == null) {
        unsetOperationState();
      } else {
        setOperationState((TOperationState)value);
      }
      break;

    case SQL_STATE:
      if (value == null) {
        unsetSqlState();
      } else {
        setSqlState((java.lang.String)value);
      }
      break;

    case ERROR_CODE:
      if (value == null) {
        unsetErrorCode();
      } else {
        setErrorCode((java.lang.Integer)value);
      }
      break;

    case ERROR_MESSAGE:
      if (value == null) {
        unsetErrorMessage();
      } else {
        setErrorMessage((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case STATUS:
      return getStatus();

    case OPERATION_STATE:
      return getOperationState();

    case SQL_STATE:
      return getSqlState();

    case ERROR_CODE:
      return getErrorCode();

    case ERROR_MESSAGE:
      return getErrorMessage();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case STATUS:
      return isSetStatus();
    case OPERATION_STATE:
      return isSetOperationState();
    case SQL_STATE:
      return isSetSqlState();
    case ERROR_CODE:
      return isSetErrorCode();
    case ERROR_MESSAGE:
      return isSetErrorMessage();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TGetOperationStatusResp)
      return this.equals((TGetOperationStatusResp)that);
    return false;
  }

  public boolean equals(TGetOperationStatusResp that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_status = true && this.isSetStatus();
    boolean that_present_status = true && that.isSetStatus();
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (!this.status.equals(that.status))
        return false;
    }

    boolean this_present_operationState = true && this.isSetOperationState();
    boolean that_present_operationState = true && that.isSetOperationState();
    if (this_present_operationState || that_present_operationState) {
      if (!(this_present_operationState && that_present_operationState))
        return false;
      if (!this.operationState.equals(that.operationState))
        return false;
    }

    boolean this_present_sqlState = true && this.isSetSqlState();
    boolean that_present_sqlState = true && that.isSetSqlState();
    if (this_present_sqlState || that_present_sqlState) {
      if (!(this_present_sqlState && that_present_sqlState))
        return false;
      if (!this.sqlState.equals(that.sqlState))
        return false;
    }

    boolean this_present_errorCode = true && this.isSetErrorCode();
    boolean that_present_errorCode = true && that.isSetErrorCode();
    if (this_present_errorCode || that_present_errorCode) {
      if (!(this_present_errorCode && that_present_errorCode))
        return false;
      if (this.errorCode != that.errorCode)
        return false;
    }

    boolean this_present_errorMessage = true && this.isSetErrorMessage();
    boolean that_present_errorMessage = true && that.isSetErrorMessage();
    if (this_present_errorMessage || that_present_errorMessage) {
      if (!(this_present_errorMessage && that_present_errorMessage))
        return false;
      if (!this.errorMessage.equals(that.errorMessage))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetStatus()) ? 131071 : 524287);
    if (isSetStatus())
      hashCode = hashCode * 8191 + status.hashCode();

    hashCode = hashCode * 8191 + ((isSetOperationState()) ? 131071 : 524287);
    if (isSetOperationState())
      hashCode = hashCode * 8191 + operationState.getValue();

    hashCode = hashCode * 8191 + ((isSetSqlState()) ? 131071 : 524287);
    if (isSetSqlState())
      hashCode = hashCode * 8191 + sqlState.hashCode();

    hashCode = hashCode * 8191 + ((isSetErrorCode()) ? 131071 : 524287);
    if (isSetErrorCode())
      hashCode = hashCode * 8191 + errorCode;

    hashCode = hashCode * 8191 + ((isSetErrorMessage()) ? 131071 : 524287);
    if (isSetErrorMessage())
      hashCode = hashCode * 8191 + errorMessage.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TGetOperationStatusResp other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetStatus()).compareTo(other.isSetStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.status, other.status);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetOperationState()).compareTo(other.isSetOperationState());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOperationState()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.operationState, other.operationState);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetSqlState()).compareTo(other.isSetSqlState());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSqlState()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sqlState, other.sqlState);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetErrorCode()).compareTo(other.isSetErrorCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetErrorCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.errorCode, other.errorCode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetErrorMessage()).compareTo(other.isSetErrorMessage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetErrorMessage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.errorMessage, other.errorMessage);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TGetOperationStatusResp(");
    boolean first = true;

    sb.append("status:");
    if (this.status == null) {
      sb.append("null");
    } else {
      sb.append(this.status);
    }
    first = false;
    if (isSetOperationState()) {
      if (!first) sb.append(", ");
      sb.append("operationState:");
      if (this.operationState == null) {
        sb.append("null");
      } else {
        sb.append(this.operationState);
      }
      first = false;
    }
    if (isSetSqlState()) {
      if (!first) sb.append(", ");
      sb.append("sqlState:");
      if (this.sqlState == null) {
        sb.append("null");
      } else {
        sb.append(this.sqlState);
      }
      first = false;
    }
    if (isSetErrorCode()) {
      if (!first) sb.append(", ");
      sb.append("errorCode:");
      sb.append(this.errorCode);
      first = false;
    }
    if (isSetErrorMessage()) {
      if (!first) sb.append(", ");
      sb.append("errorMessage:");
      if (this.errorMessage == null) {
        sb.append("null");
      } else {
        sb.append(this.errorMessage);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetStatus()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'status' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
    if (status != null) {
      status.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TGetOperationStatusRespStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TGetOperationStatusRespStandardScheme getScheme() {
      return new TGetOperationStatusRespStandardScheme();
    }
  }

  private static class TGetOperationStatusRespStandardScheme extends org.apache.thrift.scheme.StandardScheme<TGetOperationStatusResp> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TGetOperationStatusResp struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.status = new TStatus();
              struct.status.read(iprot);
              struct.setStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // OPERATION_STATE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.operationState = org.apache.hive.service.cli.thrift.TOperationState.findByValue(iprot.readI32());
              struct.setOperationStateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SQL_STATE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.sqlState = iprot.readString();
              struct.setSqlStateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ERROR_CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.errorCode = iprot.readI32();
              struct.setErrorCodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // ERROR_MESSAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.errorMessage = iprot.readString();
              struct.setErrorMessageIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TGetOperationStatusResp struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.status != null) {
        oprot.writeFieldBegin(STATUS_FIELD_DESC);
        struct.status.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.operationState != null) {
        if (struct.isSetOperationState()) {
          oprot.writeFieldBegin(OPERATION_STATE_FIELD_DESC);
          oprot.writeI32(struct.operationState.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.sqlState != null) {
        if (struct.isSetSqlState()) {
          oprot.writeFieldBegin(SQL_STATE_FIELD_DESC);
          oprot.writeString(struct.sqlState);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetErrorCode()) {
        oprot.writeFieldBegin(ERROR_CODE_FIELD_DESC);
        oprot.writeI32(struct.errorCode);
        oprot.writeFieldEnd();
      }
      if (struct.errorMessage != null) {
        if (struct.isSetErrorMessage()) {
          oprot.writeFieldBegin(ERROR_MESSAGE_FIELD_DESC);
          oprot.writeString(struct.errorMessage);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TGetOperationStatusRespTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TGetOperationStatusRespTupleScheme getScheme() {
      return new TGetOperationStatusRespTupleScheme();
    }
  }

  private static class TGetOperationStatusRespTupleScheme extends org.apache.thrift.scheme.TupleScheme<TGetOperationStatusResp> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TGetOperationStatusResp struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.status.write(oprot);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetOperationState()) {
        optionals.set(0);
      }
      if (struct.isSetSqlState()) {
        optionals.set(1);
      }
      if (struct.isSetErrorCode()) {
        optionals.set(2);
      }
      if (struct.isSetErrorMessage()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetOperationState()) {
        oprot.writeI32(struct.operationState.getValue());
      }
      if (struct.isSetSqlState()) {
        oprot.writeString(struct.sqlState);
      }
      if (struct.isSetErrorCode()) {
        oprot.writeI32(struct.errorCode);
      }
      if (struct.isSetErrorMessage()) {
        oprot.writeString(struct.errorMessage);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TGetOperationStatusResp struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.status = new TStatus();
      struct.status.read(iprot);
      struct.setStatusIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.operationState = org.apache.hive.service.cli.thrift.TOperationState.findByValue(iprot.readI32());
        struct.setOperationStateIsSet(true);
      }
      if (incoming.get(1)) {
        struct.sqlState = iprot.readString();
        struct.setSqlStateIsSet(true);
      }
      if (incoming.get(2)) {
        struct.errorCode = iprot.readI32();
        struct.setErrorCodeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.errorMessage = iprot.readString();
        struct.setErrorMessageIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

