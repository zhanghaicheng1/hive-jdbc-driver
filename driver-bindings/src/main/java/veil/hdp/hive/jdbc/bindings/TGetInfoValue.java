/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package veil.hdp.hive.jdbc.bindings;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
public class TGetInfoValue extends org.apache.thrift.TUnion<TGetInfoValue, TGetInfoValue._Fields> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TGetInfoValue");
  private static final org.apache.thrift.protocol.TField STRING_VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("stringValue", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField SMALL_INT_VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("smallIntValue", org.apache.thrift.protocol.TType.I16, (short)2);
  private static final org.apache.thrift.protocol.TField INTEGER_BITMASK_FIELD_DESC = new org.apache.thrift.protocol.TField("integerBitmask", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField INTEGER_FLAG_FIELD_DESC = new org.apache.thrift.protocol.TField("integerFlag", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField BINARY_VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("binaryValue", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField LEN_VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("lenValue", org.apache.thrift.protocol.TType.I64, (short)6);

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STRING_VALUE((short)1, "stringValue"),
    SMALL_INT_VALUE((short)2, "smallIntValue"),
    INTEGER_BITMASK((short)3, "integerBitmask"),
    INTEGER_FLAG((short)4, "integerFlag"),
    BINARY_VALUE((short)5, "binaryValue"),
    LEN_VALUE((short)6, "lenValue");

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
        case 1: // STRING_VALUE
          return STRING_VALUE;
        case 2: // SMALL_INT_VALUE
          return SMALL_INT_VALUE;
        case 3: // INTEGER_BITMASK
          return INTEGER_BITMASK;
        case 4: // INTEGER_FLAG
          return INTEGER_FLAG;
        case 5: // BINARY_VALUE
          return BINARY_VALUE;
        case 6: // LEN_VALUE
          return LEN_VALUE;
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

  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STRING_VALUE, new org.apache.thrift.meta_data.FieldMetaData("stringValue", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SMALL_INT_VALUE, new org.apache.thrift.meta_data.FieldMetaData("smallIntValue", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    tmpMap.put(_Fields.INTEGER_BITMASK, new org.apache.thrift.meta_data.FieldMetaData("integerBitmask", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.INTEGER_FLAG, new org.apache.thrift.meta_data.FieldMetaData("integerFlag", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.BINARY_VALUE, new org.apache.thrift.meta_data.FieldMetaData("binaryValue", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.LEN_VALUE, new org.apache.thrift.meta_data.FieldMetaData("lenValue", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TGetInfoValue.class, metaDataMap);
  }

  public TGetInfoValue() {
    super();
  }

  public TGetInfoValue(_Fields setField, java.lang.Object value) {
    super(setField, value);
  }

  public TGetInfoValue(TGetInfoValue other) {
    super(other);
  }
  public TGetInfoValue deepCopy() {
    return new TGetInfoValue(this);
  }

  public static TGetInfoValue stringValue(java.lang.String value) {
    TGetInfoValue x = new TGetInfoValue();
    x.setStringValue(value);
    return x;
  }

  public static TGetInfoValue smallIntValue(short value) {
    TGetInfoValue x = new TGetInfoValue();
    x.setSmallIntValue(value);
    return x;
  }

  public static TGetInfoValue integerBitmask(int value) {
    TGetInfoValue x = new TGetInfoValue();
    x.setIntegerBitmask(value);
    return x;
  }

  public static TGetInfoValue integerFlag(int value) {
    TGetInfoValue x = new TGetInfoValue();
    x.setIntegerFlag(value);
    return x;
  }

  public static TGetInfoValue binaryValue(int value) {
    TGetInfoValue x = new TGetInfoValue();
    x.setBinaryValue(value);
    return x;
  }

  public static TGetInfoValue lenValue(long value) {
    TGetInfoValue x = new TGetInfoValue();
    x.setLenValue(value);
    return x;
  }


  @Override
  protected void checkType(_Fields setField, java.lang.Object value) throws java.lang.ClassCastException {
    switch (setField) {
      case STRING_VALUE:
        if (value instanceof java.lang.String) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type java.lang.String for field 'stringValue', but got " + value.getClass().getSimpleName());
      case SMALL_INT_VALUE:
        if (value instanceof java.lang.Short) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type java.lang.Short for field 'smallIntValue', but got " + value.getClass().getSimpleName());
      case INTEGER_BITMASK:
        if (value instanceof java.lang.Integer) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type java.lang.Integer for field 'integerBitmask', but got " + value.getClass().getSimpleName());
      case INTEGER_FLAG:
        if (value instanceof java.lang.Integer) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type java.lang.Integer for field 'integerFlag', but got " + value.getClass().getSimpleName());
      case BINARY_VALUE:
        if (value instanceof java.lang.Integer) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type java.lang.Integer for field 'binaryValue', but got " + value.getClass().getSimpleName());
      case LEN_VALUE:
        if (value instanceof java.lang.Long) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type java.lang.Long for field 'lenValue', but got " + value.getClass().getSimpleName());
      default:
        throw new java.lang.IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected java.lang.Object standardSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TField field) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(field.id);
    if (setField != null) {
      switch (setField) {
        case STRING_VALUE:
          if (field.type == STRING_VALUE_FIELD_DESC.type) {
            java.lang.String stringValue;
            stringValue = iprot.readString();
            return stringValue;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case SMALL_INT_VALUE:
          if (field.type == SMALL_INT_VALUE_FIELD_DESC.type) {
            java.lang.Short smallIntValue;
            smallIntValue = iprot.readI16();
            return smallIntValue;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case INTEGER_BITMASK:
          if (field.type == INTEGER_BITMASK_FIELD_DESC.type) {
            java.lang.Integer integerBitmask;
            integerBitmask = iprot.readI32();
            return integerBitmask;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case INTEGER_FLAG:
          if (field.type == INTEGER_FLAG_FIELD_DESC.type) {
            java.lang.Integer integerFlag;
            integerFlag = iprot.readI32();
            return integerFlag;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case BINARY_VALUE:
          if (field.type == BINARY_VALUE_FIELD_DESC.type) {
            java.lang.Integer binaryValue;
            binaryValue = iprot.readI32();
            return binaryValue;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case LEN_VALUE:
          if (field.type == LEN_VALUE_FIELD_DESC.type) {
            java.lang.Long lenValue;
            lenValue = iprot.readI64();
            return lenValue;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        default:
          throw new java.lang.IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      return null;
    }
  }

  @Override
  protected void standardSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    switch (setField_) {
      case STRING_VALUE:
        java.lang.String stringValue = (java.lang.String)value_;
        oprot.writeString(stringValue);
        return;
      case SMALL_INT_VALUE:
        java.lang.Short smallIntValue = (java.lang.Short)value_;
        oprot.writeI16(smallIntValue);
        return;
      case INTEGER_BITMASK:
        java.lang.Integer integerBitmask = (java.lang.Integer)value_;
        oprot.writeI32(integerBitmask);
        return;
      case INTEGER_FLAG:
        java.lang.Integer integerFlag = (java.lang.Integer)value_;
        oprot.writeI32(integerFlag);
        return;
      case BINARY_VALUE:
        java.lang.Integer binaryValue = (java.lang.Integer)value_;
        oprot.writeI32(binaryValue);
        return;
      case LEN_VALUE:
        java.lang.Long lenValue = (java.lang.Long)value_;
        oprot.writeI64(lenValue);
        return;
      default:
        throw new java.lang.IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected java.lang.Object tupleSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, short fieldID) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(fieldID);
    if (setField != null) {
      switch (setField) {
        case STRING_VALUE:
          java.lang.String stringValue;
          stringValue = iprot.readString();
          return stringValue;
        case SMALL_INT_VALUE:
          java.lang.Short smallIntValue;
          smallIntValue = iprot.readI16();
          return smallIntValue;
        case INTEGER_BITMASK:
          java.lang.Integer integerBitmask;
          integerBitmask = iprot.readI32();
          return integerBitmask;
        case INTEGER_FLAG:
          java.lang.Integer integerFlag;
          integerFlag = iprot.readI32();
          return integerFlag;
        case BINARY_VALUE:
          java.lang.Integer binaryValue;
          binaryValue = iprot.readI32();
          return binaryValue;
        case LEN_VALUE:
          java.lang.Long lenValue;
          lenValue = iprot.readI64();
          return lenValue;
        default:
          throw new java.lang.IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      throw new org.apache.thrift.protocol.TProtocolException("Couldn't find a field with field id " + fieldID);
    }
  }

  @Override
  protected void tupleSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    switch (setField_) {
      case STRING_VALUE:
        java.lang.String stringValue = (java.lang.String)value_;
        oprot.writeString(stringValue);
        return;
      case SMALL_INT_VALUE:
        java.lang.Short smallIntValue = (java.lang.Short)value_;
        oprot.writeI16(smallIntValue);
        return;
      case INTEGER_BITMASK:
        java.lang.Integer integerBitmask = (java.lang.Integer)value_;
        oprot.writeI32(integerBitmask);
        return;
      case INTEGER_FLAG:
        java.lang.Integer integerFlag = (java.lang.Integer)value_;
        oprot.writeI32(integerFlag);
        return;
      case BINARY_VALUE:
        java.lang.Integer binaryValue = (java.lang.Integer)value_;
        oprot.writeI32(binaryValue);
        return;
      case LEN_VALUE:
        java.lang.Long lenValue = (java.lang.Long)value_;
        oprot.writeI64(lenValue);
        return;
      default:
        throw new java.lang.IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TField getFieldDesc(_Fields setField) {
    switch (setField) {
      case STRING_VALUE:
        return STRING_VALUE_FIELD_DESC;
      case SMALL_INT_VALUE:
        return SMALL_INT_VALUE_FIELD_DESC;
      case INTEGER_BITMASK:
        return INTEGER_BITMASK_FIELD_DESC;
      case INTEGER_FLAG:
        return INTEGER_FLAG_FIELD_DESC;
      case BINARY_VALUE:
        return BINARY_VALUE_FIELD_DESC;
      case LEN_VALUE:
        return LEN_VALUE_FIELD_DESC;
      default:
        throw new java.lang.IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TStruct getStructDesc() {
    return STRUCT_DESC;
  }

  @Override
  protected _Fields enumForId(short id) {
    return _Fields.findByThriftIdOrThrow(id);
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }


  public java.lang.String getStringValue() {
    if (getSetField() == _Fields.STRING_VALUE) {
      return (java.lang.String)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'stringValue' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setStringValue(java.lang.String value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.STRING_VALUE;
    value_ = value;
  }

  public short getSmallIntValue() {
    if (getSetField() == _Fields.SMALL_INT_VALUE) {
      return (java.lang.Short)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'smallIntValue' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setSmallIntValue(short value) {
    setField_ = _Fields.SMALL_INT_VALUE;
    value_ = value;
  }

  public int getIntegerBitmask() {
    if (getSetField() == _Fields.INTEGER_BITMASK) {
      return (java.lang.Integer)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'integerBitmask' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setIntegerBitmask(int value) {
    setField_ = _Fields.INTEGER_BITMASK;
    value_ = value;
  }

  public int getIntegerFlag() {
    if (getSetField() == _Fields.INTEGER_FLAG) {
      return (java.lang.Integer)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'integerFlag' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setIntegerFlag(int value) {
    setField_ = _Fields.INTEGER_FLAG;
    value_ = value;
  }

  public int getBinaryValue() {
    if (getSetField() == _Fields.BINARY_VALUE) {
      return (java.lang.Integer)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'binaryValue' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setBinaryValue(int value) {
    setField_ = _Fields.BINARY_VALUE;
    value_ = value;
  }

  public long getLenValue() {
    if (getSetField() == _Fields.LEN_VALUE) {
      return (java.lang.Long)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'lenValue' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setLenValue(long value) {
    setField_ = _Fields.LEN_VALUE;
    value_ = value;
  }

  public boolean isSetStringValue() {
    return setField_ == _Fields.STRING_VALUE;
  }


  public boolean isSetSmallIntValue() {
    return setField_ == _Fields.SMALL_INT_VALUE;
  }


  public boolean isSetIntegerBitmask() {
    return setField_ == _Fields.INTEGER_BITMASK;
  }


  public boolean isSetIntegerFlag() {
    return setField_ == _Fields.INTEGER_FLAG;
  }


  public boolean isSetBinaryValue() {
    return setField_ == _Fields.BINARY_VALUE;
  }


  public boolean isSetLenValue() {
    return setField_ == _Fields.LEN_VALUE;
  }


  public boolean equals(java.lang.Object other) {
    if (other instanceof TGetInfoValue) {
      return equals((TGetInfoValue)other);
    } else {
      return false;
    }
  }

  public boolean equals(TGetInfoValue other) {
    return other != null && getSetField() == other.getSetField() && getFieldValue().equals(other.getFieldValue());
  }

  @Override
  public int compareTo(TGetInfoValue other) {
    int lastComparison = org.apache.thrift.TBaseHelper.compareTo(getSetField(), other.getSetField());
    if (lastComparison == 0) {
      return org.apache.thrift.TBaseHelper.compareTo(getFieldValue(), other.getFieldValue());
    }
    return lastComparison;
  }


  @Override
  public int hashCode() {
    java.util.List<java.lang.Object> list = new java.util.ArrayList<java.lang.Object>();
    list.add(this.getClass().getName());
    org.apache.thrift.TFieldIdEnum setField = getSetField();
    if (setField != null) {
      list.add(setField.getThriftFieldId());
      java.lang.Object value = getFieldValue();
      if (value instanceof org.apache.thrift.TEnum) {
        list.add(((org.apache.thrift.TEnum)getFieldValue()).getValue());
      } else {
        list.add(value);
      }
    }
    return list.hashCode();
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }


}
