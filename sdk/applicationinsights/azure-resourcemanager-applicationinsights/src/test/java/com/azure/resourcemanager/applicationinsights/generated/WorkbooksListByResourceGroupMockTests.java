// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager;
import com.azure.resourcemanager.applicationinsights.models.CategoryType;
import com.azure.resourcemanager.applicationinsights.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.applicationinsights.models.Workbook;
import com.azure.resourcemanager.applicationinsights.models.WorkbookSharedTypeKind;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class WorkbooksListByResourceGroupMockTests {
    @Test
    public void testListByResourceGroup() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"value\":[{\"properties\":{\"displayName\":\"dirazf\",\"serializedData\":\"xejw\",\"version\":\"mdujtmvcopexcm\",\"timeModified\":\"2021-08-22T13:20:48Z\",\"category\":\"buhhlkyqlt\",\"tags\":[\"ogtu\",\"kffdjktsys\"],\"userId\":\"fvcl\",\"sourceId\":\"xnfuijtkbusqogs\",\"storageUri\":\"kayi\",\"description\":\"sharujtj\",\"revision\":\"xfz\"},\"identity\":{\"principalId\":\"cde341ff-a5e9-46d1-a0a1-9d5123b83156\",\"tenantId\":\"ff9f4cf7-6269-4960-ab1c-c2bd21f8b3e1\",\"type\":\"SystemAssigned\",\"userAssignedIdentities\":{\"hjpenuygbq\":{\"principalId\":\"9a3c1040-f186-4a43-b191-99f0d7a3d56a\",\"clientId\":\"937a184c-6b22-4a56-8a13-26ff0129db2c\"},\"ekewvnqvcdlguauc\":{\"principalId\":\"46ac3e09-80ef-4dda-83b4-887454d38f18\",\"clientId\":\"6ec92ddf-e466-47e2-b0d9-069b4b6b7476\"},\"jwnlax\":{\"principalId\":\"98ff6eff-b5fe-408e-8ebb-bc5fdba4f9f9\",\"clientId\":\"d68f13ae-b3b1-4bc4-ae61-5d5277cce327\"},\"jqi\":{\"principalId\":\"0037750a-0d03-42f6-829e-339dc17b4a8b\",\"clientId\":\"49cf9276-1424-496e-ba37-79ac56f1b762\"}}},\"kind\":\"shared\",\"etag\":\"vitac\",\"location\":\"xmfcsserxhtv\",\"tags\":{\"sxypruuu\":\"hlwntsjgq\"},\"id\":\"bnchrsziz\",\"name\":\"yuel\",\"type\":\"etndnbfqyggagf\"}]}";

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

        ApplicationInsightsManager manager = ApplicationInsightsManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<Workbook> response = manager.workbooks()
            .listByResourceGroup("hrtdtpdelq", CategoryType.RETENTION, Arrays.asList("slmot"), "ebnfxofvc", false,
                com.azure.core.util.Context.NONE);

        Assertions.assertEquals("xmfcsserxhtv", response.iterator().next().location());
        Assertions.assertEquals("hlwntsjgq", response.iterator().next().tags().get("sxypruuu"));
        Assertions.assertEquals(ManagedServiceIdentityType.SYSTEM_ASSIGNED,
            response.iterator().next().identity().type());
        Assertions.assertEquals(WorkbookSharedTypeKind.SHARED, response.iterator().next().kind());
        Assertions.assertEquals("vitac", response.iterator().next().etag());
        Assertions.assertEquals("dirazf", response.iterator().next().displayName());
        Assertions.assertEquals("xejw", response.iterator().next().serializedData());
        Assertions.assertEquals("mdujtmvcopexcm", response.iterator().next().version());
        Assertions.assertEquals("buhhlkyqlt", response.iterator().next().category());
        Assertions.assertEquals("ogtu", response.iterator().next().tagsPropertiesTags().get(0));
        Assertions.assertEquals("xnfuijtkbusqogs", response.iterator().next().sourceId());
        Assertions.assertEquals("kayi", response.iterator().next().storageUri());
        Assertions.assertEquals("sharujtj", response.iterator().next().description());
    }
}
