// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservicefleet.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.containerservicefleet.models.MemberUpdateStatus;

public final class MemberUpdateStatusTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MemberUpdateStatus model =
            BinaryData
                .fromString(
                    "{\"status\":{\"startTime\":\"2021-09-06T05:45:20Z\",\"completedTime\":\"2021-02-14T15:50:10Z\",\"state\":\"Completed\"},\"name\":\"djwzrlov\",\"clusterResourceId\":\"lwhijcoejctbzaq\",\"operationId\":\"sycbkbfk\"}")
                .toObject(MemberUpdateStatus.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MemberUpdateStatus model = new MemberUpdateStatus();
        model = BinaryData.fromObject(model).toObject(MemberUpdateStatus.class);
    }
}