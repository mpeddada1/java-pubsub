/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.pubsub.v1;

import com.google.api.core.SettableApiFuture;
import java.util.concurrent.Future;

public class AckReplyConsumerWithResponseImpl implements AckReplyConsumerWithResponse {
  final SettableApiFuture<MessageDispatcher.AckReply> ackReplySettableApiFuture;
  final SettableApiFuture<AckResponse> messageFuture;

  public AckReplyConsumerWithResponseImpl(
      SettableApiFuture<MessageDispatcher.AckReply> ackReplySettableApiFuture,
      SettableApiFuture<AckResponse> messageFuture) {
    this.ackReplySettableApiFuture = ackReplySettableApiFuture;
    this.messageFuture = messageFuture;
  }

  @Override
  public Future<AckResponse> ack() {
    ackReplySettableApiFuture.set(MessageDispatcher.AckReply.ACK);
    return messageFuture;
  }

  @Override
  public Future<AckResponse> nack() {
    ackReplySettableApiFuture.set(MessageDispatcher.AckReply.NACK);
    return messageFuture;
  }
}
