// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.iothub.models.RouteProperties;
import com.azure.resourcemanager.iothub.models.RoutingSource;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class RoutePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RouteProperties model =
            BinaryData
                .fromString(
                    "{\"name\":\"uzoqft\",\"source\":\"DeviceConnectionStateEvents\",\"condition\":\"zrnkcqvyxlwh\",\"endpointNames\":[\"sicohoqqnwvlry\",\"vwhheunmmqhgyx\",\"konocu\"],\"isEnabled\":true}")
                .toObject(RouteProperties.class);
        Assertions.assertEquals("uzoqft", model.name());
        Assertions.assertEquals(RoutingSource.DEVICE_CONNECTION_STATE_EVENTS, model.source());
        Assertions.assertEquals("zrnkcqvyxlwh", model.condition());
        Assertions.assertEquals("sicohoqqnwvlry", model.endpointNames().get(0));
        Assertions.assertEquals(true, model.isEnabled());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RouteProperties model =
            new RouteProperties()
                .withName("uzoqft")
                .withSource(RoutingSource.DEVICE_CONNECTION_STATE_EVENTS)
                .withCondition("zrnkcqvyxlwh")
                .withEndpointNames(Arrays.asList("sicohoqqnwvlry", "vwhheunmmqhgyx", "konocu"))
                .withIsEnabled(true);
        model = BinaryData.fromObject(model).toObject(RouteProperties.class);
        Assertions.assertEquals("uzoqft", model.name());
        Assertions.assertEquals(RoutingSource.DEVICE_CONNECTION_STATE_EVENTS, model.source());
        Assertions.assertEquals("zrnkcqvyxlwh", model.condition());
        Assertions.assertEquals("sicohoqqnwvlry", model.endpointNames().get(0));
        Assertions.assertEquals(true, model.isEnabled());
    }
}