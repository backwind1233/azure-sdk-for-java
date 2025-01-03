// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.digitaltwins.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.digitaltwins.fluent.models.GroupIdInformationInner;
import com.azure.resourcemanager.digitaltwins.models.GroupIdInformationProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class GroupIdInformationInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GroupIdInformationInner model = BinaryData.fromString(
            "{\"properties\":{\"groupId\":\"mjmvxieduugidyjr\",\"requiredMembers\":[\"y\"],\"requiredZoneNames\":[\"v\",\"xc\",\"onpc\",\"hocohslkev\"]},\"id\":\"ggzfbu\",\"name\":\"mvfaxkffeiith\",\"type\":\"m\"}")
            .toObject(GroupIdInformationInner.class);
        Assertions.assertEquals("mjmvxieduugidyjr", model.properties().groupId());
        Assertions.assertEquals("y", model.properties().requiredMembers().get(0));
        Assertions.assertEquals("v", model.properties().requiredZoneNames().get(0));
        Assertions.assertEquals("ggzfbu", model.id());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GroupIdInformationInner model = new GroupIdInformationInner()
            .withProperties(new GroupIdInformationProperties().withGroupId("mjmvxieduugidyjr")
                .withRequiredMembers(Arrays.asList("y"))
                .withRequiredZoneNames(Arrays.asList("v", "xc", "onpc", "hocohslkev")))
            .withId("ggzfbu");
        model = BinaryData.fromObject(model).toObject(GroupIdInformationInner.class);
        Assertions.assertEquals("mjmvxieduugidyjr", model.properties().groupId());
        Assertions.assertEquals("y", model.properties().requiredMembers().get(0));
        Assertions.assertEquals("v", model.properties().requiredZoneNames().get(0));
        Assertions.assertEquals("ggzfbu", model.id());
    }
}
