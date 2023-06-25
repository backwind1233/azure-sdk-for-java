// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated;

import com.azure.core.util.Context;

/** Samples for Storages Delete. */
public final class StoragesDeleteSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/stable/2022-12-01/examples/Storages_Delete.json
     */
    /**
     * Sample code: Storages_Delete.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void storagesDelete(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .springServices()
            .manager()
            .serviceClient()
            .getStorages()
            .delete("myResourceGroup", "myservice", "mystorage", Context.NONE);
    }
}