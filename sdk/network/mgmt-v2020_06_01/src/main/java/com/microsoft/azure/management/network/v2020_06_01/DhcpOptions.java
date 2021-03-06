/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_06_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DhcpOptions contains an array of DNS servers available to VMs deployed in
 * the virtual network. Standard DHCP option for a subnet overrides VNET DHCP
 * options.
 */
public class DhcpOptions {
    /**
     * The list of DNS servers IP addresses.
     */
    @JsonProperty(value = "dnsServers")
    private List<String> dnsServers;

    /**
     * Get the list of DNS servers IP addresses.
     *
     * @return the dnsServers value
     */
    public List<String> dnsServers() {
        return this.dnsServers;
    }

    /**
     * Set the list of DNS servers IP addresses.
     *
     * @param dnsServers the dnsServers value to set
     * @return the DhcpOptions object itself.
     */
    public DhcpOptions withDnsServers(List<String> dnsServers) {
        this.dnsServers = dnsServers;
        return this;
    }

}
