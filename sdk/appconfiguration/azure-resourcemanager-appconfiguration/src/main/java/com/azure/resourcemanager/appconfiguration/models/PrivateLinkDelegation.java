// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appconfiguration.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The data plane proxy private link delegation. This property manages if a request from delegated Azure Resource
 * Manager (ARM) private link is allowed when the data plane resource requires private link.
 */
public final class PrivateLinkDelegation extends ExpandableStringEnum<PrivateLinkDelegation> {
    /**
     * Static value Enabled for PrivateLinkDelegation.
     */
    public static final PrivateLinkDelegation ENABLED = fromString("Enabled");

    /**
     * Static value Disabled for PrivateLinkDelegation.
     */
    public static final PrivateLinkDelegation DISABLED = fromString("Disabled");

    /**
     * Creates a new instance of PrivateLinkDelegation value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public PrivateLinkDelegation() {
    }

    /**
     * Creates or finds a PrivateLinkDelegation from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding PrivateLinkDelegation.
     */
    public static PrivateLinkDelegation fromString(String name) {
        return fromString(name, PrivateLinkDelegation.class);
    }

    /**
     * Gets known PrivateLinkDelegation values.
     * 
     * @return known PrivateLinkDelegation values.
     */
    public static Collection<PrivateLinkDelegation> values() {
        return values(PrivateLinkDelegation.class);
    }
}
