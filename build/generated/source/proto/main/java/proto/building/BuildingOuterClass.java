// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Building.proto

package proto.building;

public final class BuildingOuterClass {
  private BuildingOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_building_Building_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_building_Building_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_building_BuildingList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_building_BuildingList_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016Building.proto\022\016proto.building\"q\n\010Buil" +
      "ding\022\025\n\rbuilding_code\030\001 \001(\005\022\024\n\014total_flo" +
      "ors\030\002 \001(\005\022!\n\031companies_in_the_building\030\003" +
      " \001(\005\022\025\n\rcafteria_code\030\004 \001(\005\";\n\014BuildingL" +
      "ist\022+\n\tbuildings\030\001 \003(\0132\030.proto.building." +
      "BuildingB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_proto_building_Building_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_proto_building_Building_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_building_Building_descriptor,
        new java.lang.String[] { "BuildingCode", "TotalFloors", "CompaniesInTheBuilding", "CafteriaCode", });
    internal_static_proto_building_BuildingList_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_proto_building_BuildingList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_building_BuildingList_descriptor,
        new java.lang.String[] { "Buildings", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
