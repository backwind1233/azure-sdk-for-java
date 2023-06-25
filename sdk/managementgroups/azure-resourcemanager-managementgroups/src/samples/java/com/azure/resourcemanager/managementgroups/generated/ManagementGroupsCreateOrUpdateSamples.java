// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managementgroups.generated;

import com.azure.resourcemanager.managementgroups.models.CreateManagementGroupDetails;
import com.azure.resourcemanager.managementgroups.models.CreateManagementGroupRequest;
import com.azure.resourcemanager.managementgroups.models.CreateParentGroupInfo;

/** Samples for ManagementGroups CreateOrUpdate. */
public final class ManagementGroupsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/managementgroups/resource-manager/Microsoft.Management/stable/2021-04-01/examples/PutManagementGroup.json
     */
    /**
     * Sample code: PutManagementGroup.
     *
     * @param manager Entry point to ManagementGroupsManager.
     */
    public static void putManagementGroup(com.azure.resourcemanager.managementgroups.ManagementGroupsManager manager) {
        manager
            .managementGroups()
            .createOrUpdate(
                "ChildGroup",
                new CreateManagementGroupRequest()
                    .withDisplayName("ChildGroup")
                    .withDetails(
                        new CreateManagementGroupDetails()
                            .withParent(
                                new CreateParentGroupInfo()
                                    .withId("/providers/Microsoft.Management/managementGroups/RootGroup"))),
                "no-cache",
                com.azure.core.util.Context.NONE);
    }
}