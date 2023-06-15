// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.trafficmanager.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * If Always Serve is enabled, probing for endpoint health will be disabled and endpoints will be included in the
 * traffic routing method.
 */
public final class AlwaysServe extends ExpandableStringEnum<AlwaysServe> {
    /** Static value Enabled for AlwaysServe. */
    public static final AlwaysServe ENABLED = fromString("Enabled");

    /** Static value Disabled for AlwaysServe. */
    public static final AlwaysServe DISABLED = fromString("Disabled");

    /**
     * Creates a new instance of AlwaysServe value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public AlwaysServe() {
    }

    /**
     * Creates or finds a AlwaysServe from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AlwaysServe.
     */
    @JsonCreator
    public static AlwaysServe fromString(String name) {
        return fromString(name, AlwaysServe.class);
    }

    /**
     * Gets known AlwaysServe values.
     *
     * @return known AlwaysServe values.
     */
    public static Collection<AlwaysServe> values() {
        return values(AlwaysServe.class);
    }
}