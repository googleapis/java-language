/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/language/v1/language_service.proto

package com.google.cloud.language.v1;

/**
 *
 *
 * <pre>
 * Represents a sentence in the input document.
 * </pre>
 *
 * Protobuf type {@code google.cloud.language.v1.Sentence}
 */
public final class Sentence extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.language.v1.Sentence)
    SentenceOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Sentence.newBuilder() to construct.
  private Sentence(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Sentence() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Sentence();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private Sentence(
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
          case 10:
            {
              com.google.cloud.language.v1.TextSpan.Builder subBuilder = null;
              if (text_ != null) {
                subBuilder = text_.toBuilder();
              }
              text_ =
                  input.readMessage(
                      com.google.cloud.language.v1.TextSpan.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(text_);
                text_ = subBuilder.buildPartial();
              }

              break;
            }
          case 18:
            {
              com.google.cloud.language.v1.Sentiment.Builder subBuilder = null;
              if (sentiment_ != null) {
                subBuilder = sentiment_.toBuilder();
              }
              sentiment_ =
                  input.readMessage(
                      com.google.cloud.language.v1.Sentiment.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(sentiment_);
                sentiment_ = subBuilder.buildPartial();
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
    return com.google.cloud.language.v1.LanguageServiceProto
        .internal_static_google_cloud_language_v1_Sentence_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.language.v1.LanguageServiceProto
        .internal_static_google_cloud_language_v1_Sentence_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.language.v1.Sentence.class,
            com.google.cloud.language.v1.Sentence.Builder.class);
  }

  public static final int TEXT_FIELD_NUMBER = 1;
  private com.google.cloud.language.v1.TextSpan text_;
  /**
   *
   *
   * <pre>
   * The sentence text.
   * </pre>
   *
   * <code>.google.cloud.language.v1.TextSpan text = 1;</code>
   *
   * @return Whether the text field is set.
   */
  @java.lang.Override
  public boolean hasText() {
    return text_ != null;
  }
  /**
   *
   *
   * <pre>
   * The sentence text.
   * </pre>
   *
   * <code>.google.cloud.language.v1.TextSpan text = 1;</code>
   *
   * @return The text.
   */
  @java.lang.Override
  public com.google.cloud.language.v1.TextSpan getText() {
    return text_ == null ? com.google.cloud.language.v1.TextSpan.getDefaultInstance() : text_;
  }
  /**
   *
   *
   * <pre>
   * The sentence text.
   * </pre>
   *
   * <code>.google.cloud.language.v1.TextSpan text = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.language.v1.TextSpanOrBuilder getTextOrBuilder() {
    return getText();
  }

  public static final int SENTIMENT_FIELD_NUMBER = 2;
  private com.google.cloud.language.v1.Sentiment sentiment_;
  /**
   *
   *
   * <pre>
   * For calls to [AnalyzeSentiment][] or if
   * [AnnotateTextRequest.Features.extract_document_sentiment][google.cloud.language.v1.AnnotateTextRequest.Features.extract_document_sentiment] is set to
   * true, this field will contain the sentiment for the sentence.
   * </pre>
   *
   * <code>.google.cloud.language.v1.Sentiment sentiment = 2;</code>
   *
   * @return Whether the sentiment field is set.
   */
  @java.lang.Override
  public boolean hasSentiment() {
    return sentiment_ != null;
  }
  /**
   *
   *
   * <pre>
   * For calls to [AnalyzeSentiment][] or if
   * [AnnotateTextRequest.Features.extract_document_sentiment][google.cloud.language.v1.AnnotateTextRequest.Features.extract_document_sentiment] is set to
   * true, this field will contain the sentiment for the sentence.
   * </pre>
   *
   * <code>.google.cloud.language.v1.Sentiment sentiment = 2;</code>
   *
   * @return The sentiment.
   */
  @java.lang.Override
  public com.google.cloud.language.v1.Sentiment getSentiment() {
    return sentiment_ == null
        ? com.google.cloud.language.v1.Sentiment.getDefaultInstance()
        : sentiment_;
  }
  /**
   *
   *
   * <pre>
   * For calls to [AnalyzeSentiment][] or if
   * [AnnotateTextRequest.Features.extract_document_sentiment][google.cloud.language.v1.AnnotateTextRequest.Features.extract_document_sentiment] is set to
   * true, this field will contain the sentiment for the sentence.
   * </pre>
   *
   * <code>.google.cloud.language.v1.Sentiment sentiment = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.language.v1.SentimentOrBuilder getSentimentOrBuilder() {
    return getSentiment();
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
    if (text_ != null) {
      output.writeMessage(1, getText());
    }
    if (sentiment_ != null) {
      output.writeMessage(2, getSentiment());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (text_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getText());
    }
    if (sentiment_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getSentiment());
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
    if (!(obj instanceof com.google.cloud.language.v1.Sentence)) {
      return super.equals(obj);
    }
    com.google.cloud.language.v1.Sentence other = (com.google.cloud.language.v1.Sentence) obj;

    if (hasText() != other.hasText()) return false;
    if (hasText()) {
      if (!getText().equals(other.getText())) return false;
    }
    if (hasSentiment() != other.hasSentiment()) return false;
    if (hasSentiment()) {
      if (!getSentiment().equals(other.getSentiment())) return false;
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
    if (hasText()) {
      hash = (37 * hash) + TEXT_FIELD_NUMBER;
      hash = (53 * hash) + getText().hashCode();
    }
    if (hasSentiment()) {
      hash = (37 * hash) + SENTIMENT_FIELD_NUMBER;
      hash = (53 * hash) + getSentiment().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.language.v1.Sentence parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.language.v1.Sentence parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.language.v1.Sentence parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.language.v1.Sentence parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.language.v1.Sentence parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.language.v1.Sentence parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.language.v1.Sentence parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.language.v1.Sentence parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.language.v1.Sentence parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.language.v1.Sentence parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.language.v1.Sentence parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.language.v1.Sentence parseFrom(
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

  public static Builder newBuilder(com.google.cloud.language.v1.Sentence prototype) {
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
   * Represents a sentence in the input document.
   * </pre>
   *
   * Protobuf type {@code google.cloud.language.v1.Sentence}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.language.v1.Sentence)
      com.google.cloud.language.v1.SentenceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.language.v1.LanguageServiceProto
          .internal_static_google_cloud_language_v1_Sentence_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.language.v1.LanguageServiceProto
          .internal_static_google_cloud_language_v1_Sentence_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.language.v1.Sentence.class,
              com.google.cloud.language.v1.Sentence.Builder.class);
    }

    // Construct using com.google.cloud.language.v1.Sentence.newBuilder()
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
      if (textBuilder_ == null) {
        text_ = null;
      } else {
        text_ = null;
        textBuilder_ = null;
      }
      if (sentimentBuilder_ == null) {
        sentiment_ = null;
      } else {
        sentiment_ = null;
        sentimentBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.language.v1.LanguageServiceProto
          .internal_static_google_cloud_language_v1_Sentence_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.language.v1.Sentence getDefaultInstanceForType() {
      return com.google.cloud.language.v1.Sentence.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.language.v1.Sentence build() {
      com.google.cloud.language.v1.Sentence result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.language.v1.Sentence buildPartial() {
      com.google.cloud.language.v1.Sentence result =
          new com.google.cloud.language.v1.Sentence(this);
      if (textBuilder_ == null) {
        result.text_ = text_;
      } else {
        result.text_ = textBuilder_.build();
      }
      if (sentimentBuilder_ == null) {
        result.sentiment_ = sentiment_;
      } else {
        result.sentiment_ = sentimentBuilder_.build();
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
      if (other instanceof com.google.cloud.language.v1.Sentence) {
        return mergeFrom((com.google.cloud.language.v1.Sentence) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.language.v1.Sentence other) {
      if (other == com.google.cloud.language.v1.Sentence.getDefaultInstance()) return this;
      if (other.hasText()) {
        mergeText(other.getText());
      }
      if (other.hasSentiment()) {
        mergeSentiment(other.getSentiment());
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
      com.google.cloud.language.v1.Sentence parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.language.v1.Sentence) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.language.v1.TextSpan text_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.language.v1.TextSpan,
            com.google.cloud.language.v1.TextSpan.Builder,
            com.google.cloud.language.v1.TextSpanOrBuilder>
        textBuilder_;
    /**
     *
     *
     * <pre>
     * The sentence text.
     * </pre>
     *
     * <code>.google.cloud.language.v1.TextSpan text = 1;</code>
     *
     * @return Whether the text field is set.
     */
    public boolean hasText() {
      return textBuilder_ != null || text_ != null;
    }
    /**
     *
     *
     * <pre>
     * The sentence text.
     * </pre>
     *
     * <code>.google.cloud.language.v1.TextSpan text = 1;</code>
     *
     * @return The text.
     */
    public com.google.cloud.language.v1.TextSpan getText() {
      if (textBuilder_ == null) {
        return text_ == null ? com.google.cloud.language.v1.TextSpan.getDefaultInstance() : text_;
      } else {
        return textBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The sentence text.
     * </pre>
     *
     * <code>.google.cloud.language.v1.TextSpan text = 1;</code>
     */
    public Builder setText(com.google.cloud.language.v1.TextSpan value) {
      if (textBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        text_ = value;
        onChanged();
      } else {
        textBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The sentence text.
     * </pre>
     *
     * <code>.google.cloud.language.v1.TextSpan text = 1;</code>
     */
    public Builder setText(com.google.cloud.language.v1.TextSpan.Builder builderForValue) {
      if (textBuilder_ == null) {
        text_ = builderForValue.build();
        onChanged();
      } else {
        textBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The sentence text.
     * </pre>
     *
     * <code>.google.cloud.language.v1.TextSpan text = 1;</code>
     */
    public Builder mergeText(com.google.cloud.language.v1.TextSpan value) {
      if (textBuilder_ == null) {
        if (text_ != null) {
          text_ =
              com.google.cloud.language.v1.TextSpan.newBuilder(text_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          text_ = value;
        }
        onChanged();
      } else {
        textBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The sentence text.
     * </pre>
     *
     * <code>.google.cloud.language.v1.TextSpan text = 1;</code>
     */
    public Builder clearText() {
      if (textBuilder_ == null) {
        text_ = null;
        onChanged();
      } else {
        text_ = null;
        textBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The sentence text.
     * </pre>
     *
     * <code>.google.cloud.language.v1.TextSpan text = 1;</code>
     */
    public com.google.cloud.language.v1.TextSpan.Builder getTextBuilder() {

      onChanged();
      return getTextFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The sentence text.
     * </pre>
     *
     * <code>.google.cloud.language.v1.TextSpan text = 1;</code>
     */
    public com.google.cloud.language.v1.TextSpanOrBuilder getTextOrBuilder() {
      if (textBuilder_ != null) {
        return textBuilder_.getMessageOrBuilder();
      } else {
        return text_ == null ? com.google.cloud.language.v1.TextSpan.getDefaultInstance() : text_;
      }
    }
    /**
     *
     *
     * <pre>
     * The sentence text.
     * </pre>
     *
     * <code>.google.cloud.language.v1.TextSpan text = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.language.v1.TextSpan,
            com.google.cloud.language.v1.TextSpan.Builder,
            com.google.cloud.language.v1.TextSpanOrBuilder>
        getTextFieldBuilder() {
      if (textBuilder_ == null) {
        textBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.language.v1.TextSpan,
                com.google.cloud.language.v1.TextSpan.Builder,
                com.google.cloud.language.v1.TextSpanOrBuilder>(
                getText(), getParentForChildren(), isClean());
        text_ = null;
      }
      return textBuilder_;
    }

    private com.google.cloud.language.v1.Sentiment sentiment_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.language.v1.Sentiment,
            com.google.cloud.language.v1.Sentiment.Builder,
            com.google.cloud.language.v1.SentimentOrBuilder>
        sentimentBuilder_;
    /**
     *
     *
     * <pre>
     * For calls to [AnalyzeSentiment][] or if
     * [AnnotateTextRequest.Features.extract_document_sentiment][google.cloud.language.v1.AnnotateTextRequest.Features.extract_document_sentiment] is set to
     * true, this field will contain the sentiment for the sentence.
     * </pre>
     *
     * <code>.google.cloud.language.v1.Sentiment sentiment = 2;</code>
     *
     * @return Whether the sentiment field is set.
     */
    public boolean hasSentiment() {
      return sentimentBuilder_ != null || sentiment_ != null;
    }
    /**
     *
     *
     * <pre>
     * For calls to [AnalyzeSentiment][] or if
     * [AnnotateTextRequest.Features.extract_document_sentiment][google.cloud.language.v1.AnnotateTextRequest.Features.extract_document_sentiment] is set to
     * true, this field will contain the sentiment for the sentence.
     * </pre>
     *
     * <code>.google.cloud.language.v1.Sentiment sentiment = 2;</code>
     *
     * @return The sentiment.
     */
    public com.google.cloud.language.v1.Sentiment getSentiment() {
      if (sentimentBuilder_ == null) {
        return sentiment_ == null
            ? com.google.cloud.language.v1.Sentiment.getDefaultInstance()
            : sentiment_;
      } else {
        return sentimentBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * For calls to [AnalyzeSentiment][] or if
     * [AnnotateTextRequest.Features.extract_document_sentiment][google.cloud.language.v1.AnnotateTextRequest.Features.extract_document_sentiment] is set to
     * true, this field will contain the sentiment for the sentence.
     * </pre>
     *
     * <code>.google.cloud.language.v1.Sentiment sentiment = 2;</code>
     */
    public Builder setSentiment(com.google.cloud.language.v1.Sentiment value) {
      if (sentimentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        sentiment_ = value;
        onChanged();
      } else {
        sentimentBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * For calls to [AnalyzeSentiment][] or if
     * [AnnotateTextRequest.Features.extract_document_sentiment][google.cloud.language.v1.AnnotateTextRequest.Features.extract_document_sentiment] is set to
     * true, this field will contain the sentiment for the sentence.
     * </pre>
     *
     * <code>.google.cloud.language.v1.Sentiment sentiment = 2;</code>
     */
    public Builder setSentiment(com.google.cloud.language.v1.Sentiment.Builder builderForValue) {
      if (sentimentBuilder_ == null) {
        sentiment_ = builderForValue.build();
        onChanged();
      } else {
        sentimentBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * For calls to [AnalyzeSentiment][] or if
     * [AnnotateTextRequest.Features.extract_document_sentiment][google.cloud.language.v1.AnnotateTextRequest.Features.extract_document_sentiment] is set to
     * true, this field will contain the sentiment for the sentence.
     * </pre>
     *
     * <code>.google.cloud.language.v1.Sentiment sentiment = 2;</code>
     */
    public Builder mergeSentiment(com.google.cloud.language.v1.Sentiment value) {
      if (sentimentBuilder_ == null) {
        if (sentiment_ != null) {
          sentiment_ =
              com.google.cloud.language.v1.Sentiment.newBuilder(sentiment_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          sentiment_ = value;
        }
        onChanged();
      } else {
        sentimentBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * For calls to [AnalyzeSentiment][] or if
     * [AnnotateTextRequest.Features.extract_document_sentiment][google.cloud.language.v1.AnnotateTextRequest.Features.extract_document_sentiment] is set to
     * true, this field will contain the sentiment for the sentence.
     * </pre>
     *
     * <code>.google.cloud.language.v1.Sentiment sentiment = 2;</code>
     */
    public Builder clearSentiment() {
      if (sentimentBuilder_ == null) {
        sentiment_ = null;
        onChanged();
      } else {
        sentiment_ = null;
        sentimentBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * For calls to [AnalyzeSentiment][] or if
     * [AnnotateTextRequest.Features.extract_document_sentiment][google.cloud.language.v1.AnnotateTextRequest.Features.extract_document_sentiment] is set to
     * true, this field will contain the sentiment for the sentence.
     * </pre>
     *
     * <code>.google.cloud.language.v1.Sentiment sentiment = 2;</code>
     */
    public com.google.cloud.language.v1.Sentiment.Builder getSentimentBuilder() {

      onChanged();
      return getSentimentFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * For calls to [AnalyzeSentiment][] or if
     * [AnnotateTextRequest.Features.extract_document_sentiment][google.cloud.language.v1.AnnotateTextRequest.Features.extract_document_sentiment] is set to
     * true, this field will contain the sentiment for the sentence.
     * </pre>
     *
     * <code>.google.cloud.language.v1.Sentiment sentiment = 2;</code>
     */
    public com.google.cloud.language.v1.SentimentOrBuilder getSentimentOrBuilder() {
      if (sentimentBuilder_ != null) {
        return sentimentBuilder_.getMessageOrBuilder();
      } else {
        return sentiment_ == null
            ? com.google.cloud.language.v1.Sentiment.getDefaultInstance()
            : sentiment_;
      }
    }
    /**
     *
     *
     * <pre>
     * For calls to [AnalyzeSentiment][] or if
     * [AnnotateTextRequest.Features.extract_document_sentiment][google.cloud.language.v1.AnnotateTextRequest.Features.extract_document_sentiment] is set to
     * true, this field will contain the sentiment for the sentence.
     * </pre>
     *
     * <code>.google.cloud.language.v1.Sentiment sentiment = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.language.v1.Sentiment,
            com.google.cloud.language.v1.Sentiment.Builder,
            com.google.cloud.language.v1.SentimentOrBuilder>
        getSentimentFieldBuilder() {
      if (sentimentBuilder_ == null) {
        sentimentBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.language.v1.Sentiment,
                com.google.cloud.language.v1.Sentiment.Builder,
                com.google.cloud.language.v1.SentimentOrBuilder>(
                getSentiment(), getParentForChildren(), isClean());
        sentiment_ = null;
      }
      return sentimentBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.language.v1.Sentence)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.language.v1.Sentence)
  private static final com.google.cloud.language.v1.Sentence DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.language.v1.Sentence();
  }

  public static com.google.cloud.language.v1.Sentence getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Sentence> PARSER =
      new com.google.protobuf.AbstractParser<Sentence>() {
        @java.lang.Override
        public Sentence parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new Sentence(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<Sentence> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Sentence> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.language.v1.Sentence getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
