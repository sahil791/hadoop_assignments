// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Building.proto

package proto.building;

/**
 * Protobuf type {@code proto.building.Building}
 */
public final class Building extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.building.Building)
    BuildingOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Building.newBuilder() to construct.
  private Building(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Building() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Building();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Building(
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
          case 8: {

            buildingCode_ = input.readInt32();
            break;
          }
          case 16: {

            totalFloors_ = input.readInt32();
            break;
          }
          case 24: {

            companiesInTheBuilding_ = input.readInt32();
            break;
          }
          case 32: {

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
    return proto.building.BuildingOuterClass.internal_static_proto_building_Building_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return proto.building.BuildingOuterClass.internal_static_proto_building_Building_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            proto.building.Building.class, proto.building.Building.Builder.class);
  }

  public static final int BUILDING_CODE_FIELD_NUMBER = 1;
  private int buildingCode_;
  /**
   * <code>int32 building_code = 1;</code>
   * @return The buildingCode.
   */
  @java.lang.Override
  public int getBuildingCode() {
    return buildingCode_;
  }

  public static final int TOTAL_FLOORS_FIELD_NUMBER = 2;
  private int totalFloors_;
  /**
   * <code>int32 total_floors = 2;</code>
   * @return The totalFloors.
   */
  @java.lang.Override
  public int getTotalFloors() {
    return totalFloors_;
  }

  public static final int COMPANIES_IN_THE_BUILDING_FIELD_NUMBER = 3;
  private int companiesInTheBuilding_;
  /**
   * <code>int32 companies_in_the_building = 3;</code>
   * @return The companiesInTheBuilding.
   */
  @java.lang.Override
  public int getCompaniesInTheBuilding() {
    return companiesInTheBuilding_;
  }

  public static final int CAFTERIA_CODE_FIELD_NUMBER = 4;
  private int cafteriaCode_;
  /**
   * <code>int32 cafteria_code = 4;</code>
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
    if (buildingCode_ != 0) {
      output.writeInt32(1, buildingCode_);
    }
    if (totalFloors_ != 0) {
      output.writeInt32(2, totalFloors_);
    }
    if (companiesInTheBuilding_ != 0) {
      output.writeInt32(3, companiesInTheBuilding_);
    }
    if (cafteriaCode_ != 0) {
      output.writeInt32(4, cafteriaCode_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (buildingCode_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, buildingCode_);
    }
    if (totalFloors_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, totalFloors_);
    }
    if (companiesInTheBuilding_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, companiesInTheBuilding_);
    }
    if (cafteriaCode_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, cafteriaCode_);
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
    if (!(obj instanceof proto.building.Building)) {
      return super.equals(obj);
    }
    proto.building.Building other = (proto.building.Building) obj;

    if (getBuildingCode()
        != other.getBuildingCode()) return false;
    if (getTotalFloors()
        != other.getTotalFloors()) return false;
    if (getCompaniesInTheBuilding()
        != other.getCompaniesInTheBuilding()) return false;
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
    hash = (37 * hash) + BUILDING_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getBuildingCode();
    hash = (37 * hash) + TOTAL_FLOORS_FIELD_NUMBER;
    hash = (53 * hash) + getTotalFloors();
    hash = (37 * hash) + COMPANIES_IN_THE_BUILDING_FIELD_NUMBER;
    hash = (53 * hash) + getCompaniesInTheBuilding();
    hash = (37 * hash) + CAFTERIA_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getCafteriaCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static proto.building.Building parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.building.Building parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.building.Building parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.building.Building parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.building.Building parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.building.Building parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.building.Building parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.building.Building parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.building.Building parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static proto.building.Building parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.building.Building parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.building.Building parseFrom(
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
  public static Builder newBuilder(proto.building.Building prototype) {
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
   * Protobuf type {@code proto.building.Building}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.building.Building)
      proto.building.BuildingOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proto.building.BuildingOuterClass.internal_static_proto_building_Building_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto.building.BuildingOuterClass.internal_static_proto_building_Building_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto.building.Building.class, proto.building.Building.Builder.class);
    }

    // Construct using proto.building.Building.newBuilder()
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
      buildingCode_ = 0;

      totalFloors_ = 0;

      companiesInTheBuilding_ = 0;

      cafteriaCode_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return proto.building.BuildingOuterClass.internal_static_proto_building_Building_descriptor;
    }

    @java.lang.Override
    public proto.building.Building getDefaultInstanceForType() {
      return proto.building.Building.getDefaultInstance();
    }

    @java.lang.Override
    public proto.building.Building build() {
      proto.building.Building result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public proto.building.Building buildPartial() {
      proto.building.Building result = new proto.building.Building(this);
      result.buildingCode_ = buildingCode_;
      result.totalFloors_ = totalFloors_;
      result.companiesInTheBuilding_ = companiesInTheBuilding_;
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
      if (other instanceof proto.building.Building) {
        return mergeFrom((proto.building.Building)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(proto.building.Building other) {
      if (other == proto.building.Building.getDefaultInstance()) return this;
      if (other.getBuildingCode() != 0) {
        setBuildingCode(other.getBuildingCode());
      }
      if (other.getTotalFloors() != 0) {
        setTotalFloors(other.getTotalFloors());
      }
      if (other.getCompaniesInTheBuilding() != 0) {
        setCompaniesInTheBuilding(other.getCompaniesInTheBuilding());
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
      proto.building.Building parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (proto.building.Building) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int buildingCode_ ;
    /**
     * <code>int32 building_code = 1;</code>
     * @return The buildingCode.
     */
    @java.lang.Override
    public int getBuildingCode() {
      return buildingCode_;
    }
    /**
     * <code>int32 building_code = 1;</code>
     * @param value The buildingCode to set.
     * @return This builder for chaining.
     */
    public Builder setBuildingCode(int value) {
      
      buildingCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 building_code = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearBuildingCode() {
      
      buildingCode_ = 0;
      onChanged();
      return this;
    }

    private int totalFloors_ ;
    /**
     * <code>int32 total_floors = 2;</code>
     * @return The totalFloors.
     */
    @java.lang.Override
    public int getTotalFloors() {
      return totalFloors_;
    }
    /**
     * <code>int32 total_floors = 2;</code>
     * @param value The totalFloors to set.
     * @return This builder for chaining.
     */
    public Builder setTotalFloors(int value) {
      
      totalFloors_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 total_floors = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTotalFloors() {
      
      totalFloors_ = 0;
      onChanged();
      return this;
    }

    private int companiesInTheBuilding_ ;
    /**
     * <code>int32 companies_in_the_building = 3;</code>
     * @return The companiesInTheBuilding.
     */
    @java.lang.Override
    public int getCompaniesInTheBuilding() {
      return companiesInTheBuilding_;
    }
    /**
     * <code>int32 companies_in_the_building = 3;</code>
     * @param value The companiesInTheBuilding to set.
     * @return This builder for chaining.
     */
    public Builder setCompaniesInTheBuilding(int value) {
      
      companiesInTheBuilding_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 companies_in_the_building = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearCompaniesInTheBuilding() {
      
      companiesInTheBuilding_ = 0;
      onChanged();
      return this;
    }

    private int cafteriaCode_ ;
    /**
     * <code>int32 cafteria_code = 4;</code>
     * @return The cafteriaCode.
     */
    @java.lang.Override
    public int getCafteriaCode() {
      return cafteriaCode_;
    }
    /**
     * <code>int32 cafteria_code = 4;</code>
     * @param value The cafteriaCode to set.
     * @return This builder for chaining.
     */
    public Builder setCafteriaCode(int value) {
      
      cafteriaCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 cafteria_code = 4;</code>
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


    // @@protoc_insertion_point(builder_scope:proto.building.Building)
  }

  // @@protoc_insertion_point(class_scope:proto.building.Building)
  private static final proto.building.Building DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new proto.building.Building();
  }

  public static proto.building.Building getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Building>
      PARSER = new com.google.protobuf.AbstractParser<Building>() {
    @java.lang.Override
    public Building parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Building(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Building> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Building> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public proto.building.Building getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

