// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.securityinsights.SecurityInsightsManager;
import com.azure.resourcemanager.securityinsights.models.AttackTactic;
import com.azure.resourcemanager.securityinsights.models.Bookmark;
import com.azure.resourcemanager.securityinsights.models.IncidentSeverity;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class BookmarksListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"created\":\"2021-05-31T21:24:09Z\",\"createdBy\":{\"email\":\"wxy\",\"name\":\"zzzevtzqwczoc\",\"objectId\":\"6253c9fc-ff52-4ba4-8e5d-554d8bfb99e6\"},\"displayName\":\"bek\",\"labels\":[\"nfpkyvnhiys\",\"horkslhraqk\",\"wlwkfflaqwmwqog\",\"flteatnegef\"],\"notes\":\"xnjtqbgysib\",\"query\":\"hnvxwtd\",\"queryResult\":\"cbjdbtqy\",\"updated\":\"2021-03-01T11:06:18Z\",\"updatedBy\":{\"email\":\"saujqg\",\"name\":\"jvovoawhgjsmbc\",\"objectId\":\"69570323-8622-4203-9995-2351162bb328\"},\"eventTime\":\"2021-11-07T19:32Z\",\"queryStartTime\":\"2021-07-18T04:00:24Z\",\"queryEndTime\":\"2021-06-19T19:43:16Z\",\"incidentInfo\":{\"incidentId\":\"d\",\"severity\":\"Medium\",\"title\":\"nsdunrkzvzua\",\"relationName\":\"hgzuyxtrvf\"},\"entityMappings\":[{\"entityType\":\"kgqjbvitptpvsf\",\"fieldMappings\":[{},{},{},{}]}],\"tactics\":[\"Exfiltration\",\"PrivilegeEscalation\"],\"techniques\":[\"muwkgjwbyfdw\",\"bwxyldqtmggcpd\",\"megaj\",\"zctwymzsk\"]},\"etag\":\"kkgeseiphgliupq\",\"id\":\"oobkjlca\",\"name\":\"sqcomjiqiincevx\",\"type\":\"kdevpximzii\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        SecurityInsightsManager manager = SecurityInsightsManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<Bookmark> response
            = manager.bookmarks().list("uzkeutuip", "clzjwaqdz", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("kkgeseiphgliupq", response.iterator().next().etag());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-31T21:24:09Z"), response.iterator().next().created());
        Assertions.assertEquals(UUID.fromString("6253c9fc-ff52-4ba4-8e5d-554d8bfb99e6"),
            response.iterator().next().createdBy().objectId());
        Assertions.assertEquals("bek", response.iterator().next().displayName());
        Assertions.assertEquals("nfpkyvnhiys", response.iterator().next().labels().get(0));
        Assertions.assertEquals("xnjtqbgysib", response.iterator().next().notes());
        Assertions.assertEquals("hnvxwtd", response.iterator().next().query());
        Assertions.assertEquals("cbjdbtqy", response.iterator().next().queryResult());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-01T11:06:18Z"), response.iterator().next().updated());
        Assertions.assertEquals(UUID.fromString("69570323-8622-4203-9995-2351162bb328"),
            response.iterator().next().updatedBy().objectId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-07T19:32Z"), response.iterator().next().eventTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-18T04:00:24Z"),
            response.iterator().next().queryStartTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-19T19:43:16Z"),
            response.iterator().next().queryEndTime());
        Assertions.assertEquals("d", response.iterator().next().incidentInfo().incidentId());
        Assertions.assertEquals(IncidentSeverity.MEDIUM, response.iterator().next().incidentInfo().severity());
        Assertions.assertEquals("nsdunrkzvzua", response.iterator().next().incidentInfo().title());
        Assertions.assertEquals("hgzuyxtrvf", response.iterator().next().incidentInfo().relationName());
        Assertions.assertEquals("kgqjbvitptpvsf", response.iterator().next().entityMappings().get(0).entityType());
        Assertions.assertEquals(AttackTactic.EXFILTRATION, response.iterator().next().tactics().get(0));
        Assertions.assertEquals("muwkgjwbyfdw", response.iterator().next().techniques().get(0));
    }
}
