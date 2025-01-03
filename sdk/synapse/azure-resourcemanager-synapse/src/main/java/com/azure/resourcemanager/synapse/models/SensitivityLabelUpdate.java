// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.resourcemanager.synapse.fluent.models.SensitivityLabelUpdateInner;

/**
 * An immutable client-side representation of SensitivityLabelUpdate.
 */
public interface SensitivityLabelUpdate {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the op property: The op property.
     * 
     * @return the op value.
     */
    SensitivityLabelUpdateKind op();

    /**
     * Gets the schema property: Schema name of the column to update.
     * 
     * @return the schema value.
     */
    String schema();

    /**
     * Gets the table property: Table name of the column to update.
     * 
     * @return the table value.
     */
    String table();

    /**
     * Gets the column property: Column name to update.
     * 
     * @return the column value.
     */
    String column();

    /**
     * Gets the sensitivityLabel property: The sensitivity label information to apply on a column.
     * 
     * @return the sensitivityLabel value.
     */
    SensitivityLabel sensitivityLabel();

    /**
     * Gets the inner com.azure.resourcemanager.synapse.fluent.models.SensitivityLabelUpdateInner object.
     * 
     * @return the inner object.
     */
    SensitivityLabelUpdateInner innerModel();
}
