/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hive.service.cli.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-03-30")
public class TExecuteStatementReq implements org.apache.thrift.TBase<TExecuteStatementReq, TExecuteStatementReq._Fields>, java.io.Serializable, Cloneable, Comparable<TExecuteStatementReq> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TExecuteStatementReq");

  private static final org.apache.thrift.protocol.TField SESSION_HANDLE_FIELD_DESC = new org.apache.thrift.protocol.TField("sessionHandle", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField STATEMENT_FIELD_DESC = new org.apache.thrift.protocol.TField("statement", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField CONF_OVERLAY_FIELD_DESC = new org.apache.thrift.protocol.TField("confOverlay", org.apache.thrift.protocol.TType.MAP, (short)3);
  private static final org.apache.thrift.protocol.TField RUN_ASYNC_FIELD_DESC = new org.apache.thrift.protocol.TField("runAsync", org.apache.thrift.protocol.TType.BOOL, (short)4);
  private static final org.apache.thrift.protocol.TField QUERY_TIMEOUT_FIELD_DESC = new org.apache.thrift.protocol.TField("queryTimeout", org.apache.thrift.protocol.TType.I64, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TExecuteStatementReqStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TExecuteStatementReqTupleSchemeFactory();

  private TSessionHandle sessionHandle; // required
  private java.lang.String statement; // required
  private java.util.Map<java.lang.String,java.lang.String> confOverlay; // optional
  private boolean runAsync; // optional
  private long queryTimeout; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SESSION_HANDLE((short)1, "sessionHandle"),
    STATEMENT((short)2, "statement"),
    CONF_OVERLAY((short)3, "confOverlay"),
    RUN_ASYNC((short)4, "runAsync"),
    QUERY_TIMEOUT((short)5, "queryTimeout");

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
        case 1: // SESSION_HANDLE
          return SESSION_HANDLE;
        case 2: // STATEMENT
          return STATEMENT;
        case 3: // CONF_OVERLAY
          return CONF_OVERLAY;
        case 4: // RUN_ASYNC
          return RUN_ASYNC;
        case 5: // QUERY_TIMEOUT
          return QUERY_TIMEOUT;
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
  private static final int __RUNASYNC_ISSET_ID = 0;
  private static final int __QUERYTIMEOUT_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.CONF_OVERLAY,_Fields.RUN_ASYNC,_Fields.QUERY_TIMEOUT};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SESSION_HANDLE, new org.apache.thrift.meta_data.FieldMetaData("sessionHandle", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TSessionHandle.class)));
    tmpMap.put(_Fields.STATEMENT, new org.apache.thrift.meta_data.FieldMetaData("statement", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CONF_OVERLAY, new org.apache.thrift.meta_data.FieldMetaData("confOverlay", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.RUN_ASYNC, new org.apache.thrift.meta_data.FieldMetaData("runAsync", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.QUERY_TIMEOUT, new org.apache.thrift.meta_data.FieldMetaData("queryTimeout", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TExecuteStatementReq.class, metaDataMap);
  }

  public TExecuteStatementReq() {
    this.runAsync = false;

    this.queryTimeout = 0L;

  }

  public TExecuteStatementReq(
    TSessionHandle sessionHandle,
    java.lang.String statement)
  {
    this();
    this.sessionHandle = sessionHandle;
    this.statement = statement;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TExecuteStatementReq(TExecuteStatementReq other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetSessionHandle()) {
      this.sessionHandle = new TSessionHandle(other.sessionHandle);
    }
    if (other.isSetStatement()) {
      this.statement = other.statement;
    }
    if (other.isSetConfOverlay()) {
      java.util.Map<java.lang.String,java.lang.String> __this__confOverlay = new java.util.HashMap<java.lang.String,java.lang.String>(other.confOverlay);
      this.confOverlay = __this__confOverlay;
    }
    this.runAsync = other.runAsync;
    this.queryTimeout = other.queryTimeout;
  }

  public TExecuteStatementReq deepCopy() {
    return new TExecuteStatementReq(this);
  }

  @Override
  public void clear() {
    this.sessionHandle = null;
    this.statement = null;
    this.confOverlay = null;
    this.runAsync = false;

    this.queryTimeout = 0L;

  }

  public TSessionHandle getSessionHandle() {
    return this.sessionHandle;
  }

  public void setSessionHandle(TSessionHandle sessionHandle) {
    this.sessionHandle = sessionHandle;
  }

  public void unsetSessionHandle() {
    this.sessionHandle = null;
  }

  /** Returns true if field sessionHandle is set (has been assigned a value) and false otherwise */
  public boolean isSetSessionHandle() {
    return this.sessionHandle != null;
  }

  public void setSessionHandleIsSet(boolean value) {
    if (!value) {
      this.sessionHandle = null;
    }
  }

  public java.lang.String getStatement() {
    return this.statement;
  }

  public void setStatement(java.lang.String statement) {
    this.statement = statement;
  }

  public void unsetStatement() {
    this.statement = null;
  }

  /** Returns true if field statement is set (has been assigned a value) and false otherwise */
  public boolean isSetStatement() {
    return this.statement != null;
  }

  public void setStatementIsSet(boolean value) {
    if (!value) {
      this.statement = null;
    }
  }

  public int getConfOverlaySize() {
    return (this.confOverlay == null) ? 0 : this.confOverlay.size();
  }

  public void putToConfOverlay(java.lang.String key, java.lang.String val) {
    if (this.confOverlay == null) {
      this.confOverlay = new java.util.HashMap<java.lang.String,java.lang.String>();
    }
    this.confOverlay.put(key, val);
  }

  public java.util.Map<java.lang.String,java.lang.String> getConfOverlay() {
    return this.confOverlay;
  }

  public void setConfOverlay(java.util.Map<java.lang.String,java.lang.String> confOverlay) {
    this.confOverlay = confOverlay;
  }

  public void unsetConfOverlay() {
    this.confOverlay = null;
  }

  /** Returns true if field confOverlay is set (has been assigned a value) and false otherwise */
  public boolean isSetConfOverlay() {
    return this.confOverlay != null;
  }

  public void setConfOverlayIsSet(boolean value) {
    if (!value) {
      this.confOverlay = null;
    }
  }

  public boolean isRunAsync() {
    return this.runAsync;
  }

  public void setRunAsync(boolean runAsync) {
    this.runAsync = runAsync;
    setRunAsyncIsSet(true);
  }

  public void unsetRunAsync() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __RUNASYNC_ISSET_ID);
  }

  /** Returns true if field runAsync is set (has been assigned a value) and false otherwise */
  public boolean isSetRunAsync() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __RUNASYNC_ISSET_ID);
  }

  public void setRunAsyncIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __RUNASYNC_ISSET_ID, value);
  }

  public long getQueryTimeout() {
    return this.queryTimeout;
  }

  public void setQueryTimeout(long queryTimeout) {
    this.queryTimeout = queryTimeout;
    setQueryTimeoutIsSet(true);
  }

  public void unsetQueryTimeout() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __QUERYTIMEOUT_ISSET_ID);
  }

  /** Returns true if field queryTimeout is set (has been assigned a value) and false otherwise */
  public boolean isSetQueryTimeout() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __QUERYTIMEOUT_ISSET_ID);
  }

  public void setQueryTimeoutIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __QUERYTIMEOUT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case SESSION_HANDLE:
      if (value == null) {
        unsetSessionHandle();
      } else {
        setSessionHandle((TSessionHandle)value);
      }
      break;

    case STATEMENT:
      if (value == null) {
        unsetStatement();
      } else {
        setStatement((java.lang.String)value);
      }
      break;

    case CONF_OVERLAY:
      if (value == null) {
        unsetConfOverlay();
      } else {
        setConfOverlay((java.util.Map<java.lang.String,java.lang.String>)value);
      }
      break;

    case RUN_ASYNC:
      if (value == null) {
        unsetRunAsync();
      } else {
        setRunAsync((java.lang.Boolean)value);
      }
      break;

    case QUERY_TIMEOUT:
      if (value == null) {
        unsetQueryTimeout();
      } else {
        setQueryTimeout((java.lang.Long)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case SESSION_HANDLE:
      return getSessionHandle();

    case STATEMENT:
      return getStatement();

    case CONF_OVERLAY:
      return getConfOverlay();

    case RUN_ASYNC:
      return isRunAsync();

    case QUERY_TIMEOUT:
      return getQueryTimeout();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case SESSION_HANDLE:
      return isSetSessionHandle();
    case STATEMENT:
      return isSetStatement();
    case CONF_OVERLAY:
      return isSetConfOverlay();
    case RUN_ASYNC:
      return isSetRunAsync();
    case QUERY_TIMEOUT:
      return isSetQueryTimeout();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TExecuteStatementReq)
      return this.equals((TExecuteStatementReq)that);
    return false;
  }

  public boolean equals(TExecuteStatementReq that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_sessionHandle = true && this.isSetSessionHandle();
    boolean that_present_sessionHandle = true && that.isSetSessionHandle();
    if (this_present_sessionHandle || that_present_sessionHandle) {
      if (!(this_present_sessionHandle && that_present_sessionHandle))
        return false;
      if (!this.sessionHandle.equals(that.sessionHandle))
        return false;
    }

    boolean this_present_statement = true && this.isSetStatement();
    boolean that_present_statement = true && that.isSetStatement();
    if (this_present_statement || that_present_statement) {
      if (!(this_present_statement && that_present_statement))
        return false;
      if (!this.statement.equals(that.statement))
        return false;
    }

    boolean this_present_confOverlay = true && this.isSetConfOverlay();
    boolean that_present_confOverlay = true && that.isSetConfOverlay();
    if (this_present_confOverlay || that_present_confOverlay) {
      if (!(this_present_confOverlay && that_present_confOverlay))
        return false;
      if (!this.confOverlay.equals(that.confOverlay))
        return false;
    }

    boolean this_present_runAsync = true && this.isSetRunAsync();
    boolean that_present_runAsync = true && that.isSetRunAsync();
    if (this_present_runAsync || that_present_runAsync) {
      if (!(this_present_runAsync && that_present_runAsync))
        return false;
      if (this.runAsync != that.runAsync)
        return false;
    }

    boolean this_present_queryTimeout = true && this.isSetQueryTimeout();
    boolean that_present_queryTimeout = true && that.isSetQueryTimeout();
    if (this_present_queryTimeout || that_present_queryTimeout) {
      if (!(this_present_queryTimeout && that_present_queryTimeout))
        return false;
      if (this.queryTimeout != that.queryTimeout)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetSessionHandle()) ? 131071 : 524287);
    if (isSetSessionHandle())
      hashCode = hashCode * 8191 + sessionHandle.hashCode();

    hashCode = hashCode * 8191 + ((isSetStatement()) ? 131071 : 524287);
    if (isSetStatement())
      hashCode = hashCode * 8191 + statement.hashCode();

    hashCode = hashCode * 8191 + ((isSetConfOverlay()) ? 131071 : 524287);
    if (isSetConfOverlay())
      hashCode = hashCode * 8191 + confOverlay.hashCode();

    hashCode = hashCode * 8191 + ((isSetRunAsync()) ? 131071 : 524287);
    if (isSetRunAsync())
      hashCode = hashCode * 8191 + ((runAsync) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetQueryTimeout()) ? 131071 : 524287);
    if (isSetQueryTimeout())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(queryTimeout);

    return hashCode;
  }

  @Override
  public int compareTo(TExecuteStatementReq other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetSessionHandle()).compareTo(other.isSetSessionHandle());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSessionHandle()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sessionHandle, other.sessionHandle);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetStatement()).compareTo(other.isSetStatement());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatement()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.statement, other.statement);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetConfOverlay()).compareTo(other.isSetConfOverlay());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetConfOverlay()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.confOverlay, other.confOverlay);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetRunAsync()).compareTo(other.isSetRunAsync());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRunAsync()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.runAsync, other.runAsync);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetQueryTimeout()).compareTo(other.isSetQueryTimeout());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQueryTimeout()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.queryTimeout, other.queryTimeout);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TExecuteStatementReq(");
    boolean first = true;

    sb.append("sessionHandle:");
    if (this.sessionHandle == null) {
      sb.append("null");
    } else {
      sb.append(this.sessionHandle);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("statement:");
    if (this.statement == null) {
      sb.append("null");
    } else {
      sb.append(this.statement);
    }
    first = false;
    if (isSetConfOverlay()) {
      if (!first) sb.append(", ");
      sb.append("confOverlay:");
      if (this.confOverlay == null) {
        sb.append("null");
      } else {
        sb.append(this.confOverlay);
      }
      first = false;
    }
    if (isSetRunAsync()) {
      if (!first) sb.append(", ");
      sb.append("runAsync:");
      sb.append(this.runAsync);
      first = false;
    }
    if (isSetQueryTimeout()) {
      if (!first) sb.append(", ");
      sb.append("queryTimeout:");
      sb.append(this.queryTimeout);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetSessionHandle()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'sessionHandle' is unset! Struct:" + toString());
    }

    if (!isSetStatement()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'statement' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
    if (sessionHandle != null) {
      sessionHandle.validate();
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

  private static class TExecuteStatementReqStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TExecuteStatementReqStandardScheme getScheme() {
      return new TExecuteStatementReqStandardScheme();
    }
  }

  private static class TExecuteStatementReqStandardScheme extends org.apache.thrift.scheme.StandardScheme<TExecuteStatementReq> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TExecuteStatementReq struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SESSION_HANDLE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.sessionHandle = new TSessionHandle();
              struct.sessionHandle.read(iprot);
              struct.setSessionHandleIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // STATEMENT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.statement = iprot.readString();
              struct.setStatementIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CONF_OVERLAY
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map162 = iprot.readMapBegin();
                struct.confOverlay = new java.util.HashMap<java.lang.String,java.lang.String>(2*_map162.size);
                java.lang.String _key163;
                java.lang.String _val164;
                for (int _i165 = 0; _i165 < _map162.size; ++_i165)
                {
                  _key163 = iprot.readString();
                  _val164 = iprot.readString();
                  struct.confOverlay.put(_key163, _val164);
                }
                iprot.readMapEnd();
              }
              struct.setConfOverlayIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // RUN_ASYNC
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.runAsync = iprot.readBool();
              struct.setRunAsyncIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // QUERY_TIMEOUT
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.queryTimeout = iprot.readI64();
              struct.setQueryTimeoutIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TExecuteStatementReq struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.sessionHandle != null) {
        oprot.writeFieldBegin(SESSION_HANDLE_FIELD_DESC);
        struct.sessionHandle.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.statement != null) {
        oprot.writeFieldBegin(STATEMENT_FIELD_DESC);
        oprot.writeString(struct.statement);
        oprot.writeFieldEnd();
      }
      if (struct.confOverlay != null) {
        if (struct.isSetConfOverlay()) {
          oprot.writeFieldBegin(CONF_OVERLAY_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.confOverlay.size()));
            for (java.util.Map.Entry<java.lang.String, java.lang.String> _iter166 : struct.confOverlay.entrySet())
            {
              oprot.writeString(_iter166.getKey());
              oprot.writeString(_iter166.getValue());
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetRunAsync()) {
        oprot.writeFieldBegin(RUN_ASYNC_FIELD_DESC);
        oprot.writeBool(struct.runAsync);
        oprot.writeFieldEnd();
      }
      if (struct.isSetQueryTimeout()) {
        oprot.writeFieldBegin(QUERY_TIMEOUT_FIELD_DESC);
        oprot.writeI64(struct.queryTimeout);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TExecuteStatementReqTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TExecuteStatementReqTupleScheme getScheme() {
      return new TExecuteStatementReqTupleScheme();
    }
  }

  private static class TExecuteStatementReqTupleScheme extends org.apache.thrift.scheme.TupleScheme<TExecuteStatementReq> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TExecuteStatementReq struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.sessionHandle.write(oprot);
      oprot.writeString(struct.statement);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetConfOverlay()) {
        optionals.set(0);
      }
      if (struct.isSetRunAsync()) {
        optionals.set(1);
      }
      if (struct.isSetQueryTimeout()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetConfOverlay()) {
        {
          oprot.writeI32(struct.confOverlay.size());
          for (java.util.Map.Entry<java.lang.String, java.lang.String> _iter167 : struct.confOverlay.entrySet())
          {
            oprot.writeString(_iter167.getKey());
            oprot.writeString(_iter167.getValue());
          }
        }
      }
      if (struct.isSetRunAsync()) {
        oprot.writeBool(struct.runAsync);
      }
      if (struct.isSetQueryTimeout()) {
        oprot.writeI64(struct.queryTimeout);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TExecuteStatementReq struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.sessionHandle = new TSessionHandle();
      struct.sessionHandle.read(iprot);
      struct.setSessionHandleIsSet(true);
      struct.statement = iprot.readString();
      struct.setStatementIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TMap _map168 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.confOverlay = new java.util.HashMap<java.lang.String,java.lang.String>(2*_map168.size);
          java.lang.String _key169;
          java.lang.String _val170;
          for (int _i171 = 0; _i171 < _map168.size; ++_i171)
          {
            _key169 = iprot.readString();
            _val170 = iprot.readString();
            struct.confOverlay.put(_key169, _val170);
          }
        }
        struct.setConfOverlayIsSet(true);
      }
      if (incoming.get(1)) {
        struct.runAsync = iprot.readBool();
        struct.setRunAsyncIsSet(true);
      }
      if (incoming.get(2)) {
        struct.queryTimeout = iprot.readI64();
        struct.setQueryTimeoutIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

