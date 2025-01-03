// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.workloadssapvirtualinstance.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.workloadssapvirtualinstance.models.ExternalInstallationSoftwareConfiguration;
import org.junit.jupiter.api.Assertions;

public final class ExternalInstallationSoftwareConfigurationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ExternalInstallationSoftwareConfiguration model
            = BinaryData.fromString("{\"softwareInstallationType\":\"External\",\"centralServerVmId\":\"oayqc\"}")
                .toObject(ExternalInstallationSoftwareConfiguration.class);
        Assertions.assertEquals("oayqc", model.centralServerVmId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ExternalInstallationSoftwareConfiguration model
            = new ExternalInstallationSoftwareConfiguration().withCentralServerVmId("oayqc");
        model = BinaryData.fromObject(model).toObject(ExternalInstallationSoftwareConfiguration.class);
        Assertions.assertEquals("oayqc", model.centralServerVmId());
    }
}
