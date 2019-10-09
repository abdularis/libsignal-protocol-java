// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FingerprintProtocol.proto

package org.whispersystems.libsignal.fingerprint;

public final class FingerprintProtos {
  private FingerprintProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface LogicalFingerprintOrBuilder extends
      // @@protoc_insertion_point(interface_extends:textsecure.LogicalFingerprint)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     *  optional bytes identifier = 2;
     * </pre>
     *
     * <code>optional bytes content = 1;</code>
     */
    boolean hasContent();
    /**
     * <pre>
     *  optional bytes identifier = 2;
     * </pre>
     *
     * <code>optional bytes content = 1;</code>
     */
    com.google.protobuf.ByteString getContent();
  }
  /**
   * Protobuf type {@code textsecure.LogicalFingerprint}
   */
  public  static final class LogicalFingerprint extends
      com.google.protobuf.GeneratedMessageLite<
          LogicalFingerprint, LogicalFingerprint.Builder> implements
      // @@protoc_insertion_point(message_implements:textsecure.LogicalFingerprint)
      LogicalFingerprintOrBuilder {
    private LogicalFingerprint() {
      content_ = com.google.protobuf.ByteString.EMPTY;
    }
    private int bitField0_;
    public static final int CONTENT_FIELD_NUMBER = 1;
    private com.google.protobuf.ByteString content_;
    /**
     * <pre>
     *  optional bytes identifier = 2;
     * </pre>
     *
     * <code>optional bytes content = 1;</code>
     */
    public boolean hasContent() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <pre>
     *  optional bytes identifier = 2;
     * </pre>
     *
     * <code>optional bytes content = 1;</code>
     */
    public com.google.protobuf.ByteString getContent() {
      return content_;
    }
    /**
     * <pre>
     *  optional bytes identifier = 2;
     * </pre>
     *
     * <code>optional bytes content = 1;</code>
     */
    private void setContent(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      content_ = value;
    }
    /**
     * <pre>
     *  optional bytes identifier = 2;
     * </pre>
     *
     * <code>optional bytes content = 1;</code>
     */
    private void clearContent() {
      bitField0_ = (bitField0_ & ~0x00000001);
      content_ = getDefaultInstance().getContent();
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, content_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, content_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    public static org.whispersystems.libsignal.fingerprint.FingerprintProtos.LogicalFingerprint parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.whispersystems.libsignal.fingerprint.FingerprintProtos.LogicalFingerprint parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.whispersystems.libsignal.fingerprint.FingerprintProtos.LogicalFingerprint parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.whispersystems.libsignal.fingerprint.FingerprintProtos.LogicalFingerprint parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.whispersystems.libsignal.fingerprint.FingerprintProtos.LogicalFingerprint parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static org.whispersystems.libsignal.fingerprint.FingerprintProtos.LogicalFingerprint parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static org.whispersystems.libsignal.fingerprint.FingerprintProtos.LogicalFingerprint parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static org.whispersystems.libsignal.fingerprint.FingerprintProtos.LogicalFingerprint parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static org.whispersystems.libsignal.fingerprint.FingerprintProtos.LogicalFingerprint parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static org.whispersystems.libsignal.fingerprint.FingerprintProtos.LogicalFingerprint parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(org.whispersystems.libsignal.fingerprint.FingerprintProtos.LogicalFingerprint prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code textsecure.LogicalFingerprint}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          org.whispersystems.libsignal.fingerprint.FingerprintProtos.LogicalFingerprint, Builder> implements
        // @@protoc_insertion_point(builder_implements:textsecure.LogicalFingerprint)
        org.whispersystems.libsignal.fingerprint.FingerprintProtos.LogicalFingerprintOrBuilder {
      // Construct using org.whispersystems.libsignal.fingerprint.FingerprintProtos.LogicalFingerprint.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <pre>
       *  optional bytes identifier = 2;
       * </pre>
       *
       * <code>optional bytes content = 1;</code>
       */
      public boolean hasContent() {
        return instance.hasContent();
      }
      /**
       * <pre>
       *  optional bytes identifier = 2;
       * </pre>
       *
       * <code>optional bytes content = 1;</code>
       */
      public com.google.protobuf.ByteString getContent() {
        return instance.getContent();
      }
      /**
       * <pre>
       *  optional bytes identifier = 2;
       * </pre>
       *
       * <code>optional bytes content = 1;</code>
       */
      public Builder setContent(com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setContent(value);
        return this;
      }
      /**
       * <pre>
       *  optional bytes identifier = 2;
       * </pre>
       *
       * <code>optional bytes content = 1;</code>
       */
      public Builder clearContent() {
        copyOnWrite();
        instance.clearContent();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:textsecure.LogicalFingerprint)
    }
    protected final Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new org.whispersystems.libsignal.fingerprint.FingerprintProtos.LogicalFingerprint();
        }
        case IS_INITIALIZED: {
          return DEFAULT_INSTANCE;
        }
        case MAKE_IMMUTABLE: {
          return null;
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case VISIT: {
          Visitor visitor = (Visitor) arg0;
          org.whispersystems.libsignal.fingerprint.FingerprintProtos.LogicalFingerprint other = (org.whispersystems.libsignal.fingerprint.FingerprintProtos.LogicalFingerprint) arg1;
          content_ = visitor.visitByteString(
              hasContent(), content_,
              other.hasContent(), other.content_);
          if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
              .INSTANCE) {
            bitField0_ |= other.bitField0_;
          }
          return this;
        }
        case MERGE_FROM_STREAM: {
          com.google.protobuf.CodedInputStream input =
              (com.google.protobuf.CodedInputStream) arg0;
          com.google.protobuf.ExtensionRegistryLite extensionRegistry =
              (com.google.protobuf.ExtensionRegistryLite) arg1;
          try {
            boolean done = false;
            while (!done) {
              int tag = input.readTag();
              switch (tag) {
                case 0:
                  done = true;
                  break;
                default: {
                  if (!parseUnknownField(tag, input)) {
                    done = true;
                  }
                  break;
                }
                case 10: {
                  bitField0_ |= 0x00000001;
                  content_ = input.readBytes();
                  break;
                }
              }
            }
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw new RuntimeException(e.setUnfinishedMessage(this));
          } catch (java.io.IOException e) {
            throw new RuntimeException(
                new com.google.protobuf.InvalidProtocolBufferException(
                    e.getMessage()).setUnfinishedMessage(this));
          } finally {
          }
        }
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          if (PARSER == null) {    synchronized (org.whispersystems.libsignal.fingerprint.FingerprintProtos.LogicalFingerprint.class) {
              if (PARSER == null) {
                PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
              }
            }
          }
          return PARSER;
        }
      }
      throw new UnsupportedOperationException();
    }


    // @@protoc_insertion_point(class_scope:textsecure.LogicalFingerprint)
    private static final org.whispersystems.libsignal.fingerprint.FingerprintProtos.LogicalFingerprint DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new LogicalFingerprint();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static org.whispersystems.libsignal.fingerprint.FingerprintProtos.LogicalFingerprint getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<LogicalFingerprint> PARSER;

    public static com.google.protobuf.Parser<LogicalFingerprint> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }

  public interface CombinedFingerprintsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:textsecure.CombinedFingerprints)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>optional uint32 version = 1;</code>
     */
    boolean hasVersion();
    /**
     * <code>optional uint32 version = 1;</code>
     */
    int getVersion();

    /**
     * <code>optional .textsecure.LogicalFingerprint localFingerprint = 2;</code>
     */
    boolean hasLocalFingerprint();
    /**
     * <code>optional .textsecure.LogicalFingerprint localFingerprint = 2;</code>
     */
    org.whispersystems.libsignal.fingerprint.FingerprintProtos.LogicalFingerprint getLocalFingerprint();

    /**
     * <code>optional .textsecure.LogicalFingerprint remoteFingerprint = 3;</code>
     */
    boolean hasRemoteFingerprint();
    /**
     * <code>optional .textsecure.LogicalFingerprint remoteFingerprint = 3;</code>
     */
    org.whispersystems.libsignal.fingerprint.FingerprintProtos.LogicalFingerprint getRemoteFingerprint();
  }
  /**
   * Protobuf type {@code textsecure.CombinedFingerprints}
   */
  public  static final class CombinedFingerprints extends
      com.google.protobuf.GeneratedMessageLite<
          CombinedFingerprints, CombinedFingerprints.Builder> implements
      // @@protoc_insertion_point(message_implements:textsecure.CombinedFingerprints)
      CombinedFingerprintsOrBuilder {
    private CombinedFingerprints() {
    }
    private int bitField0_;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int version_;
    /**
     * <code>optional uint32 version = 1;</code>
     */
    public boolean hasVersion() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional uint32 version = 1;</code>
     */
    public int getVersion() {
      return version_;
    }
    /**
     * <code>optional uint32 version = 1;</code>
     */
    private void setVersion(int value) {
      bitField0_ |= 0x00000001;
      version_ = value;
    }
    /**
     * <code>optional uint32 version = 1;</code>
     */
    private void clearVersion() {
      bitField0_ = (bitField0_ & ~0x00000001);
      version_ = 0;
    }

    public static final int LOCALFINGERPRINT_FIELD_NUMBER = 2;
    private org.whispersystems.libsignal.fingerprint.FingerprintProtos.LogicalFingerprint localFingerprint_;
    /**
     * <code>optional .textsecure.LogicalFingerprint localFingerprint = 2;</code>
     */
    public boolean hasLocalFingerprint() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional .textsecure.LogicalFingerprint localFingerprint = 2;</code>
     */
    public org.whispersystems.libsignal.fingerprint.FingerprintProtos.LogicalFingerprint getLocalFingerprint() {
      return localFingerprint_ == null ? org.whispersystems.libsignal.fingerprint.FingerprintProtos.LogicalFingerprint.getDefaultInstance() : localFingerprint_;
    }
    /**
     * <code>optional .textsecure.LogicalFingerprint localFingerprint = 2;</code>
     */
    private void setLocalFingerprint(org.whispersystems.libsignal.fingerprint.FingerprintProtos.LogicalFingerprint value) {
      if (value == null) {
        throw new NullPointerException();
      }
      localFingerprint_ = value;
      bitField0_ |= 0x00000002;
      }
    /**
     * <code>optional .textsecure.LogicalFingerprint localFingerprint = 2;</code>
     */
    private void setLocalFingerprint(
        org.whispersystems.libsignal.fingerprint.FingerprintProtos.LogicalFingerprint.Builder builderForValue) {
      localFingerprint_ = builderForValue.build();
      bitField0_ |= 0x00000002;
    }
    /**
     * <code>optional .textsecure.LogicalFingerprint localFingerprint = 2;</code>
     */
    private void mergeLocalFingerprint(org.whispersystems.libsignal.fingerprint.FingerprintProtos.LogicalFingerprint value) {
      if (localFingerprint_ != null &&
          localFingerprint_ != org.whispersystems.libsignal.fingerprint.FingerprintProtos.LogicalFingerprint.getDefaultInstance()) {
        localFingerprint_ =
          org.whispersystems.libsignal.fingerprint.FingerprintProtos.LogicalFingerprint.newBuilder(localFingerprint_).mergeFrom(value).buildPartial();
      } else {
        localFingerprint_ = value;
      }
      bitField0_ |= 0x00000002;
    }
    /**
     * <code>optional .textsecure.LogicalFingerprint localFingerprint = 2;</code>
     */
    private void clearLocalFingerprint() {  localFingerprint_ = null;
      bitField0_ = (bitField0_ & ~0x00000002);
    }

    public static final int REMOTEFINGERPRINT_FIELD_NUMBER = 3;
    private org.whispersystems.libsignal.fingerprint.FingerprintProtos.LogicalFingerprint remoteFingerprint_;
    /**
     * <code>optional .textsecure.LogicalFingerprint remoteFingerprint = 3;</code>
     */
    public boolean hasRemoteFingerprint() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional .textsecure.LogicalFingerprint remoteFingerprint = 3;</code>
     */
    public org.whispersystems.libsignal.fingerprint.FingerprintProtos.LogicalFingerprint getRemoteFingerprint() {
      return remoteFingerprint_ == null ? org.whispersystems.libsignal.fingerprint.FingerprintProtos.LogicalFingerprint.getDefaultInstance() : remoteFingerprint_;
    }
    /**
     * <code>optional .textsecure.LogicalFingerprint remoteFingerprint = 3;</code>
     */
    private void setRemoteFingerprint(org.whispersystems.libsignal.fingerprint.FingerprintProtos.LogicalFingerprint value) {
      if (value == null) {
        throw new NullPointerException();
      }
      remoteFingerprint_ = value;
      bitField0_ |= 0x00000004;
      }
    /**
     * <code>optional .textsecure.LogicalFingerprint remoteFingerprint = 3;</code>
     */
    private void setRemoteFingerprint(
        org.whispersystems.libsignal.fingerprint.FingerprintProtos.LogicalFingerprint.Builder builderForValue) {
      remoteFingerprint_ = builderForValue.build();
      bitField0_ |= 0x00000004;
    }
    /**
     * <code>optional .textsecure.LogicalFingerprint remoteFingerprint = 3;</code>
     */
    private void mergeRemoteFingerprint(org.whispersystems.libsignal.fingerprint.FingerprintProtos.LogicalFingerprint value) {
      if (remoteFingerprint_ != null &&
          remoteFingerprint_ != org.whispersystems.libsignal.fingerprint.FingerprintProtos.LogicalFingerprint.getDefaultInstance()) {
        remoteFingerprint_ =
          org.whispersystems.libsignal.fingerprint.FingerprintProtos.LogicalFingerprint.newBuilder(remoteFingerprint_).mergeFrom(value).buildPartial();
      } else {
        remoteFingerprint_ = value;
      }
      bitField0_ |= 0x00000004;
    }
    /**
     * <code>optional .textsecure.LogicalFingerprint remoteFingerprint = 3;</code>
     */
    private void clearRemoteFingerprint() {  remoteFingerprint_ = null;
      bitField0_ = (bitField0_ & ~0x00000004);
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeUInt32(1, version_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, getLocalFingerprint());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(3, getRemoteFingerprint());
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, version_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getLocalFingerprint());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getRemoteFingerprint());
      }
      size += unknownFields.getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    public static org.whispersystems.libsignal.fingerprint.FingerprintProtos.CombinedFingerprints parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.whispersystems.libsignal.fingerprint.FingerprintProtos.CombinedFingerprints parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.whispersystems.libsignal.fingerprint.FingerprintProtos.CombinedFingerprints parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.whispersystems.libsignal.fingerprint.FingerprintProtos.CombinedFingerprints parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.whispersystems.libsignal.fingerprint.FingerprintProtos.CombinedFingerprints parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static org.whispersystems.libsignal.fingerprint.FingerprintProtos.CombinedFingerprints parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static org.whispersystems.libsignal.fingerprint.FingerprintProtos.CombinedFingerprints parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static org.whispersystems.libsignal.fingerprint.FingerprintProtos.CombinedFingerprints parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static org.whispersystems.libsignal.fingerprint.FingerprintProtos.CombinedFingerprints parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static org.whispersystems.libsignal.fingerprint.FingerprintProtos.CombinedFingerprints parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(org.whispersystems.libsignal.fingerprint.FingerprintProtos.CombinedFingerprints prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code textsecure.CombinedFingerprints}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          org.whispersystems.libsignal.fingerprint.FingerprintProtos.CombinedFingerprints, Builder> implements
        // @@protoc_insertion_point(builder_implements:textsecure.CombinedFingerprints)
        org.whispersystems.libsignal.fingerprint.FingerprintProtos.CombinedFingerprintsOrBuilder {
      // Construct using org.whispersystems.libsignal.fingerprint.FingerprintProtos.CombinedFingerprints.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <code>optional uint32 version = 1;</code>
       */
      public boolean hasVersion() {
        return instance.hasVersion();
      }
      /**
       * <code>optional uint32 version = 1;</code>
       */
      public int getVersion() {
        return instance.getVersion();
      }
      /**
       * <code>optional uint32 version = 1;</code>
       */
      public Builder setVersion(int value) {
        copyOnWrite();
        instance.setVersion(value);
        return this;
      }
      /**
       * <code>optional uint32 version = 1;</code>
       */
      public Builder clearVersion() {
        copyOnWrite();
        instance.clearVersion();
        return this;
      }

      /**
       * <code>optional .textsecure.LogicalFingerprint localFingerprint = 2;</code>
       */
      public boolean hasLocalFingerprint() {
        return instance.hasLocalFingerprint();
      }
      /**
       * <code>optional .textsecure.LogicalFingerprint localFingerprint = 2;</code>
       */
      public org.whispersystems.libsignal.fingerprint.FingerprintProtos.LogicalFingerprint getLocalFingerprint() {
        return instance.getLocalFingerprint();
      }
      /**
       * <code>optional .textsecure.LogicalFingerprint localFingerprint = 2;</code>
       */
      public Builder setLocalFingerprint(org.whispersystems.libsignal.fingerprint.FingerprintProtos.LogicalFingerprint value) {
        copyOnWrite();
        instance.setLocalFingerprint(value);
        return this;
        }
      /**
       * <code>optional .textsecure.LogicalFingerprint localFingerprint = 2;</code>
       */
      public Builder setLocalFingerprint(
          org.whispersystems.libsignal.fingerprint.FingerprintProtos.LogicalFingerprint.Builder builderForValue) {
        copyOnWrite();
        instance.setLocalFingerprint(builderForValue);
        return this;
      }
      /**
       * <code>optional .textsecure.LogicalFingerprint localFingerprint = 2;</code>
       */
      public Builder mergeLocalFingerprint(org.whispersystems.libsignal.fingerprint.FingerprintProtos.LogicalFingerprint value) {
        copyOnWrite();
        instance.mergeLocalFingerprint(value);
        return this;
      }
      /**
       * <code>optional .textsecure.LogicalFingerprint localFingerprint = 2;</code>
       */
      public Builder clearLocalFingerprint() {  copyOnWrite();
        instance.clearLocalFingerprint();
        return this;
      }

      /**
       * <code>optional .textsecure.LogicalFingerprint remoteFingerprint = 3;</code>
       */
      public boolean hasRemoteFingerprint() {
        return instance.hasRemoteFingerprint();
      }
      /**
       * <code>optional .textsecure.LogicalFingerprint remoteFingerprint = 3;</code>
       */
      public org.whispersystems.libsignal.fingerprint.FingerprintProtos.LogicalFingerprint getRemoteFingerprint() {
        return instance.getRemoteFingerprint();
      }
      /**
       * <code>optional .textsecure.LogicalFingerprint remoteFingerprint = 3;</code>
       */
      public Builder setRemoteFingerprint(org.whispersystems.libsignal.fingerprint.FingerprintProtos.LogicalFingerprint value) {
        copyOnWrite();
        instance.setRemoteFingerprint(value);
        return this;
        }
      /**
       * <code>optional .textsecure.LogicalFingerprint remoteFingerprint = 3;</code>
       */
      public Builder setRemoteFingerprint(
          org.whispersystems.libsignal.fingerprint.FingerprintProtos.LogicalFingerprint.Builder builderForValue) {
        copyOnWrite();
        instance.setRemoteFingerprint(builderForValue);
        return this;
      }
      /**
       * <code>optional .textsecure.LogicalFingerprint remoteFingerprint = 3;</code>
       */
      public Builder mergeRemoteFingerprint(org.whispersystems.libsignal.fingerprint.FingerprintProtos.LogicalFingerprint value) {
        copyOnWrite();
        instance.mergeRemoteFingerprint(value);
        return this;
      }
      /**
       * <code>optional .textsecure.LogicalFingerprint remoteFingerprint = 3;</code>
       */
      public Builder clearRemoteFingerprint() {  copyOnWrite();
        instance.clearRemoteFingerprint();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:textsecure.CombinedFingerprints)
    }
    protected final Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new org.whispersystems.libsignal.fingerprint.FingerprintProtos.CombinedFingerprints();
        }
        case IS_INITIALIZED: {
          return DEFAULT_INSTANCE;
        }
        case MAKE_IMMUTABLE: {
          return null;
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case VISIT: {
          Visitor visitor = (Visitor) arg0;
          org.whispersystems.libsignal.fingerprint.FingerprintProtos.CombinedFingerprints other = (org.whispersystems.libsignal.fingerprint.FingerprintProtos.CombinedFingerprints) arg1;
          version_ = visitor.visitInt(
              hasVersion(), version_,
              other.hasVersion(), other.version_);
          localFingerprint_ = visitor.visitMessage(localFingerprint_, other.localFingerprint_);
          remoteFingerprint_ = visitor.visitMessage(remoteFingerprint_, other.remoteFingerprint_);
          if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
              .INSTANCE) {
            bitField0_ |= other.bitField0_;
          }
          return this;
        }
        case MERGE_FROM_STREAM: {
          com.google.protobuf.CodedInputStream input =
              (com.google.protobuf.CodedInputStream) arg0;
          com.google.protobuf.ExtensionRegistryLite extensionRegistry =
              (com.google.protobuf.ExtensionRegistryLite) arg1;
          try {
            boolean done = false;
            while (!done) {
              int tag = input.readTag();
              switch (tag) {
                case 0:
                  done = true;
                  break;
                default: {
                  if (!parseUnknownField(tag, input)) {
                    done = true;
                  }
                  break;
                }
                case 8: {
                  bitField0_ |= 0x00000001;
                  version_ = input.readUInt32();
                  break;
                }
                case 18: {
                  org.whispersystems.libsignal.fingerprint.FingerprintProtos.LogicalFingerprint.Builder subBuilder = null;
                  if (((bitField0_ & 0x00000002) == 0x00000002)) {
                    subBuilder = localFingerprint_.toBuilder();
                  }
                  localFingerprint_ = input.readMessage(org.whispersystems.libsignal.fingerprint.FingerprintProtos.LogicalFingerprint.parser(), extensionRegistry);
                  if (subBuilder != null) {
                    subBuilder.mergeFrom(localFingerprint_);
                    localFingerprint_ = subBuilder.buildPartial();
                  }
                  bitField0_ |= 0x00000002;
                  break;
                }
                case 26: {
                  org.whispersystems.libsignal.fingerprint.FingerprintProtos.LogicalFingerprint.Builder subBuilder = null;
                  if (((bitField0_ & 0x00000004) == 0x00000004)) {
                    subBuilder = remoteFingerprint_.toBuilder();
                  }
                  remoteFingerprint_ = input.readMessage(org.whispersystems.libsignal.fingerprint.FingerprintProtos.LogicalFingerprint.parser(), extensionRegistry);
                  if (subBuilder != null) {
                    subBuilder.mergeFrom(remoteFingerprint_);
                    remoteFingerprint_ = subBuilder.buildPartial();
                  }
                  bitField0_ |= 0x00000004;
                  break;
                }
              }
            }
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw new RuntimeException(e.setUnfinishedMessage(this));
          } catch (java.io.IOException e) {
            throw new RuntimeException(
                new com.google.protobuf.InvalidProtocolBufferException(
                    e.getMessage()).setUnfinishedMessage(this));
          } finally {
          }
        }
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          if (PARSER == null) {    synchronized (org.whispersystems.libsignal.fingerprint.FingerprintProtos.CombinedFingerprints.class) {
              if (PARSER == null) {
                PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
              }
            }
          }
          return PARSER;
        }
      }
      throw new UnsupportedOperationException();
    }


    // @@protoc_insertion_point(class_scope:textsecure.CombinedFingerprints)
    private static final org.whispersystems.libsignal.fingerprint.FingerprintProtos.CombinedFingerprints DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new CombinedFingerprints();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static org.whispersystems.libsignal.fingerprint.FingerprintProtos.CombinedFingerprints getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<CombinedFingerprints> PARSER;

    public static com.google.protobuf.Parser<CombinedFingerprints> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
