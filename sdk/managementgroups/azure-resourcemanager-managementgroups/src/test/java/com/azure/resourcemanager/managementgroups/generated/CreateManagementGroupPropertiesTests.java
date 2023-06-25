// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managementgroups.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managementgroups.fluent.models.CreateManagementGroupProperties;
import com.azure.resourcemanager.managementgroups.models.CreateManagementGroupDetails;
import com.azure.resourcemanager.managementgroups.models.CreateParentGroupInfo;
import org.junit.jupiter.api.Assertions;

public final class CreateManagementGroupPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CreateManagementGroupProperties model =
            BinaryData
                .fromString(
                    "{\"tenantId\":\"vkmijcmmxdcuf\",\"displayName\":\"srp\",\"details\":{\"version\":284710114,\"updatedTime\":\"2021-12-09T12:29:37Z\",\"updatedBy\":\"ezcxtbzsgfyccsne\",\"parent\":{\"id\":\"wzjeiach\",\"name\":\"osfln\",\"displayName\":\"sfqpteehz\"}},\"children\":[{\"type\":\"Microsoft.Management/managementGroups\",\"id\":\"rimz\",\"name\":\"pvswjdkirso\",\"displayName\":\"qxhcrmn\",\"children\":[]},{\"type\":\"Microsoft.Management/managementGroups\",\"id\":\"whdsoifiyip\",\"name\":\"sqwpgrjb\",\"displayName\":\"orcjxvsnby\",\"children\":[]},{\"type\":\"Microsoft.Management/managementGroups\",\"id\":\"ocpcy\",\"name\":\"urzafb\",\"displayName\":\"j\",\"children\":[]}]}")
                .toObject(CreateManagementGroupProperties.class);
        Assertions.assertEquals("srp", model.displayName());
        Assertions.assertEquals("wzjeiach", model.details().parent().id());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CreateManagementGroupProperties model =
            new CreateManagementGroupProperties()
                .withDisplayName("srp")
                .withDetails(
                    new CreateManagementGroupDetails().withParent(new CreateParentGroupInfo().withId("wzjeiach")));
        model = BinaryData.fromObject(model).toObject(CreateManagementGroupProperties.class);
        Assertions.assertEquals("srp", model.displayName());
        Assertions.assertEquals("wzjeiach", model.details().parent().id());
    }
}