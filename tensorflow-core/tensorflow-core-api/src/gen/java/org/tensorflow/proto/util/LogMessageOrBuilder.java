// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/util/event.proto

package org.tensorflow.proto.util;

public interface LogMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.LogMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.tensorflow.LogMessage.Level level = 1;</code>
   */
  int getLevelValue();
  /**
   * <code>.tensorflow.LogMessage.Level level = 1;</code>
   */
  org.tensorflow.proto.util.LogMessage.Level getLevel();

  /**
   * <code>string message = 2;</code>
   */
  java.lang.String getMessage();
  /**
   * <code>string message = 2;</code>
   */
  com.google.protobuf.ByteString
      getMessageBytes();
}
