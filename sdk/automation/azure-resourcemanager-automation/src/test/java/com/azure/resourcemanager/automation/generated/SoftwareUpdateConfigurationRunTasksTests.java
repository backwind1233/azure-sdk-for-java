// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.automation.models.SoftwareUpdateConfigurationRunTaskProperties;
import com.azure.resourcemanager.automation.models.SoftwareUpdateConfigurationRunTasks;
import org.junit.jupiter.api.Assertions;

public final class SoftwareUpdateConfigurationRunTasksTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SoftwareUpdateConfigurationRunTasks model = BinaryData.fromString(
            "{\"preTask\":{\"status\":\"peuknijd\",\"source\":\"yespydjfbocyv\",\"jobId\":\"ulrtywikdmh\"},\"postTask\":{\"status\":\"uflgbhgauacdixm\",\"source\":\"f\",\"jobId\":\"ryjqgdkf\"}}")
            .toObject(SoftwareUpdateConfigurationRunTasks.class);
        Assertions.assertEquals("peuknijd", model.preTask().status());
        Assertions.assertEquals("yespydjfbocyv", model.preTask().source());
        Assertions.assertEquals("ulrtywikdmh", model.preTask().jobId());
        Assertions.assertEquals("uflgbhgauacdixm", model.postTask().status());
        Assertions.assertEquals("f", model.postTask().source());
        Assertions.assertEquals("ryjqgdkf", model.postTask().jobId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SoftwareUpdateConfigurationRunTasks model = new SoftwareUpdateConfigurationRunTasks()
            .withPreTask(new SoftwareUpdateConfigurationRunTaskProperties().withStatus("peuknijd")
                .withSource("yespydjfbocyv")
                .withJobId("ulrtywikdmh"))
            .withPostTask(new SoftwareUpdateConfigurationRunTaskProperties().withStatus("uflgbhgauacdixm")
                .withSource("f")
                .withJobId("ryjqgdkf"));
        model = BinaryData.fromObject(model).toObject(SoftwareUpdateConfigurationRunTasks.class);
        Assertions.assertEquals("peuknijd", model.preTask().status());
        Assertions.assertEquals("yespydjfbocyv", model.preTask().source());
        Assertions.assertEquals("ulrtywikdmh", model.preTask().jobId());
        Assertions.assertEquals("uflgbhgauacdixm", model.postTask().status());
        Assertions.assertEquals("f", model.postTask().source());
        Assertions.assertEquals("ryjqgdkf", model.postTask().jobId());
    }
}
