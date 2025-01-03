// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.devtestlabs.DevTestLabsManager;
import com.azure.resourcemanager.devtestlabs.models.EnableStatus;
import com.azure.resourcemanager.devtestlabs.models.Schedule;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class GlobalSchedulesGetByResourceGroupWithResponseMockTests {
    @Test
    public void testGetByResourceGroupWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"properties\":{\"status\":\"Enabled\",\"taskType\":\"lialwcjgckbbcccg\",\"weeklyRecurrence\":{\"weekdays\":[\"oxnyuffatsg\"],\"time\":\"ipwcxbyu\"},\"dailyRecurrence\":{\"time\":\"qdx\"},\"hourlyRecurrence\":{\"minute\":1532200707},\"timeZoneId\":\"nuhzafccnuh\",\"notificationSettings\":{\"status\":\"Enabled\",\"timeInMinutes\":1363942785,\"webhookUrl\":\"ui\",\"emailRecipient\":\"xvatvcr\",\"notificationLocale\":\"lbnb\"},\"createdDate\":\"2021-02-22T22:42:13Z\",\"targetResourceId\":\"csyhzlwxaeaov\",\"provisioningState\":\"exdnd\",\"uniqueIdentifier\":\"dwead\"},\"location\":\"rzmwn\",\"tags\":{\"mmagoaqylkjzt\":\"agttm\"},\"id\":\"iua\",\"name\":\"jcg\",\"type\":\"xitp\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito.when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito.when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito.when(httpClient.send(httpRequest.capture(), Mockito.any())).thenReturn(Mono.defer(() -> {
            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
            return Mono.just(httpResponse);
        }));

        DevTestLabsManager manager = DevTestLabsManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        Schedule response = manager.globalSchedules()
            .getByResourceGroupWithResponse("gthortudaw", "pjfe", "qerpptcbgqnzm", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("rzmwn", response.location());
        Assertions.assertEquals("agttm", response.tags().get("mmagoaqylkjzt"));
        Assertions.assertEquals(EnableStatus.ENABLED, response.status());
        Assertions.assertEquals("lialwcjgckbbcccg", response.taskType());
        Assertions.assertEquals("oxnyuffatsg", response.weeklyRecurrence().weekdays().get(0));
        Assertions.assertEquals("ipwcxbyu", response.weeklyRecurrence().time());
        Assertions.assertEquals("qdx", response.dailyRecurrence().time());
        Assertions.assertEquals(1532200707, response.hourlyRecurrence().minute());
        Assertions.assertEquals("nuhzafccnuh", response.timeZoneId());
        Assertions.assertEquals(EnableStatus.ENABLED, response.notificationSettings().status());
        Assertions.assertEquals(1363942785, response.notificationSettings().timeInMinutes());
        Assertions.assertEquals("ui", response.notificationSettings().webhookUrl());
        Assertions.assertEquals("xvatvcr", response.notificationSettings().emailRecipient());
        Assertions.assertEquals("lbnb", response.notificationSettings().notificationLocale());
        Assertions.assertEquals("csyhzlwxaeaov", response.targetResourceId());
    }
}
