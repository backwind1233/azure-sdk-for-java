// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.logic.models.EdifactProcessingSettings;
import org.junit.jupiter.api.Assertions;

public final class EdifactProcessingSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        EdifactProcessingSettings model = BinaryData.fromString(
            "{\"maskSecurityInfo\":false,\"preserveInterchange\":false,\"suspendInterchangeOnError\":false,\"createEmptyXmlTagsForTrailingSeparators\":false,\"useDotAsDecimalSeparator\":true}")
            .toObject(EdifactProcessingSettings.class);
        Assertions.assertEquals(false, model.maskSecurityInfo());
        Assertions.assertEquals(false, model.preserveInterchange());
        Assertions.assertEquals(false, model.suspendInterchangeOnError());
        Assertions.assertEquals(false, model.createEmptyXmlTagsForTrailingSeparators());
        Assertions.assertEquals(true, model.useDotAsDecimalSeparator());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        EdifactProcessingSettings model = new EdifactProcessingSettings().withMaskSecurityInfo(false)
            .withPreserveInterchange(false)
            .withSuspendInterchangeOnError(false)
            .withCreateEmptyXmlTagsForTrailingSeparators(false)
            .withUseDotAsDecimalSeparator(true);
        model = BinaryData.fromObject(model).toObject(EdifactProcessingSettings.class);
        Assertions.assertEquals(false, model.maskSecurityInfo());
        Assertions.assertEquals(false, model.preserveInterchange());
        Assertions.assertEquals(false, model.suspendInterchangeOnError());
        Assertions.assertEquals(false, model.createEmptyXmlTagsForTrailingSeparators());
        Assertions.assertEquals(true, model.useDotAsDecimalSeparator());
    }
}
