// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.automation.fluent.SourceControlsClient;
import com.azure.resourcemanager.automation.fluent.models.SourceControlInner;
import com.azure.resourcemanager.automation.models.SourceControl;
import com.azure.resourcemanager.automation.models.SourceControls;

public final class SourceControlsImpl implements SourceControls {
    private static final ClientLogger LOGGER = new ClientLogger(SourceControlsImpl.class);

    private final SourceControlsClient innerClient;

    private final com.azure.resourcemanager.automation.AutomationManager serviceManager;

    public SourceControlsImpl(SourceControlsClient innerClient,
        com.azure.resourcemanager.automation.AutomationManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<Void> deleteWithResponse(String resourceGroupName, String automationAccountName,
        String sourceControlName, Context context) {
        return this.serviceClient()
            .deleteWithResponse(resourceGroupName, automationAccountName, sourceControlName, context);
    }

    public void delete(String resourceGroupName, String automationAccountName, String sourceControlName) {
        this.serviceClient().delete(resourceGroupName, automationAccountName, sourceControlName);
    }

    public Response<SourceControl> getWithResponse(String resourceGroupName, String automationAccountName,
        String sourceControlName, Context context) {
        Response<SourceControlInner> inner = this.serviceClient()
            .getWithResponse(resourceGroupName, automationAccountName, sourceControlName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new SourceControlImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public SourceControl get(String resourceGroupName, String automationAccountName, String sourceControlName) {
        SourceControlInner inner
            = this.serviceClient().get(resourceGroupName, automationAccountName, sourceControlName);
        if (inner != null) {
            return new SourceControlImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<SourceControl> listByAutomationAccount(String resourceGroupName,
        String automationAccountName) {
        PagedIterable<SourceControlInner> inner
            = this.serviceClient().listByAutomationAccount(resourceGroupName, automationAccountName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new SourceControlImpl(inner1, this.manager()));
    }

    public PagedIterable<SourceControl> listByAutomationAccount(String resourceGroupName, String automationAccountName,
        String filter, Context context) {
        PagedIterable<SourceControlInner> inner
            = this.serviceClient().listByAutomationAccount(resourceGroupName, automationAccountName, filter, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new SourceControlImpl(inner1, this.manager()));
    }

    public SourceControl getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String automationAccountName = ResourceManagerUtils.getValueFromIdByName(id, "automationAccounts");
        if (automationAccountName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'automationAccounts'.", id)));
        }
        String sourceControlName = ResourceManagerUtils.getValueFromIdByName(id, "sourceControls");
        if (sourceControlName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'sourceControls'.", id)));
        }
        return this.getWithResponse(resourceGroupName, automationAccountName, sourceControlName, Context.NONE)
            .getValue();
    }

    public Response<SourceControl> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String automationAccountName = ResourceManagerUtils.getValueFromIdByName(id, "automationAccounts");
        if (automationAccountName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'automationAccounts'.", id)));
        }
        String sourceControlName = ResourceManagerUtils.getValueFromIdByName(id, "sourceControls");
        if (sourceControlName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'sourceControls'.", id)));
        }
        return this.getWithResponse(resourceGroupName, automationAccountName, sourceControlName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String automationAccountName = ResourceManagerUtils.getValueFromIdByName(id, "automationAccounts");
        if (automationAccountName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'automationAccounts'.", id)));
        }
        String sourceControlName = ResourceManagerUtils.getValueFromIdByName(id, "sourceControls");
        if (sourceControlName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'sourceControls'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, automationAccountName, sourceControlName, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String automationAccountName = ResourceManagerUtils.getValueFromIdByName(id, "automationAccounts");
        if (automationAccountName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'automationAccounts'.", id)));
        }
        String sourceControlName = ResourceManagerUtils.getValueFromIdByName(id, "sourceControls");
        if (sourceControlName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'sourceControls'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, automationAccountName, sourceControlName, context);
    }

    private SourceControlsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.automation.AutomationManager manager() {
        return this.serviceManager;
    }

    public SourceControlImpl define(String name) {
        return new SourceControlImpl(name, this.manager());
    }
}
