// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Employee.proto

package proto.employee;

/**
 * Protobuf type {@code proto.employee.Employee}
 */
public final class Employee extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.employee.Employee)
    EmployeeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Employee.newBuilder() to construct.
  private Employee(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Employee() {
    name_ = "";
    department_ = "";
    floorNumber_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Employee();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Employee(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 16: {

            employeeId_ = input.readInt32();
            break;
          }
          case 24: {

            buildingCode_ = input.readInt32();
            break;
          }
          case 32: {

            salary_ = input.readInt32();
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            department_ = s;
            break;
          }
          case 48: {
            int rawValue = input.readEnum();

            floorNumber_ = rawValue;
            break;
          }
          case 56: {

            cafteriaCode_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return proto.employee.EmployeeOuterClass.internal_static_proto_employee_Employee_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return proto.employee.EmployeeOuterClass.internal_static_proto_employee_Employee_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            proto.employee.Employee.class, proto.employee.Employee.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EMPLOYEE_ID_FIELD_NUMBER = 2;
  private int employeeId_;
  /**
   * <code>int32 employee_id = 2;</code>
   * @return The employeeId.
   */
  @java.lang.Override
  public int getEmployeeId() {
    return employeeId_;
  }

  public static final int BUILDING_CODE_FIELD_NUMBER = 3;
  private int buildingCode_;
  /**
   * <code>int32 building_code = 3;</code>
   * @return The buildingCode.
   */
  @java.lang.Override
  public int getBuildingCode() {
    return buildingCode_;
  }

  public static final int SALARY_FIELD_NUMBER = 4;
  private int salary_;
  /**
   * <code>int32 salary = 4;</code>
   * @return The salary.
   */
  @java.lang.Override
  public int getSalary() {
    return salary_;
  }

  public static final int DEPARTMENT_FIELD_NUMBER = 5;
  private volatile java.lang.Object department_;
  /**
   * <code>string department = 5;</code>
   * @return The department.
   */
  @java.lang.Override
  public java.lang.String getDepartment() {
    java.lang.Object ref = department_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      department_ = s;
      return s;
    }
  }
  /**
   * <code>string department = 5;</code>
   * @return The bytes for department.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDepartmentBytes() {
    java.lang.Object ref = department_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      department_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FLOOR_NUMBER_FIELD_NUMBER = 6;
  private int floorNumber_;
  /**
   * <code>.proto.employee.Floor floor_number = 6;</code>
   * @return The enum numeric value on the wire for floorNumber.
   */
  @java.lang.Override public int getFloorNumberValue() {
    return floorNumber_;
  }
  /**
   * <code>.proto.employee.Floor floor_number = 6;</code>
   * @return The floorNumber.
   */
  @java.lang.Override public proto.employee.Floor getFloorNumber() {
    @SuppressWarnings("deprecation")
    proto.employee.Floor result = proto.employee.Floor.valueOf(floorNumber_);
    return result == null ? proto.employee.Floor.UNRECOGNIZED : result;
  }

  public static final int CAFTERIA_CODE_FIELD_NUMBER = 7;
  private int cafteriaCode_;
  /**
   * <code>int32 cafteria_code = 7;</code>
   * @return The cafteriaCode.
   */
  @java.lang.Override
  public int getCafteriaCode() {
    return cafteriaCode_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (employeeId_ != 0) {
      output.writeInt32(2, employeeId_);
    }
    if (buildingCode_ != 0) {
      output.writeInt32(3, buildingCode_);
    }
    if (salary_ != 0) {
      output.writeInt32(4, salary_);
    }
    if (!getDepartmentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, department_);
    }
    if (floorNumber_ != proto.employee.Floor.UNKNOWN.getNumber()) {
      output.writeEnum(6, floorNumber_);
    }
    if (cafteriaCode_ != 0) {
      output.writeInt32(7, cafteriaCode_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (employeeId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, employeeId_);
    }
    if (buildingCode_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, buildingCode_);
    }
    if (salary_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, salary_);
    }
    if (!getDepartmentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, department_);
    }
    if (floorNumber_ != proto.employee.Floor.UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(6, floorNumber_);
    }
    if (cafteriaCode_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(7, cafteriaCode_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof proto.employee.Employee)) {
      return super.equals(obj);
    }
    proto.employee.Employee other = (proto.employee.Employee) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (getEmployeeId()
        != other.getEmployeeId()) return false;
    if (getBuildingCode()
        != other.getBuildingCode()) return false;
    if (getSalary()
        != other.getSalary()) return false;
    if (!getDepartment()
        .equals(other.getDepartment())) return false;
    if (floorNumber_ != other.floorNumber_) return false;
    if (getCafteriaCode()
        != other.getCafteriaCode()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + EMPLOYEE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getEmployeeId();
    hash = (37 * hash) + BUILDING_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getBuildingCode();
    hash = (37 * hash) + SALARY_FIELD_NUMBER;
    hash = (53 * hash) + getSalary();
    hash = (37 * hash) + DEPARTMENT_FIELD_NUMBER;
    hash = (53 * hash) + getDepartment().hashCode();
    hash = (37 * hash) + FLOOR_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + floorNumber_;
    hash = (37 * hash) + CAFTERIA_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getCafteriaCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static proto.employee.Employee parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.employee.Employee parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.employee.Employee parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.employee.Employee parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.employee.Employee parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.employee.Employee parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.employee.Employee parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.employee.Employee parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.employee.Employee parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static proto.employee.Employee parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.employee.Employee parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.employee.Employee parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(proto.employee.Employee prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code proto.employee.Employee}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.employee.Employee)
      proto.employee.EmployeeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proto.employee.EmployeeOuterClass.internal_static_proto_employee_Employee_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto.employee.EmployeeOuterClass.internal_static_proto_employee_Employee_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto.employee.Employee.class, proto.employee.Employee.Builder.class);
    }

    // Construct using proto.employee.Employee.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      name_ = "";

      employeeId_ = 0;

      buildingCode_ = 0;

      salary_ = 0;

      department_ = "";

      floorNumber_ = 0;

      cafteriaCode_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return proto.employee.EmployeeOuterClass.internal_static_proto_employee_Employee_descriptor;
    }

    @java.lang.Override
    public proto.employee.Employee getDefaultInstanceForType() {
      return proto.employee.Employee.getDefaultInstance();
    }

    @java.lang.Override
    public proto.employee.Employee build() {
      proto.employee.Employee result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public proto.employee.Employee buildPartial() {
      proto.employee.Employee result = new proto.employee.Employee(this);
      result.name_ = name_;
      result.employeeId_ = employeeId_;
      result.buildingCode_ = buildingCode_;
      result.salary_ = salary_;
      result.department_ = department_;
      result.floorNumber_ = floorNumber_;
      result.cafteriaCode_ = cafteriaCode_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof proto.employee.Employee) {
        return mergeFrom((proto.employee.Employee)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(proto.employee.Employee other) {
      if (other == proto.employee.Employee.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.getEmployeeId() != 0) {
        setEmployeeId(other.getEmployeeId());
      }
      if (other.getBuildingCode() != 0) {
        setBuildingCode(other.getBuildingCode());
      }
      if (other.getSalary() != 0) {
        setSalary(other.getSalary());
      }
      if (!other.getDepartment().isEmpty()) {
        department_ = other.department_;
        onChanged();
      }
      if (other.floorNumber_ != 0) {
        setFloorNumberValue(other.getFloorNumberValue());
      }
      if (other.getCafteriaCode() != 0) {
        setCafteriaCode(other.getCafteriaCode());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      proto.employee.Employee parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (proto.employee.Employee) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 1;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 1;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private int employeeId_ ;
    /**
     * <code>int32 employee_id = 2;</code>
     * @return The employeeId.
     */
    @java.lang.Override
    public int getEmployeeId() {
      return employeeId_;
    }
    /**
     * <code>int32 employee_id = 2;</code>
     * @param value The employeeId to set.
     * @return This builder for chaining.
     */
    public Builder setEmployeeId(int value) {
      
      employeeId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 employee_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEmployeeId() {
      
      employeeId_ = 0;
      onChanged();
      return this;
    }

    private int buildingCode_ ;
    /**
     * <code>int32 building_code = 3;</code>
     * @return The buildingCode.
     */
    @java.lang.Override
    public int getBuildingCode() {
      return buildingCode_;
    }
    /**
     * <code>int32 building_code = 3;</code>
     * @param value The buildingCode to set.
     * @return This builder for chaining.
     */
    public Builder setBuildingCode(int value) {
      
      buildingCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 building_code = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearBuildingCode() {
      
      buildingCode_ = 0;
      onChanged();
      return this;
    }

    private int salary_ ;
    /**
     * <code>int32 salary = 4;</code>
     * @return The salary.
     */
    @java.lang.Override
    public int getSalary() {
      return salary_;
    }
    /**
     * <code>int32 salary = 4;</code>
     * @param value The salary to set.
     * @return This builder for chaining.
     */
    public Builder setSalary(int value) {
      
      salary_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 salary = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearSalary() {
      
      salary_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object department_ = "";
    /**
     * <code>string department = 5;</code>
     * @return The department.
     */
    public java.lang.String getDepartment() {
      java.lang.Object ref = department_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        department_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string department = 5;</code>
     * @return The bytes for department.
     */
    public com.google.protobuf.ByteString
        getDepartmentBytes() {
      java.lang.Object ref = department_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        department_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string department = 5;</code>
     * @param value The department to set.
     * @return This builder for chaining.
     */
    public Builder setDepartment(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      department_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string department = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearDepartment() {
      
      department_ = getDefaultInstance().getDepartment();
      onChanged();
      return this;
    }
    /**
     * <code>string department = 5;</code>
     * @param value The bytes for department to set.
     * @return This builder for chaining.
     */
    public Builder setDepartmentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      department_ = value;
      onChanged();
      return this;
    }

    private int floorNumber_ = 0;
    /**
     * <code>.proto.employee.Floor floor_number = 6;</code>
     * @return The enum numeric value on the wire for floorNumber.
     */
    @java.lang.Override public int getFloorNumberValue() {
      return floorNumber_;
    }
    /**
     * <code>.proto.employee.Floor floor_number = 6;</code>
     * @param value The enum numeric value on the wire for floorNumber to set.
     * @return This builder for chaining.
     */
    public Builder setFloorNumberValue(int value) {
      
      floorNumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.proto.employee.Floor floor_number = 6;</code>
     * @return The floorNumber.
     */
    @java.lang.Override
    public proto.employee.Floor getFloorNumber() {
      @SuppressWarnings("deprecation")
      proto.employee.Floor result = proto.employee.Floor.valueOf(floorNumber_);
      return result == null ? proto.employee.Floor.UNRECOGNIZED : result;
    }
    /**
     * <code>.proto.employee.Floor floor_number = 6;</code>
     * @param value The floorNumber to set.
     * @return This builder for chaining.
     */
    public Builder setFloorNumber(proto.employee.Floor value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      floorNumber_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.proto.employee.Floor floor_number = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearFloorNumber() {
      
      floorNumber_ = 0;
      onChanged();
      return this;
    }

    private int cafteriaCode_ ;
    /**
     * <code>int32 cafteria_code = 7;</code>
     * @return The cafteriaCode.
     */
    @java.lang.Override
    public int getCafteriaCode() {
      return cafteriaCode_;
    }
    /**
     * <code>int32 cafteria_code = 7;</code>
     * @param value The cafteriaCode to set.
     * @return This builder for chaining.
     */
    public Builder setCafteriaCode(int value) {
      
      cafteriaCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 cafteria_code = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearCafteriaCode() {
      
      cafteriaCode_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:proto.employee.Employee)
  }

  // @@protoc_insertion_point(class_scope:proto.employee.Employee)
  private static final proto.employee.Employee DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new proto.employee.Employee();
  }

  public static proto.employee.Employee getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Employee>
      PARSER = new com.google.protobuf.AbstractParser<Employee>() {
    @java.lang.Override
    public Employee parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Employee(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Employee> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Employee> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public proto.employee.Employee getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

