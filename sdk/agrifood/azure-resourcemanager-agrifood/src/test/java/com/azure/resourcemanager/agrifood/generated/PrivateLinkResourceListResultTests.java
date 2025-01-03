// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.agrifood.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.agrifood.fluent.models.PrivateLinkResourceInner;
import com.azure.resourcemanager.agrifood.models.PrivateLinkResourceListResult;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

public final class PrivateLinkResourceListResultTests {
    @Test
    public void testDeserialize() {
        PrivateLinkResourceListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"groupId\":\"axkffei\",\"requiredMembers\":[],\"requiredZoneNames\":[]},\"id\":\"vmezy\",\"name\":\"shxmzsbbzoggigrx\",\"type\":\"burvjxxjnspy\"},{\"properties\":{\"groupId\":\"koen\",\"requiredMembers\":[],\"requiredZoneNames\":[]},\"id\":\"nvudwtiukb\",\"name\":\"dng\",\"type\":\"pocipazyxoegu\"},{\"properties\":{\"groupId\":\"npiucgygevqznty\",\"requiredMembers\":[],\"requiredZoneNames\":[]},\"id\":\"p\",\"name\":\"zcdrqjsdpydnfyhx\",\"type\":\"eoejzic\"},{\"properties\":{\"groupId\":\"sjttgzfbish\",\"requiredMembers\":[],\"requiredZoneNames\":[]},\"id\":\"ajdeyeamdphaga\",\"name\":\"pbuxwgipwhon\",\"type\":\"wkgshwa\"}]}")
            .toObject(PrivateLinkResourceListResult.class);
    }

    @Test
    public void testSerialize() {
        PrivateLinkResourceListResult model = new PrivateLinkResourceListResult()
            .withValue(Arrays.asList(new PrivateLinkResourceInner().withRequiredZoneNames(Arrays.asList()),
                new PrivateLinkResourceInner().withRequiredZoneNames(Arrays.asList()),
                new PrivateLinkResourceInner().withRequiredZoneNames(Arrays.asList()),
                new PrivateLinkResourceInner().withRequiredZoneNames(Arrays.asList())));
        model = BinaryData.fromObject(model).toObject(PrivateLinkResourceListResult.class);
    }
}
