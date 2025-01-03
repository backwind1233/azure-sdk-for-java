// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.databox.models.GranularCopyLogDetails;

public final class GranularCopyLogDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GranularCopyLogDetails model = BinaryData.fromString("{\"copyLogDetailsType\":\"GranularCopyLogDetails\"}")
            .toObject(GranularCopyLogDetails.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GranularCopyLogDetails model = new GranularCopyLogDetails();
        model = BinaryData.fromObject(model).toObject(GranularCopyLogDetails.class);
    }
}
