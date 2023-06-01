// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcehealth.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.resourcehealth.fluent.ChildResourcesClient;
import com.azure.resourcemanager.resourcehealth.fluent.models.AvailabilityStatusInner;
import com.azure.resourcemanager.resourcehealth.models.AvailabilityStatus;
import com.azure.resourcemanager.resourcehealth.models.ChildResources;

public final class ChildResourcesImpl implements ChildResources {
    private static final ClientLogger LOGGER = new ClientLogger(ChildResourcesImpl.class);

    private final ChildResourcesClient innerClient;

    private final com.azure.resourcemanager.resourcehealth.ResourceHealthManager serviceManager;

    public ChildResourcesImpl(
        ChildResourcesClient innerClient,
        com.azure.resourcemanager.resourcehealth.ResourceHealthManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<AvailabilityStatus> list(String resourceUri) {
        PagedIterable<AvailabilityStatusInner> inner = this.serviceClient().list(resourceUri);
        return Utils.mapPage(inner, inner1 -> new AvailabilityStatusImpl(inner1, this.manager()));
    }

    public PagedIterable<AvailabilityStatus> list(String resourceUri, String filter, String expand, Context context) {
        PagedIterable<AvailabilityStatusInner> inner = this.serviceClient().list(resourceUri, filter, expand, context);
        return Utils.mapPage(inner, inner1 -> new AvailabilityStatusImpl(inner1, this.manager()));
    }

    private ChildResourcesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.resourcehealth.ResourceHealthManager manager() {
        return this.serviceManager;
    }
}