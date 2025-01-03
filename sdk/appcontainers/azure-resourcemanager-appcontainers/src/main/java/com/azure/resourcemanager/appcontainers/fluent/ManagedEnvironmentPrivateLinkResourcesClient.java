// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appcontainers.fluent.models.PrivateLinkResourceInner;

/**
 * An instance of this class provides access to all the operations defined in
 * ManagedEnvironmentPrivateLinkResourcesClient.
 */
public interface ManagedEnvironmentPrivateLinkResourcesClient {
    /**
     * List private link resources for a given managed environment.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Managed Environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of private link resources as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PrivateLinkResourceInner> list(String resourceGroupName, String environmentName);

    /**
     * List private link resources for a given managed environment.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Managed Environment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of private link resources as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PrivateLinkResourceInner> list(String resourceGroupName, String environmentName, Context context);
}
