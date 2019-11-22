/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/pubsub/v1/pubsub.proto

package com.google.pubsub.v1;

/**
 *
 *
 * <pre>
 * A policy that specifies the conditions for resource expiration (i.e.,
 * automatic resource deletion).
 * </pre>
 *
 * Protobuf type {@code google.pubsub.v1.ExpirationPolicy}
 */
public final class ExpirationPolicy extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.pubsub.v1.ExpirationPolicy)
    ExpirationPolicyOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ExpirationPolicy.newBuilder() to construct.
  private ExpirationPolicy(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ExpirationPolicy() {}

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ExpirationPolicy(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 10:
            {
              com.google.protobuf.Duration.Builder subBuilder = null;
              if (ttl_ != null) {
                subBuilder = ttl_.toBuilder();
              }
              ttl_ = input.readMessage(com.google.protobuf.Duration.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(ttl_);
                ttl_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.pubsub.v1.PubsubProto
        .internal_static_google_pubsub_v1_ExpirationPolicy_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.pubsub.v1.PubsubProto
        .internal_static_google_pubsub_v1_ExpirationPolicy_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.pubsub.v1.ExpirationPolicy.class,
            com.google.pubsub.v1.ExpirationPolicy.Builder.class);
  }

  public static final int TTL_FIELD_NUMBER = 1;
  private com.google.protobuf.Duration ttl_;
  /**
   *
   *
   * <pre>
   * Specifies the "time-to-live" duration for an associated resource. The
   * resource expires if it is not active for a period of `ttl`. The definition
   * of "activity" depends on the type of the associated resource. The minimum
   * and maximum allowed values for `ttl` depend on the type of the associated
   * resource, as well. If `ttl` is not set, the associated resource never
   * expires.
   * </pre>
   *
   * <code>.google.protobuf.Duration ttl = 1;</code>
   */
  public boolean hasTtl() {
    return ttl_ != null;
  }
  /**
   *
   *
   * <pre>
   * Specifies the "time-to-live" duration for an associated resource. The
   * resource expires if it is not active for a period of `ttl`. The definition
   * of "activity" depends on the type of the associated resource. The minimum
   * and maximum allowed values for `ttl` depend on the type of the associated
   * resource, as well. If `ttl` is not set, the associated resource never
   * expires.
   * </pre>
   *
   * <code>.google.protobuf.Duration ttl = 1;</code>
   */
  public com.google.protobuf.Duration getTtl() {
    return ttl_ == null ? com.google.protobuf.Duration.getDefaultInstance() : ttl_;
  }
  /**
   *
   *
   * <pre>
   * Specifies the "time-to-live" duration for an associated resource. The
   * resource expires if it is not active for a period of `ttl`. The definition
   * of "activity" depends on the type of the associated resource. The minimum
   * and maximum allowed values for `ttl` depend on the type of the associated
   * resource, as well. If `ttl` is not set, the associated resource never
   * expires.
   * </pre>
   *
   * <code>.google.protobuf.Duration ttl = 1;</code>
   */
  public com.google.protobuf.DurationOrBuilder getTtlOrBuilder() {
    return getTtl();
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (ttl_ != null) {
      output.writeMessage(1, getTtl());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (ttl_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getTtl());
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
    if (!(obj instanceof com.google.pubsub.v1.ExpirationPolicy)) {
      return super.equals(obj);
    }
    com.google.pubsub.v1.ExpirationPolicy other = (com.google.pubsub.v1.ExpirationPolicy) obj;

    if (hasTtl() != other.hasTtl()) return false;
    if (hasTtl()) {
      if (!getTtl().equals(other.getTtl())) return false;
    }
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
    if (hasTtl()) {
      hash = (37 * hash) + TTL_FIELD_NUMBER;
      hash = (53 * hash) + getTtl().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.pubsub.v1.ExpirationPolicy parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.pubsub.v1.ExpirationPolicy parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.pubsub.v1.ExpirationPolicy parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.pubsub.v1.ExpirationPolicy parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.pubsub.v1.ExpirationPolicy parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.pubsub.v1.ExpirationPolicy parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.pubsub.v1.ExpirationPolicy parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.pubsub.v1.ExpirationPolicy parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.pubsub.v1.ExpirationPolicy parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.pubsub.v1.ExpirationPolicy parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.pubsub.v1.ExpirationPolicy parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.pubsub.v1.ExpirationPolicy parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.pubsub.v1.ExpirationPolicy prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * A policy that specifies the conditions for resource expiration (i.e.,
   * automatic resource deletion).
   * </pre>
   *
   * Protobuf type {@code google.pubsub.v1.ExpirationPolicy}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.pubsub.v1.ExpirationPolicy)
      com.google.pubsub.v1.ExpirationPolicyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.pubsub.v1.PubsubProto
          .internal_static_google_pubsub_v1_ExpirationPolicy_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.pubsub.v1.PubsubProto
          .internal_static_google_pubsub_v1_ExpirationPolicy_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.pubsub.v1.ExpirationPolicy.class,
              com.google.pubsub.v1.ExpirationPolicy.Builder.class);
    }

    // Construct using com.google.pubsub.v1.ExpirationPolicy.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (ttlBuilder_ == null) {
        ttl_ = null;
      } else {
        ttl_ = null;
        ttlBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.pubsub.v1.PubsubProto
          .internal_static_google_pubsub_v1_ExpirationPolicy_descriptor;
    }

    @java.lang.Override
    public com.google.pubsub.v1.ExpirationPolicy getDefaultInstanceForType() {
      return com.google.pubsub.v1.ExpirationPolicy.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.pubsub.v1.ExpirationPolicy build() {
      com.google.pubsub.v1.ExpirationPolicy result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.pubsub.v1.ExpirationPolicy buildPartial() {
      com.google.pubsub.v1.ExpirationPolicy result =
          new com.google.pubsub.v1.ExpirationPolicy(this);
      if (ttlBuilder_ == null) {
        result.ttl_ = ttl_;
      } else {
        result.ttl_ = ttlBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.pubsub.v1.ExpirationPolicy) {
        return mergeFrom((com.google.pubsub.v1.ExpirationPolicy) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.pubsub.v1.ExpirationPolicy other) {
      if (other == com.google.pubsub.v1.ExpirationPolicy.getDefaultInstance()) return this;
      if (other.hasTtl()) {
        mergeTtl(other.getTtl());
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
      com.google.pubsub.v1.ExpirationPolicy parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.pubsub.v1.ExpirationPolicy) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.Duration ttl_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration,
            com.google.protobuf.Duration.Builder,
            com.google.protobuf.DurationOrBuilder>
        ttlBuilder_;
    /**
     *
     *
     * <pre>
     * Specifies the "time-to-live" duration for an associated resource. The
     * resource expires if it is not active for a period of `ttl`. The definition
     * of "activity" depends on the type of the associated resource. The minimum
     * and maximum allowed values for `ttl` depend on the type of the associated
     * resource, as well. If `ttl` is not set, the associated resource never
     * expires.
     * </pre>
     *
     * <code>.google.protobuf.Duration ttl = 1;</code>
     */
    public boolean hasTtl() {
      return ttlBuilder_ != null || ttl_ != null;
    }
    /**
     *
     *
     * <pre>
     * Specifies the "time-to-live" duration for an associated resource. The
     * resource expires if it is not active for a period of `ttl`. The definition
     * of "activity" depends on the type of the associated resource. The minimum
     * and maximum allowed values for `ttl` depend on the type of the associated
     * resource, as well. If `ttl` is not set, the associated resource never
     * expires.
     * </pre>
     *
     * <code>.google.protobuf.Duration ttl = 1;</code>
     */
    public com.google.protobuf.Duration getTtl() {
      if (ttlBuilder_ == null) {
        return ttl_ == null ? com.google.protobuf.Duration.getDefaultInstance() : ttl_;
      } else {
        return ttlBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Specifies the "time-to-live" duration for an associated resource. The
     * resource expires if it is not active for a period of `ttl`. The definition
     * of "activity" depends on the type of the associated resource. The minimum
     * and maximum allowed values for `ttl` depend on the type of the associated
     * resource, as well. If `ttl` is not set, the associated resource never
     * expires.
     * </pre>
     *
     * <code>.google.protobuf.Duration ttl = 1;</code>
     */
    public Builder setTtl(com.google.protobuf.Duration value) {
      if (ttlBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ttl_ = value;
        onChanged();
      } else {
        ttlBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Specifies the "time-to-live" duration for an associated resource. The
     * resource expires if it is not active for a period of `ttl`. The definition
     * of "activity" depends on the type of the associated resource. The minimum
     * and maximum allowed values for `ttl` depend on the type of the associated
     * resource, as well. If `ttl` is not set, the associated resource never
     * expires.
     * </pre>
     *
     * <code>.google.protobuf.Duration ttl = 1;</code>
     */
    public Builder setTtl(com.google.protobuf.Duration.Builder builderForValue) {
      if (ttlBuilder_ == null) {
        ttl_ = builderForValue.build();
        onChanged();
      } else {
        ttlBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Specifies the "time-to-live" duration for an associated resource. The
     * resource expires if it is not active for a period of `ttl`. The definition
     * of "activity" depends on the type of the associated resource. The minimum
     * and maximum allowed values for `ttl` depend on the type of the associated
     * resource, as well. If `ttl` is not set, the associated resource never
     * expires.
     * </pre>
     *
     * <code>.google.protobuf.Duration ttl = 1;</code>
     */
    public Builder mergeTtl(com.google.protobuf.Duration value) {
      if (ttlBuilder_ == null) {
        if (ttl_ != null) {
          ttl_ = com.google.protobuf.Duration.newBuilder(ttl_).mergeFrom(value).buildPartial();
        } else {
          ttl_ = value;
        }
        onChanged();
      } else {
        ttlBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Specifies the "time-to-live" duration for an associated resource. The
     * resource expires if it is not active for a period of `ttl`. The definition
     * of "activity" depends on the type of the associated resource. The minimum
     * and maximum allowed values for `ttl` depend on the type of the associated
     * resource, as well. If `ttl` is not set, the associated resource never
     * expires.
     * </pre>
     *
     * <code>.google.protobuf.Duration ttl = 1;</code>
     */
    public Builder clearTtl() {
      if (ttlBuilder_ == null) {
        ttl_ = null;
        onChanged();
      } else {
        ttl_ = null;
        ttlBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Specifies the "time-to-live" duration for an associated resource. The
     * resource expires if it is not active for a period of `ttl`. The definition
     * of "activity" depends on the type of the associated resource. The minimum
     * and maximum allowed values for `ttl` depend on the type of the associated
     * resource, as well. If `ttl` is not set, the associated resource never
     * expires.
     * </pre>
     *
     * <code>.google.protobuf.Duration ttl = 1;</code>
     */
    public com.google.protobuf.Duration.Builder getTtlBuilder() {

      onChanged();
      return getTtlFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Specifies the "time-to-live" duration for an associated resource. The
     * resource expires if it is not active for a period of `ttl`. The definition
     * of "activity" depends on the type of the associated resource. The minimum
     * and maximum allowed values for `ttl` depend on the type of the associated
     * resource, as well. If `ttl` is not set, the associated resource never
     * expires.
     * </pre>
     *
     * <code>.google.protobuf.Duration ttl = 1;</code>
     */
    public com.google.protobuf.DurationOrBuilder getTtlOrBuilder() {
      if (ttlBuilder_ != null) {
        return ttlBuilder_.getMessageOrBuilder();
      } else {
        return ttl_ == null ? com.google.protobuf.Duration.getDefaultInstance() : ttl_;
      }
    }
    /**
     *
     *
     * <pre>
     * Specifies the "time-to-live" duration for an associated resource. The
     * resource expires if it is not active for a period of `ttl`. The definition
     * of "activity" depends on the type of the associated resource. The minimum
     * and maximum allowed values for `ttl` depend on the type of the associated
     * resource, as well. If `ttl` is not set, the associated resource never
     * expires.
     * </pre>
     *
     * <code>.google.protobuf.Duration ttl = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration,
            com.google.protobuf.Duration.Builder,
            com.google.protobuf.DurationOrBuilder>
        getTtlFieldBuilder() {
      if (ttlBuilder_ == null) {
        ttlBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Duration,
                com.google.protobuf.Duration.Builder,
                com.google.protobuf.DurationOrBuilder>(getTtl(), getParentForChildren(), isClean());
        ttl_ = null;
      }
      return ttlBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.pubsub.v1.ExpirationPolicy)
  }

  // @@protoc_insertion_point(class_scope:google.pubsub.v1.ExpirationPolicy)
  private static final com.google.pubsub.v1.ExpirationPolicy DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.pubsub.v1.ExpirationPolicy();
  }

  public static com.google.pubsub.v1.ExpirationPolicy getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExpirationPolicy> PARSER =
      new com.google.protobuf.AbstractParser<ExpirationPolicy>() {
        @java.lang.Override
        public ExpirationPolicy parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ExpirationPolicy(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ExpirationPolicy> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExpirationPolicy> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.pubsub.v1.ExpirationPolicy getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
