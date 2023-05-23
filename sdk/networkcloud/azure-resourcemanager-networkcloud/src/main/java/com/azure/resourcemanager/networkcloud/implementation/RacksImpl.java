// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.networkcloud.fluent.RacksClient;
import com.azure.resourcemanager.networkcloud.fluent.models.RackInner;
import com.azure.resourcemanager.networkcloud.models.Rack;
import com.azure.resourcemanager.networkcloud.models.Racks;

public final class RacksImpl implements Racks {
    private static final ClientLogger LOGGER = new ClientLogger(RacksImpl.class);

    private final RacksClient innerClient;

    private final com.azure.resourcemanager.networkcloud.NetworkCloudManager serviceManager;

    public RacksImpl(
        RacksClient innerClient, com.azure.resourcemanager.networkcloud.NetworkCloudManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Rack> list() {
        PagedIterable<RackInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new RackImpl(inner1, this.manager()));
    }

    public PagedIterable<Rack> list(Context context) {
        PagedIterable<RackInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new RackImpl(inner1, this.manager()));
    }

    public PagedIterable<Rack> listByResourceGroup(String resourceGroupName) {
        PagedIterable<RackInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new RackImpl(inner1, this.manager()));
    }

    public PagedIterable<Rack> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<RackInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new RackImpl(inner1, this.manager()));
    }

    public Response<Rack> getByResourceGroupWithResponse(String resourceGroupName, String rackName, Context context) {
        Response<RackInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, rackName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new RackImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Rack getByResourceGroup(String resourceGroupName, String rackName) {
        RackInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, rackName);
        if (inner != null) {
            return new RackImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String rackName) {
        this.serviceClient().delete(resourceGroupName, rackName);
    }

    public void delete(String resourceGroupName, String rackName, Context context) {
        this.serviceClient().delete(resourceGroupName, rackName, context);
    }

    public Rack getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String rackName = Utils.getValueFromIdByName(id, "racks");
        if (rackName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'racks'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, rackName, Context.NONE).getValue();
    }

    public Response<Rack> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String rackName = Utils.getValueFromIdByName(id, "racks");
        if (rackName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'racks'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, rackName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String rackName = Utils.getValueFromIdByName(id, "racks");
        if (rackName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'racks'.", id)));
        }
        this.delete(resourceGroupName, rackName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String rackName = Utils.getValueFromIdByName(id, "racks");
        if (rackName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'racks'.", id)));
        }
        this.delete(resourceGroupName, rackName, context);
    }

    private RacksClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.networkcloud.NetworkCloudManager manager() {
        return this.serviceManager;
    }

    public RackImpl define(String name) {
        return new RackImpl(name, this.manager());
    }
}