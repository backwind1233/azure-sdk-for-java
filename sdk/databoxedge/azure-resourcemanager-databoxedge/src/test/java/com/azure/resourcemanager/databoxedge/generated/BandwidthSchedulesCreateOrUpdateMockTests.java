// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.databoxedge.DataBoxEdgeManager;
import com.azure.resourcemanager.databoxedge.models.BandwidthSchedule;
import com.azure.resourcemanager.databoxedge.models.DayOfWeek;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class BandwidthSchedulesCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        String responseStr
            = "{\"properties\":{\"start\":\"vvbalx\",\"stop\":\"l\",\"rateInMbps\":677641870,\"days\":[\"Friday\",\"Monday\"]},\"id\":\"db\",\"name\":\"evwrdnhfuk\",\"type\":\"vsjcswsmystuluqy\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        DataBoxEdgeManager manager = DataBoxEdgeManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        BandwidthSchedule response = manager.bandwidthSchedules()
            .define("ayakkudzpx")
            .withExistingDataBoxEdgeDevice("uwhcjyxccybv", "wjplma")
            .withStart("stcyohpfkyrkdbd")
            .withStop("iogsjkmnwq")
            .withRateInMbps(1931292786)
            .withDays(Arrays.asList(DayOfWeek.FRIDAY, DayOfWeek.TUESDAY, DayOfWeek.THURSDAY, DayOfWeek.FRIDAY))
            .create();

        Assertions.assertEquals("vvbalx", response.start());
        Assertions.assertEquals("l", response.stop());
        Assertions.assertEquals(677641870, response.rateInMbps());
        Assertions.assertEquals(DayOfWeek.FRIDAY, response.days().get(0));
    }
}
