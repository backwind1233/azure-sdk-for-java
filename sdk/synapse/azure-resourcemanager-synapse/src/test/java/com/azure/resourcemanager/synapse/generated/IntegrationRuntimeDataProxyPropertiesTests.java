// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.synapse.models.EntityReference;
import com.azure.resourcemanager.synapse.models.IntegrationRuntimeDataProxyProperties;
import com.azure.resourcemanager.synapse.models.IntegrationRuntimeEntityReferenceType;
import org.junit.jupiter.api.Assertions;

public final class IntegrationRuntimeDataProxyPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IntegrationRuntimeDataProxyProperties model = BinaryData.fromString(
            "{\"connectVia\":{\"type\":\"LinkedServiceReference\",\"referenceName\":\"mvrscmqerndbrny\"},\"stagingLinkedService\":{\"type\":\"LinkedServiceReference\",\"referenceName\":\"fnnxrkad\"},\"path\":\"ynnfmuiii\"}")
            .toObject(IntegrationRuntimeDataProxyProperties.class);
        Assertions.assertEquals(IntegrationRuntimeEntityReferenceType.LINKED_SERVICE_REFERENCE,
            model.connectVia().type());
        Assertions.assertEquals("mvrscmqerndbrny", model.connectVia().referenceName());
        Assertions.assertEquals(IntegrationRuntimeEntityReferenceType.LINKED_SERVICE_REFERENCE,
            model.stagingLinkedService().type());
        Assertions.assertEquals("fnnxrkad", model.stagingLinkedService().referenceName());
        Assertions.assertEquals("ynnfmuiii", model.path());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IntegrationRuntimeDataProxyProperties model = new IntegrationRuntimeDataProxyProperties()
            .withConnectVia(
                new EntityReference().withType(IntegrationRuntimeEntityReferenceType.LINKED_SERVICE_REFERENCE)
                    .withReferenceName("mvrscmqerndbrny"))
            .withStagingLinkedService(
                new EntityReference().withType(IntegrationRuntimeEntityReferenceType.LINKED_SERVICE_REFERENCE)
                    .withReferenceName("fnnxrkad"))
            .withPath("ynnfmuiii");
        model = BinaryData.fromObject(model).toObject(IntegrationRuntimeDataProxyProperties.class);
        Assertions.assertEquals(IntegrationRuntimeEntityReferenceType.LINKED_SERVICE_REFERENCE,
            model.connectVia().type());
        Assertions.assertEquals("mvrscmqerndbrny", model.connectVia().referenceName());
        Assertions.assertEquals(IntegrationRuntimeEntityReferenceType.LINKED_SERVICE_REFERENCE,
            model.stagingLinkedService().type());
        Assertions.assertEquals("fnnxrkad", model.stagingLinkedService().referenceName());
        Assertions.assertEquals("ynnfmuiii", model.path());
    }
}
