// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/struct.proto

package org.tensorflow.proto.framework;

public interface PairValueOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.PairValue)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string key = 1;</code>
   */
  java.lang.String getKey();
  /**
   * <code>string key = 1;</code>
   */
  com.google.protobuf.ByteString
      getKeyBytes();

  /**
   * <code>.tensorflow.StructuredValue value = 2;</code>
   */
  boolean hasValue();
  /**
   * <code>.tensorflow.StructuredValue value = 2;</code>
   */
  org.tensorflow.proto.framework.StructuredValue getValue();
  /**
   * <code>.tensorflow.StructuredValue value = 2;</code>
   */
  org.tensorflow.proto.framework.StructuredValueOrBuilder getValueOrBuilder();
}
