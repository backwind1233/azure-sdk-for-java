// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.streamanalytics.models.CSharpFunctionBinding;
import com.azure.resourcemanager.streamanalytics.models.UpdateMode;
import org.junit.jupiter.api.Assertions;

public final class CSharpFunctionBindingTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CSharpFunctionBinding model = BinaryData.fromString(
            "{\"type\":\"Microsoft.StreamAnalytics/CLRUdf\",\"properties\":{\"dllPath\":\"wj\",\"class\":\"gdrjervnaenqpe\",\"method\":\"ndoygmifthnzdnd\",\"updateMode\":\"Refreshable\"}}")
            .toObject(CSharpFunctionBinding.class);
        Assertions.assertEquals("wj", model.dllPath());
        Assertions.assertEquals("gdrjervnaenqpe", model.classProperty());
        Assertions.assertEquals("ndoygmifthnzdnd", model.method());
        Assertions.assertEquals(UpdateMode.REFRESHABLE, model.updateMode());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CSharpFunctionBinding model = new CSharpFunctionBinding().withDllPath("wj")
            .withClassProperty("gdrjervnaenqpe")
            .withMethod("ndoygmifthnzdnd")
            .withUpdateMode(UpdateMode.REFRESHABLE);
        model = BinaryData.fromObject(model).toObject(CSharpFunctionBinding.class);
        Assertions.assertEquals("wj", model.dllPath());
        Assertions.assertEquals("gdrjervnaenqpe", model.classProperty());
        Assertions.assertEquals("ndoygmifthnzdnd", model.method());
        Assertions.assertEquals(UpdateMode.REFRESHABLE, model.updateMode());
    }
}
