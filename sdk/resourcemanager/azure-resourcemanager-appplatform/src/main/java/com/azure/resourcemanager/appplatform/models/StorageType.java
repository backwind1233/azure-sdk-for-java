// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for StorageType. */
public final class StorageType extends ExpandableStringEnum<StorageType> {
    /** Static value StorageAccount for StorageType. */
    public static final StorageType STORAGE_ACCOUNT = fromString("StorageAccount");

    /**
     * Creates or finds a StorageType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding StorageType.
     */
    @JsonCreator
    public static StorageType fromString(String name) {
        return fromString(name, StorageType.class);
    }

    /**
     * Gets known StorageType values.
     *
     * @return known StorageType values.
     */
    public static Collection<StorageType> values() {
        return values(StorageType.class);
    }
}