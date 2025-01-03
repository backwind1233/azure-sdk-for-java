// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hardwaresecuritymodules.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.hardwaresecuritymodules.HardwareSecurityModulesManager;
import com.azure.resourcemanager.hardwaresecuritymodules.models.PrivateEndpoint;
import com.azure.resourcemanager.hardwaresecuritymodules.models.PrivateEndpointConnection;
import com.azure.resourcemanager.hardwaresecuritymodules.models.PrivateEndpointConnectionProperties;
import com.azure.resourcemanager.hardwaresecuritymodules.models.PrivateEndpointServiceConnectionStatus;
import com.azure.resourcemanager.hardwaresecuritymodules.models.PrivateLinkServiceConnectionState;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class CloudHsmClusterPrivateEndpointConnectionsCreateWithResponseMockTests {
    @Test
    public void testCreateWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"properties\":{\"privateEndpoint\":{\"id\":\"gaifmvik\"},\"privateLinkServiceConnectionState\":{\"status\":\"Pending\",\"description\":\"vkhbejdznx\",\"actionsRequired\":\"dsrhnjiv\"},\"provisioningState\":\"Canceled\",\"groupIds\":[\"ovqfzge\",\"jdftuljltd\"]},\"etag\":\"eamtmcz\",\"id\":\"m\",\"name\":\"jw\",\"type\":\"w\"}";

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

        HardwareSecurityModulesManager manager = HardwareSecurityModulesManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PrivateEndpointConnection response
            = manager.cloudHsmClusterPrivateEndpointConnections()
                .define("qhih")
                .withExistingCloudHsmCluster("gxmrhublwp", "esutrgjupauutpw")
                .withProperties(new PrivateEndpointConnectionProperties().withPrivateEndpoint(new PrivateEndpoint())
                    .withPrivateLinkServiceConnectionState(new PrivateLinkServiceConnectionState()
                        .withStatus(PrivateEndpointServiceConnectionStatus.APPROVED)
                        .withDescription("qntcypsxjvfoimwk")
                        .withActionsRequired("ircizjxvy")))
                .withEtag("slbi")
                .create();

        Assertions.assertEquals(PrivateEndpointServiceConnectionStatus.PENDING,
            response.properties().privateLinkServiceConnectionState().status());
        Assertions.assertEquals("vkhbejdznx", response.properties().privateLinkServiceConnectionState().description());
        Assertions.assertEquals("dsrhnjiv",
            response.properties().privateLinkServiceConnectionState().actionsRequired());
        Assertions.assertEquals("eamtmcz", response.etag());
    }
}
