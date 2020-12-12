/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.language.v1;

import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.testing.LocalChannelProvider;
import com.google.api.gax.grpc.testing.MockGrpcService;
import com.google.api.gax.grpc.testing.MockServiceHelper;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.protobuf.AbstractMessage;
import io.grpc.StatusRuntimeException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import javax.annotation.Generated;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@Generated("by gapic-generator-java")
public class LanguageServiceClientTest {
  private static MockServiceHelper mockServiceHelper;
  private LanguageServiceClient client;
  private static MockLanguageService mockLanguageService;
  private LocalChannelProvider channelProvider;

  @BeforeClass
  public static void startStaticServer() {
    mockLanguageService = new MockLanguageService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(), Arrays.<MockGrpcService>asList(mockLanguageService));
    mockServiceHelper.start();
  }

  @AfterClass
  public static void stopServer() {
    mockServiceHelper.stop();
  }

  @Before
  public void setUp() throws IOException {
    mockServiceHelper.reset();
    channelProvider = mockServiceHelper.createChannelProvider();
    LanguageServiceSettings settings =
        LanguageServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = LanguageServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void analyzeSentimentTest() throws Exception {
    AnalyzeSentimentResponse expectedResponse =
        AnalyzeSentimentResponse.newBuilder()
            .setDocumentSentiment(Sentiment.newBuilder().build())
            .setLanguage("language-1613589672")
            .addAllSentences(new ArrayList<Sentence>())
            .build();
    mockLanguageService.addResponse(expectedResponse);

    Document document = Document.newBuilder().build();

    AnalyzeSentimentResponse actualResponse = client.analyzeSentiment(document);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockLanguageService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    AnalyzeSentimentRequest actualRequest = ((AnalyzeSentimentRequest) actualRequests.get(0));

    Assert.assertEquals(document, actualRequest.getDocument());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void analyzeSentimentExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockLanguageService.addException(exception);

    try {
      Document document = Document.newBuilder().build();
      client.analyzeSentiment(document);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void analyzeSentimentTest2() throws Exception {
    AnalyzeSentimentResponse expectedResponse =
        AnalyzeSentimentResponse.newBuilder()
            .setDocumentSentiment(Sentiment.newBuilder().build())
            .setLanguage("language-1613589672")
            .addAllSentences(new ArrayList<Sentence>())
            .build();
    mockLanguageService.addResponse(expectedResponse);

    Document document = Document.newBuilder().build();
    EncodingType encodingType = EncodingType.forNumber(0);

    AnalyzeSentimentResponse actualResponse = client.analyzeSentiment(document, encodingType);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockLanguageService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    AnalyzeSentimentRequest actualRequest = ((AnalyzeSentimentRequest) actualRequests.get(0));

    Assert.assertEquals(document, actualRequest.getDocument());
    Assert.assertEquals(encodingType, actualRequest.getEncodingType());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void analyzeSentimentExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockLanguageService.addException(exception);

    try {
      Document document = Document.newBuilder().build();
      EncodingType encodingType = EncodingType.forNumber(0);
      client.analyzeSentiment(document, encodingType);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void analyzeEntitiesTest() throws Exception {
    AnalyzeEntitiesResponse expectedResponse =
        AnalyzeEntitiesResponse.newBuilder()
            .addAllEntities(new ArrayList<Entity>())
            .setLanguage("language-1613589672")
            .build();
    mockLanguageService.addResponse(expectedResponse);

    Document document = Document.newBuilder().build();

    AnalyzeEntitiesResponse actualResponse = client.analyzeEntities(document);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockLanguageService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    AnalyzeEntitiesRequest actualRequest = ((AnalyzeEntitiesRequest) actualRequests.get(0));

    Assert.assertEquals(document, actualRequest.getDocument());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void analyzeEntitiesExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockLanguageService.addException(exception);

    try {
      Document document = Document.newBuilder().build();
      client.analyzeEntities(document);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void analyzeEntitiesTest2() throws Exception {
    AnalyzeEntitiesResponse expectedResponse =
        AnalyzeEntitiesResponse.newBuilder()
            .addAllEntities(new ArrayList<Entity>())
            .setLanguage("language-1613589672")
            .build();
    mockLanguageService.addResponse(expectedResponse);

    Document document = Document.newBuilder().build();
    EncodingType encodingType = EncodingType.forNumber(0);

    AnalyzeEntitiesResponse actualResponse = client.analyzeEntities(document, encodingType);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockLanguageService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    AnalyzeEntitiesRequest actualRequest = ((AnalyzeEntitiesRequest) actualRequests.get(0));

    Assert.assertEquals(document, actualRequest.getDocument());
    Assert.assertEquals(encodingType, actualRequest.getEncodingType());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void analyzeEntitiesExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockLanguageService.addException(exception);

    try {
      Document document = Document.newBuilder().build();
      EncodingType encodingType = EncodingType.forNumber(0);
      client.analyzeEntities(document, encodingType);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void analyzeEntitySentimentTest() throws Exception {
    AnalyzeEntitySentimentResponse expectedResponse =
        AnalyzeEntitySentimentResponse.newBuilder()
            .addAllEntities(new ArrayList<Entity>())
            .setLanguage("language-1613589672")
            .build();
    mockLanguageService.addResponse(expectedResponse);

    Document document = Document.newBuilder().build();

    AnalyzeEntitySentimentResponse actualResponse = client.analyzeEntitySentiment(document);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockLanguageService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    AnalyzeEntitySentimentRequest actualRequest =
        ((AnalyzeEntitySentimentRequest) actualRequests.get(0));

    Assert.assertEquals(document, actualRequest.getDocument());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void analyzeEntitySentimentExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockLanguageService.addException(exception);

    try {
      Document document = Document.newBuilder().build();
      client.analyzeEntitySentiment(document);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void analyzeEntitySentimentTest2() throws Exception {
    AnalyzeEntitySentimentResponse expectedResponse =
        AnalyzeEntitySentimentResponse.newBuilder()
            .addAllEntities(new ArrayList<Entity>())
            .setLanguage("language-1613589672")
            .build();
    mockLanguageService.addResponse(expectedResponse);

    Document document = Document.newBuilder().build();
    EncodingType encodingType = EncodingType.forNumber(0);

    AnalyzeEntitySentimentResponse actualResponse =
        client.analyzeEntitySentiment(document, encodingType);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockLanguageService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    AnalyzeEntitySentimentRequest actualRequest =
        ((AnalyzeEntitySentimentRequest) actualRequests.get(0));

    Assert.assertEquals(document, actualRequest.getDocument());
    Assert.assertEquals(encodingType, actualRequest.getEncodingType());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void analyzeEntitySentimentExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockLanguageService.addException(exception);

    try {
      Document document = Document.newBuilder().build();
      EncodingType encodingType = EncodingType.forNumber(0);
      client.analyzeEntitySentiment(document, encodingType);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void analyzeSyntaxTest() throws Exception {
    AnalyzeSyntaxResponse expectedResponse =
        AnalyzeSyntaxResponse.newBuilder()
            .addAllSentences(new ArrayList<Sentence>())
            .addAllTokens(new ArrayList<Token>())
            .setLanguage("language-1613589672")
            .build();
    mockLanguageService.addResponse(expectedResponse);

    Document document = Document.newBuilder().build();

    AnalyzeSyntaxResponse actualResponse = client.analyzeSyntax(document);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockLanguageService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    AnalyzeSyntaxRequest actualRequest = ((AnalyzeSyntaxRequest) actualRequests.get(0));

    Assert.assertEquals(document, actualRequest.getDocument());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void analyzeSyntaxExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockLanguageService.addException(exception);

    try {
      Document document = Document.newBuilder().build();
      client.analyzeSyntax(document);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void analyzeSyntaxTest2() throws Exception {
    AnalyzeSyntaxResponse expectedResponse =
        AnalyzeSyntaxResponse.newBuilder()
            .addAllSentences(new ArrayList<Sentence>())
            .addAllTokens(new ArrayList<Token>())
            .setLanguage("language-1613589672")
            .build();
    mockLanguageService.addResponse(expectedResponse);

    Document document = Document.newBuilder().build();
    EncodingType encodingType = EncodingType.forNumber(0);

    AnalyzeSyntaxResponse actualResponse = client.analyzeSyntax(document, encodingType);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockLanguageService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    AnalyzeSyntaxRequest actualRequest = ((AnalyzeSyntaxRequest) actualRequests.get(0));

    Assert.assertEquals(document, actualRequest.getDocument());
    Assert.assertEquals(encodingType, actualRequest.getEncodingType());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void analyzeSyntaxExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockLanguageService.addException(exception);

    try {
      Document document = Document.newBuilder().build();
      EncodingType encodingType = EncodingType.forNumber(0);
      client.analyzeSyntax(document, encodingType);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void classifyTextTest() throws Exception {
    ClassifyTextResponse expectedResponse =
        ClassifyTextResponse.newBuilder()
            .addAllCategories(new ArrayList<ClassificationCategory>())
            .build();
    mockLanguageService.addResponse(expectedResponse);

    Document document = Document.newBuilder().build();

    ClassifyTextResponse actualResponse = client.classifyText(document);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockLanguageService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ClassifyTextRequest actualRequest = ((ClassifyTextRequest) actualRequests.get(0));

    Assert.assertEquals(document, actualRequest.getDocument());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void classifyTextExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockLanguageService.addException(exception);

    try {
      Document document = Document.newBuilder().build();
      client.classifyText(document);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void annotateTextTest() throws Exception {
    AnnotateTextResponse expectedResponse =
        AnnotateTextResponse.newBuilder()
            .addAllSentences(new ArrayList<Sentence>())
            .addAllTokens(new ArrayList<Token>())
            .addAllEntities(new ArrayList<Entity>())
            .setDocumentSentiment(Sentiment.newBuilder().build())
            .setLanguage("language-1613589672")
            .addAllCategories(new ArrayList<ClassificationCategory>())
            .build();
    mockLanguageService.addResponse(expectedResponse);

    Document document = Document.newBuilder().build();
    AnnotateTextRequest.Features features = AnnotateTextRequest.Features.newBuilder().build();

    AnnotateTextResponse actualResponse = client.annotateText(document, features);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockLanguageService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    AnnotateTextRequest actualRequest = ((AnnotateTextRequest) actualRequests.get(0));

    Assert.assertEquals(document, actualRequest.getDocument());
    Assert.assertEquals(features, actualRequest.getFeatures());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void annotateTextExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockLanguageService.addException(exception);

    try {
      Document document = Document.newBuilder().build();
      AnnotateTextRequest.Features features = AnnotateTextRequest.Features.newBuilder().build();
      client.annotateText(document, features);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void annotateTextTest2() throws Exception {
    AnnotateTextResponse expectedResponse =
        AnnotateTextResponse.newBuilder()
            .addAllSentences(new ArrayList<Sentence>())
            .addAllTokens(new ArrayList<Token>())
            .addAllEntities(new ArrayList<Entity>())
            .setDocumentSentiment(Sentiment.newBuilder().build())
            .setLanguage("language-1613589672")
            .addAllCategories(new ArrayList<ClassificationCategory>())
            .build();
    mockLanguageService.addResponse(expectedResponse);

    Document document = Document.newBuilder().build();
    AnnotateTextRequest.Features features = AnnotateTextRequest.Features.newBuilder().build();
    EncodingType encodingType = EncodingType.forNumber(0);

    AnnotateTextResponse actualResponse = client.annotateText(document, features, encodingType);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockLanguageService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    AnnotateTextRequest actualRequest = ((AnnotateTextRequest) actualRequests.get(0));

    Assert.assertEquals(document, actualRequest.getDocument());
    Assert.assertEquals(features, actualRequest.getFeatures());
    Assert.assertEquals(encodingType, actualRequest.getEncodingType());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void annotateTextExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockLanguageService.addException(exception);

    try {
      Document document = Document.newBuilder().build();
      AnnotateTextRequest.Features features = AnnotateTextRequest.Features.newBuilder().build();
      EncodingType encodingType = EncodingType.forNumber(0);
      client.annotateText(document, features, encodingType);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
