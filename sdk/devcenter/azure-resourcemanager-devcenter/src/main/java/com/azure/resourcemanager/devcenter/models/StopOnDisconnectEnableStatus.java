// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Stop on disconnect enable or disable status. Indicates whether stop on disconnect to is either enabled or disabled.
 */
public final class StopOnDisconnectEnableStatus extends ExpandableStringEnum<StopOnDisconnectEnableStatus> {
    /** Static value Enabled for StopOnDisconnectEnableStatus. */
    public static final StopOnDisconnectEnableStatus ENABLED = fromString("Enabled");

    /** Static value Disabled for StopOnDisconnectEnableStatus. */
    public static final StopOnDisconnectEnableStatus DISABLED = fromString("Disabled");

    /**
     * Creates a new instance of StopOnDisconnectEnableStatus value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public StopOnDisconnectEnableStatus() {
    }

    /**
     * Creates or finds a StopOnDisconnectEnableStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding StopOnDisconnectEnableStatus.
     */
    @JsonCreator
    public static StopOnDisconnectEnableStatus fromString(String name) {
        return fromString(name, StopOnDisconnectEnableStatus.class);
    }

    /**
     * Gets known StopOnDisconnectEnableStatus values.
     *
     * @return known StopOnDisconnectEnableStatus values.
     */
    public static Collection<StopOnDisconnectEnableStatus> values() {
        return values(StopOnDisconnectEnableStatus.class);
    }
}