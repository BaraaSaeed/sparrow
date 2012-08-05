/**
 * Autogenerated by Thrift Compiler (0.8.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package edu.berkeley.sparrow.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TSchedulingPref implements org.apache.thrift.TBase<TSchedulingPref, TSchedulingPref._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TSchedulingPref");

  private static final org.apache.thrift.protocol.TField PROBE_RATIO_FIELD_DESC = new org.apache.thrift.protocol.TField("probeRatio", org.apache.thrift.protocol.TType.I32, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TSchedulingPrefStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TSchedulingPrefTupleSchemeFactory());
  }

  public int probeRatio; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PROBE_RATIO((short)1, "probeRatio");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // PROBE_RATIO
          return PROBE_RATIO;
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
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __PROBERATIO_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PROBE_RATIO, new org.apache.thrift.meta_data.FieldMetaData("probeRatio", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TSchedulingPref.class, metaDataMap);
  }

  public TSchedulingPref() {
  }

  public TSchedulingPref(
    int probeRatio)
  {
    this();
    this.probeRatio = probeRatio;
    setProbeRatioIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TSchedulingPref(TSchedulingPref other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.probeRatio = other.probeRatio;
  }

  public TSchedulingPref deepCopy() {
    return new TSchedulingPref(this);
  }

  public void clear() {
    setProbeRatioIsSet(false);
    this.probeRatio = 0;
  }

  public int getProbeRatio() {
    return this.probeRatio;
  }

  public TSchedulingPref setProbeRatio(int probeRatio) {
    this.probeRatio = probeRatio;
    setProbeRatioIsSet(true);
    return this;
  }

  public void unsetProbeRatio() {
    __isset_bit_vector.clear(__PROBERATIO_ISSET_ID);
  }

  /** Returns true if field probeRatio is set (has been assigned a value) and false otherwise */
  public boolean isSetProbeRatio() {
    return __isset_bit_vector.get(__PROBERATIO_ISSET_ID);
  }

  public void setProbeRatioIsSet(boolean value) {
    __isset_bit_vector.set(__PROBERATIO_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PROBE_RATIO:
      if (value == null) {
        unsetProbeRatio();
      } else {
        setProbeRatio((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PROBE_RATIO:
      return Integer.valueOf(getProbeRatio());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PROBE_RATIO:
      return isSetProbeRatio();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TSchedulingPref)
      return this.equals((TSchedulingPref)that);
    return false;
  }

  public boolean equals(TSchedulingPref that) {
    if (that == null)
      return false;

    boolean this_present_probeRatio = true;
    boolean that_present_probeRatio = true;
    if (this_present_probeRatio || that_present_probeRatio) {
      if (!(this_present_probeRatio && that_present_probeRatio))
        return false;
      if (this.probeRatio != that.probeRatio)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(TSchedulingPref other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TSchedulingPref typedOther = (TSchedulingPref)other;

    lastComparison = Boolean.valueOf(isSetProbeRatio()).compareTo(typedOther.isSetProbeRatio());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProbeRatio()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.probeRatio, typedOther.probeRatio);
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
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TSchedulingPref(");
    boolean first = true;

    sb.append("probeRatio:");
    sb.append(this.probeRatio);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te.getMessage());
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te.getMessage());
    }
  }

  private static class TSchedulingPrefStandardSchemeFactory implements SchemeFactory {
    public TSchedulingPrefStandardScheme getScheme() {
      return new TSchedulingPrefStandardScheme();
    }
  }

  private static class TSchedulingPrefStandardScheme extends StandardScheme<TSchedulingPref> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TSchedulingPref struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PROBE_RATIO
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.probeRatio = iprot.readI32();
              struct.setProbeRatioIsSet(true);
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

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TSchedulingPref struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(PROBE_RATIO_FIELD_DESC);
      oprot.writeI32(struct.probeRatio);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TSchedulingPrefTupleSchemeFactory implements SchemeFactory {
    public TSchedulingPrefTupleScheme getScheme() {
      return new TSchedulingPrefTupleScheme();
    }
  }

  private static class TSchedulingPrefTupleScheme extends TupleScheme<TSchedulingPref> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TSchedulingPref struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetProbeRatio()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetProbeRatio()) {
        oprot.writeI32(struct.probeRatio);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TSchedulingPref struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.probeRatio = iprot.readI32();
        struct.setProbeRatioIsSet(true);
      }
    }
  }

}

