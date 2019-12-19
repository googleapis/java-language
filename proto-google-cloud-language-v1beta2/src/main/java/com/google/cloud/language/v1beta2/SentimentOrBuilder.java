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
// source: google/cloud/language/v1beta2/language_service.proto

package com.google.cloud.language.v1beta2;

public interface SentimentOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.language.v1beta2.Sentiment)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A non-negative number in the [0, +inf) range, which represents
   * the absolute magnitude of sentiment regardless of score (positive or
   * negative).
   * </pre>
   *
   * <code>float magnitude = 2;</code>
   *
   * @return The magnitude.
   */
  float getMagnitude();

  /**
   *
   *
   * <pre>
   * Sentiment score between -1.0 (negative sentiment) and 1.0
   * (positive sentiment).
   * </pre>
   *
   * <code>float score = 3;</code>
   *
   * @return The score.
   */
  float getScore();
}
