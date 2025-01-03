// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.BinaryData;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.synapse.fluent.models.SelfHostedIntegrationRuntimeNodeInner;
import java.util.HashMap;
import java.util.Map;

public final class SelfHostedIntegrationRuntimeNodeInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SelfHostedIntegrationRuntimeNodeInner model = BinaryData.fromString(
            "{\"nodeName\":\"hgbvqtan\",\"machineName\":\"fdlpukhpyr\",\"hostServiceUri\":\"izjcpeog\",\"status\":\"Online\",\"capabilities\":{\"hfhpfp\":\"brouxdd\",\"ntacn\":\"zjzoywjxhpdul\",\"rljyoogwxhnsdu\":\"qwtehtuevr\"},\"versionStatus\":\"wbsreur\",\"version\":\"kfuarenlv\",\"registerTime\":\"2021-07-13T00:13:17Z\",\"lastConnectTime\":\"2021-03-27T02:17:20Z\",\"expiryTime\":\"2021-05-09T13:31:11Z\",\"lastStartTime\":\"2021-02-05T00:41:51Z\",\"lastStopTime\":\"2021-09-08T16:13:33Z\",\"lastUpdateResult\":\"None\",\"lastStartUpdateTime\":\"2020-12-28T15:08:46Z\",\"lastEndUpdateTime\":\"2021-03-29T16:51:14Z\",\"isActiveDispatcher\":false,\"concurrentJobsLimit\":451383418,\"maxConcurrentJobs\":705317709,\"\":{\"ymc\":\"dataqxypokkhminq\",\"ninvudbchaqdt\":\"datangnbdxxew\",\"tddmf\":\"dataqecrqctmxx\",\"pxbannovvoxc\":\"datahuytxzvtzn\"}}")
            .toObject(SelfHostedIntegrationRuntimeNodeInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SelfHostedIntegrationRuntimeNodeInner model = new SelfHostedIntegrationRuntimeNodeInner()
            .withAdditionalProperties(mapOf("nodeName", "hgbvqtan", "lastStartUpdateTime", "2020-12-28T15:08:46Z",
                "lastConnectTime", "2021-03-27T02:17:20Z", "capabilities",
                JacksonAdapter.createDefaultSerializerAdapter()
                    .deserialize(
                        "{\"hfhpfp\":\"brouxdd\",\"ntacn\":\"zjzoywjxhpdul\",\"rljyoogwxhnsdu\":\"qwtehtuevr\"}",
                        Object.class, SerializerEncoding.JSON),
                "hostServiceUri", "izjcpeog", "registerTime", "2021-07-13T00:13:17Z", "maxConcurrentJobs", 705317709,
                "lastStopTime", "2021-09-08T16:13:33Z", "version", "kfuarenlv", "machineName", "fdlpukhpyr",
                "versionStatus", "wbsreur", "concurrentJobsLimit", 451383418, "lastEndUpdateTime",
                "2021-03-29T16:51:14Z", "expiryTime", "2021-05-09T13:31:11Z", "lastStartTime", "2021-02-05T00:41:51Z",
                "lastUpdateResult", "None", "isActiveDispatcher", false, "status", "Online"));
        model = BinaryData.fromObject(model).toObject(SelfHostedIntegrationRuntimeNodeInner.class);
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
