// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicelinker.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Type of configuration to determine whether the configuration can be modified after creation. KeyvaultSecret means the
 * configuration references a key vault secret, such as App Service/ACA key vault reference. Default means the
 * configuration is real value, such as user name, raw secret, etc.
 */
public final class LinkerConfigurationType extends ExpandableStringEnum<LinkerConfigurationType> {
    /**
     * Static value Default for LinkerConfigurationType.
     */
    public static final LinkerConfigurationType DEFAULT = fromString("Default");

    /**
     * Static value KeyVaultSecret for LinkerConfigurationType.
     */
    public static final LinkerConfigurationType KEY_VAULT_SECRET = fromString("KeyVaultSecret");

    /**
     * Creates a new instance of LinkerConfigurationType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public LinkerConfigurationType() {
    }

    /**
     * Creates or finds a LinkerConfigurationType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding LinkerConfigurationType.
     */
    public static LinkerConfigurationType fromString(String name) {
        return fromString(name, LinkerConfigurationType.class);
    }

    /**
     * Gets known LinkerConfigurationType values.
     * 
     * @return known LinkerConfigurationType values.
     */
    public static Collection<LinkerConfigurationType> values() {
        return values(LinkerConfigurationType.class);
    }
}
