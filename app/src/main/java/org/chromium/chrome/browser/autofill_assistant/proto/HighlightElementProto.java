// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

/**
 * <pre>
 * Contain all arguments to perform a highlight element action.
 * </pre>
 *
 * Protobuf type {@code autofill_assistant.HighlightElementProto}
 */
public  final class HighlightElementProto extends
    com.google.protobuf.GeneratedMessageLite<
        HighlightElementProto, HighlightElementProto.Builder> implements
    // @@protoc_insertion_point(message_implements:autofill_assistant.HighlightElementProto)
    HighlightElementProtoOrBuilder {
  private HighlightElementProto() {
  }
  private int bitField0_;
  public static final int ELEMENT_FIELD_NUMBER = 1;
  private org.chromium.chrome.browser.autofill_assistant.proto.ElementReferenceProto element_;
  /**
   * <pre>
   * The element to highlight.
   * </pre>
   *
   * <code>optional .autofill_assistant.ElementReferenceProto element = 1;</code>
   */
  public boolean hasElement() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <pre>
   * The element to highlight.
   * </pre>
   *
   * <code>optional .autofill_assistant.ElementReferenceProto element = 1;</code>
   */
  public org.chromium.chrome.browser.autofill_assistant.proto.ElementReferenceProto getElement() {
    return element_ == null ? org.chromium.chrome.browser.autofill_assistant.proto.ElementReferenceProto.getDefaultInstance() : element_;
  }
  /**
   * <pre>
   * The element to highlight.
   * </pre>
   *
   * <code>optional .autofill_assistant.ElementReferenceProto element = 1;</code>
   */
  private void setElement(org.chromium.chrome.browser.autofill_assistant.proto.ElementReferenceProto value) {
    if (value == null) {
      throw new NullPointerException();
    }
    element_ = value;
    bitField0_ |= 0x00000001;
    }
  /**
   * <pre>
   * The element to highlight.
   * </pre>
   *
   * <code>optional .autofill_assistant.ElementReferenceProto element = 1;</code>
   */
  private void setElement(
      org.chromium.chrome.browser.autofill_assistant.proto.ElementReferenceProto.Builder builderForValue) {
    element_ = builderForValue.build();
    bitField0_ |= 0x00000001;
  }
  /**
   * <pre>
   * The element to highlight.
   * </pre>
   *
   * <code>optional .autofill_assistant.ElementReferenceProto element = 1;</code>
   */
  private void mergeElement(org.chromium.chrome.browser.autofill_assistant.proto.ElementReferenceProto value) {
    if (element_ != null &&
        element_ != org.chromium.chrome.browser.autofill_assistant.proto.ElementReferenceProto.getDefaultInstance()) {
      element_ =
        org.chromium.chrome.browser.autofill_assistant.proto.ElementReferenceProto.newBuilder(element_).mergeFrom(value).buildPartial();
    } else {
      element_ = value;
    }
    bitField0_ |= 0x00000001;
  }
  /**
   * <pre>
   * The element to highlight.
   * </pre>
   *
   * <code>optional .autofill_assistant.ElementReferenceProto element = 1;</code>
   */
  private void clearElement() {  element_ = null;
    bitField0_ = (bitField0_ & ~0x00000001);
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeMessage(1, getElement());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getElement());
    }
    size += unknownFields.getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.HighlightElementProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.HighlightElementProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.HighlightElementProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.HighlightElementProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.HighlightElementProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.HighlightElementProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.HighlightElementProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.HighlightElementProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.HighlightElementProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.HighlightElementProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.chromium.chrome.browser.autofill_assistant.proto.HighlightElementProto prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * Contain all arguments to perform a highlight element action.
   * </pre>
   *
   * Protobuf type {@code autofill_assistant.HighlightElementProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.chrome.browser.autofill_assistant.proto.HighlightElementProto, Builder> implements
      // @@protoc_insertion_point(builder_implements:autofill_assistant.HighlightElementProto)
      org.chromium.chrome.browser.autofill_assistant.proto.HighlightElementProtoOrBuilder {
    // Construct using org.chromium.chrome.browser.autofill_assistant.proto.HighlightElementProto.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The element to highlight.
     * </pre>
     *
     * <code>optional .autofill_assistant.ElementReferenceProto element = 1;</code>
     */
    public boolean hasElement() {
      return instance.hasElement();
    }
    /**
     * <pre>
     * The element to highlight.
     * </pre>
     *
     * <code>optional .autofill_assistant.ElementReferenceProto element = 1;</code>
     */
    public org.chromium.chrome.browser.autofill_assistant.proto.ElementReferenceProto getElement() {
      return instance.getElement();
    }
    /**
     * <pre>
     * The element to highlight.
     * </pre>
     *
     * <code>optional .autofill_assistant.ElementReferenceProto element = 1;</code>
     */
    public Builder setElement(org.chromium.chrome.browser.autofill_assistant.proto.ElementReferenceProto value) {
      copyOnWrite();
      instance.setElement(value);
      return this;
      }
    /**
     * <pre>
     * The element to highlight.
     * </pre>
     *
     * <code>optional .autofill_assistant.ElementReferenceProto element = 1;</code>
     */
    public Builder setElement(
        org.chromium.chrome.browser.autofill_assistant.proto.ElementReferenceProto.Builder builderForValue) {
      copyOnWrite();
      instance.setElement(builderForValue);
      return this;
    }
    /**
     * <pre>
     * The element to highlight.
     * </pre>
     *
     * <code>optional .autofill_assistant.ElementReferenceProto element = 1;</code>
     */
    public Builder mergeElement(org.chromium.chrome.browser.autofill_assistant.proto.ElementReferenceProto value) {
      copyOnWrite();
      instance.mergeElement(value);
      return this;
    }
    /**
     * <pre>
     * The element to highlight.
     * </pre>
     *
     * <code>optional .autofill_assistant.ElementReferenceProto element = 1;</code>
     */
    public Builder clearElement() {  copyOnWrite();
      instance.clearElement();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:autofill_assistant.HighlightElementProto)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.chrome.browser.autofill_assistant.proto.HighlightElementProto();
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
        org.chromium.chrome.browser.autofill_assistant.proto.HighlightElementProto other = (org.chromium.chrome.browser.autofill_assistant.proto.HighlightElementProto) arg1;
        element_ = visitor.visitMessage(element_, other.element_);
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
                org.chromium.chrome.browser.autofill_assistant.proto.ElementReferenceProto.Builder subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = element_.toBuilder();
                }
                element_ = input.readMessage(org.chromium.chrome.browser.autofill_assistant.proto.ElementReferenceProto.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(element_);
                  element_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
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
        if (PARSER == null) {    synchronized (org.chromium.chrome.browser.autofill_assistant.proto.HighlightElementProto.class) {
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


  // @@protoc_insertion_point(class_scope:autofill_assistant.HighlightElementProto)
  private static final org.chromium.chrome.browser.autofill_assistant.proto.HighlightElementProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new HighlightElementProto();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.HighlightElementProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<HighlightElementProto> PARSER;

  public static com.google.protobuf.Parser<HighlightElementProto> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}
