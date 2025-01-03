// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Weeks of month.
 */
public final class WeeksOfMonth extends ExpandableStringEnum<WeeksOfMonth> {
    /**
     * Static value First for WeeksOfMonth.
     */
    public static final WeeksOfMonth FIRST = fromString("First");

    /**
     * Static value Second for WeeksOfMonth.
     */
    public static final WeeksOfMonth SECOND = fromString("Second");

    /**
     * Static value Third for WeeksOfMonth.
     */
    public static final WeeksOfMonth THIRD = fromString("Third");

    /**
     * Static value Fourth for WeeksOfMonth.
     */
    public static final WeeksOfMonth FOURTH = fromString("Fourth");

    /**
     * Static value Last for WeeksOfMonth.
     */
    public static final WeeksOfMonth LAST = fromString("Last");

    /**
     * Creates a new instance of WeeksOfMonth value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public WeeksOfMonth() {
    }

    /**
     * Creates or finds a WeeksOfMonth from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding WeeksOfMonth.
     */
    public static WeeksOfMonth fromString(String name) {
        return fromString(name, WeeksOfMonth.class);
    }

    /**
     * Gets known WeeksOfMonth values.
     * 
     * @return known WeeksOfMonth values.
     */
    public static Collection<WeeksOfMonth> values() {
        return values(WeeksOfMonth.class);
    }
}
