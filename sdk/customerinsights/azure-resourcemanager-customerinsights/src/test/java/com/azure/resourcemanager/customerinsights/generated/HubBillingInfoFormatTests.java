// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.customerinsights.models.HubBillingInfoFormat;
import org.junit.jupiter.api.Assertions;

public final class HubBillingInfoFormatTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        HubBillingInfoFormat model
            = BinaryData.fromString("{\"skuName\":\"y\",\"minUnits\":1574574303,\"maxUnits\":257838249}")
                .toObject(HubBillingInfoFormat.class);
        Assertions.assertEquals("y", model.skuName());
        Assertions.assertEquals(1574574303, model.minUnits());
        Assertions.assertEquals(257838249, model.maxUnits());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        HubBillingInfoFormat model
            = new HubBillingInfoFormat().withSkuName("y").withMinUnits(1574574303).withMaxUnits(257838249);
        model = BinaryData.fromObject(model).toObject(HubBillingInfoFormat.class);
        Assertions.assertEquals("y", model.skuName());
        Assertions.assertEquals(1574574303, model.minUnits());
        Assertions.assertEquals(257838249, model.maxUnits());
    }
}
