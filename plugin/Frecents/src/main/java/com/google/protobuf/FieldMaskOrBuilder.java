// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: google/protobuf/field_mask.proto
// Protobuf Java Version: 4.28.3

package com.google.protobuf;

public interface FieldMaskOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.protobuf.FieldMask)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>repeated string paths = 1 [json_name = "paths"];</code>
   * @return A list containing the paths.
   */
  java.util.List<java.lang.String>
      getPathsList();
  /**
   * <code>repeated string paths = 1 [json_name = "paths"];</code>
   * @return The count of paths.
   */
  int getPathsCount();
  /**
   * <code>repeated string paths = 1 [json_name = "paths"];</code>
   * @param index The index of the element to return.
   * @return The paths at the given index.
   */
  java.lang.String getPaths(int index);
  /**
   * <code>repeated string paths = 1 [json_name = "paths"];</code>
   * @param index The index of the element to return.
   * @return The paths at the given index.
   */
  com.google.protobuf.ByteString
      getPathsBytes(int index);
}
