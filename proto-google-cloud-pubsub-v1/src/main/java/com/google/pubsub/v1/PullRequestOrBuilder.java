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

public interface PullRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.pubsub.v1.PullRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The subscription from which messages should be pulled.
   * Format is `projects/{project}/subscriptions/{sub}`.
   * </pre>
   *
   * <code>string subscription = 1;</code>
   */
  java.lang.String getSubscription();
  /**
   *
   *
   * <pre>
   * The subscription from which messages should be pulled.
   * Format is `projects/{project}/subscriptions/{sub}`.
   * </pre>
   *
   * <code>string subscription = 1;</code>
   */
  com.google.protobuf.ByteString getSubscriptionBytes();

  /**
   *
   *
   * <pre>
   * If this field set to true, the system will respond immediately even if
   * it there are no messages available to return in the `Pull` response.
   * Otherwise, the system may wait (for a bounded amount of time) until at
   * least one message is available, rather than returning no messages.
   * </pre>
   *
   * <code>bool return_immediately = 2;</code>
   */
  boolean getReturnImmediately();

  /**
   *
   *
   * <pre>
   * The maximum number of messages to return for this request. Must be a
   * positive integer. The Pub/Sub system may return fewer than the number
   * specified.
   * </pre>
   *
   * <code>int32 max_messages = 3;</code>
   */
  int getMaxMessages();
}
