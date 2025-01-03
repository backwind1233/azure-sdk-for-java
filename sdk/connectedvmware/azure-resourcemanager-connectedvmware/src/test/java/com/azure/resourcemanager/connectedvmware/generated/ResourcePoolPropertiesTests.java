// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.connectedvmware.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.connectedvmware.fluent.models.ResourcePoolProperties;
import org.junit.jupiter.api.Assertions;

public final class ResourcePoolPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ResourcePoolProperties model = BinaryData.fromString(
            "{\"uuid\":\"wryoqpsoacc\",\"vCenterId\":\"zakljlahbc\",\"moRefId\":\"ffdfdosygexpa\",\"inventoryItemId\":\"akhmsbzjhcrz\",\"moName\":\"dphlxaolt\",\"cpuSharesLevel\":\"trg\",\"cpuReservationMHz\":2908308735087138118,\"cpuLimitMHz\":944566396017418310,\"memSharesLevel\":\"inzgvfcj\",\"memReservationMB\":7824790174257851163,\"memLimitMB\":4946734162442896103,\"memOverallUsageGB\":6186462241741426226,\"memCapacityGB\":8522131427631788859,\"cpuOverallUsageMHz\":5924201566480225751,\"cpuCapacityMHz\":5636651603478237083,\"customResourceName\":\"peqfpjkjl\",\"datastoreIds\":[\"pdvhpfxxypin\",\"nmayhuybb\",\"podepoo\"],\"networkIds\":[\"uvamiheognarxzxt\",\"eotusivyevc\",\"iqihn\"],\"statuses\":[{\"type\":\"bwjzr\",\"status\":\"ygxgispemvtz\",\"reason\":\"ufubl\",\"message\":\"fxqeof\",\"severity\":\"e\",\"lastUpdatedAt\":\"2021-01-23T13:20:17Z\"},{\"type\":\"jbasvmsmjqulngs\",\"status\":\"nbybkzgcwrwcl\",\"reason\":\"wrljdouskc\",\"message\":\"kocrcjdkwtnhx\",\"severity\":\"jbiksqrglssai\",\"lastUpdatedAt\":\"2021-09-05T10:45:28Z\"}],\"provisioningState\":\"Accepted\"}")
            .toObject(ResourcePoolProperties.class);
        Assertions.assertEquals("zakljlahbc", model.vCenterId());
        Assertions.assertEquals("ffdfdosygexpa", model.moRefId());
        Assertions.assertEquals("akhmsbzjhcrz", model.inventoryItemId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ResourcePoolProperties model = new ResourcePoolProperties().withVCenterId("zakljlahbc")
            .withMoRefId("ffdfdosygexpa")
            .withInventoryItemId("akhmsbzjhcrz");
        model = BinaryData.fromObject(model).toObject(ResourcePoolProperties.class);
        Assertions.assertEquals("zakljlahbc", model.vCenterId());
        Assertions.assertEquals("ffdfdosygexpa", model.moRefId());
        Assertions.assertEquals("akhmsbzjhcrz", model.inventoryItemId());
    }
}
