// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.managednetworkfabric.models.AdministrativeState;
import com.azure.resourcemanager.managednetworkfabric.models.ConfigurationState;
import com.azure.resourcemanager.managednetworkfabric.models.NetworkTapPropertiesDestinationsItem;
import com.azure.resourcemanager.managednetworkfabric.models.PollingType;
import com.azure.resourcemanager.managednetworkfabric.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** The Network Tap resource definition. */
@Fluent
public final class NetworkTapInner extends Resource {
    /*
     * Resource properties.
     */
    @JsonProperty(value = "properties", required = true)
    private NetworkTapProperties innerProperties = new NetworkTapProperties();

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of NetworkTapInner class. */
    public NetworkTapInner() {
    }

    /**
     * Get the innerProperties property: Resource properties.
     *
     * @return the innerProperties value.
     */
    private NetworkTapProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /** {@inheritDoc} */
    @Override
    public NetworkTapInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public NetworkTapInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the networkPacketBrokerId property: ARM resource ID of the Network Packet Broker.
     *
     * @return the networkPacketBrokerId value.
     */
    public String networkPacketBrokerId() {
        return this.innerProperties() == null ? null : this.innerProperties().networkPacketBrokerId();
    }

    /**
     * Set the networkPacketBrokerId property: ARM resource ID of the Network Packet Broker.
     *
     * @param networkPacketBrokerId the networkPacketBrokerId value to set.
     * @return the NetworkTapInner object itself.
     */
    public NetworkTapInner withNetworkPacketBrokerId(String networkPacketBrokerId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkTapProperties();
        }
        this.innerProperties().withNetworkPacketBrokerId(networkPacketBrokerId);
        return this;
    }

    /**
     * Get the sourceTapRuleId property: Source Tap Rule Id. ARM Resource ID of the Network Tap Rule.
     *
     * @return the sourceTapRuleId value.
     */
    public String sourceTapRuleId() {
        return this.innerProperties() == null ? null : this.innerProperties().sourceTapRuleId();
    }

    /**
     * Get the destinations property: List of destinations to send the filter traffic.
     *
     * @return the destinations value.
     */
    public List<NetworkTapPropertiesDestinationsItem> destinations() {
        return this.innerProperties() == null ? null : this.innerProperties().destinations();
    }

    /**
     * Set the destinations property: List of destinations to send the filter traffic.
     *
     * @param destinations the destinations value to set.
     * @return the NetworkTapInner object itself.
     */
    public NetworkTapInner withDestinations(List<NetworkTapPropertiesDestinationsItem> destinations) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkTapProperties();
        }
        this.innerProperties().withDestinations(destinations);
        return this;
    }

    /**
     * Get the pollingType property: Polling type.
     *
     * @return the pollingType value.
     */
    public PollingType pollingType() {
        return this.innerProperties() == null ? null : this.innerProperties().pollingType();
    }

    /**
     * Set the pollingType property: Polling type.
     *
     * @param pollingType the pollingType value to set.
     * @return the NetworkTapInner object itself.
     */
    public NetworkTapInner withPollingType(PollingType pollingType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkTapProperties();
        }
        this.innerProperties().withPollingType(pollingType);
        return this;
    }

    /**
     * Get the configurationState property: Gets the configurations state of the resource.
     *
     * @return the configurationState value.
     */
    public ConfigurationState configurationState() {
        return this.innerProperties() == null ? null : this.innerProperties().configurationState();
    }

    /**
     * Get the provisioningState property: Provides you the latest status of the NFC service, whether it is Accepted,
     * updating, Succeeded or Failed. During this process, the states keep changing based on the status of Network Tap
     * provisioning.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the administrativeState property: Administrative state of the resource. Example -Enabled/Disabled.
     *
     * @return the administrativeState value.
     */
    public AdministrativeState administrativeState() {
        return this.innerProperties() == null ? null : this.innerProperties().administrativeState();
    }

    /**
     * Get the annotation property: Switch configuration description.
     *
     * @return the annotation value.
     */
    public String annotation() {
        return this.innerProperties() == null ? null : this.innerProperties().annotation();
    }

    /**
     * Set the annotation property: Switch configuration description.
     *
     * @param annotation the annotation value to set.
     * @return the NetworkTapInner object itself.
     */
    public NetworkTapInner withAnnotation(String annotation) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkTapProperties();
        }
        this.innerProperties().withAnnotation(annotation);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property innerProperties in model NetworkTapInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(NetworkTapInner.class);
}
