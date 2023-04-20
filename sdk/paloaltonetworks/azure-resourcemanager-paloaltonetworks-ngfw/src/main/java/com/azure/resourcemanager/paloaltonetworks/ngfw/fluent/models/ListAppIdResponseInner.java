// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ListAppIdResponse model. */
@Fluent
public final class ListAppIdResponseInner {
    /*
     * List of AppIds
     */
    @JsonProperty(value = "value", required = true)
    private List<String> value;

    /*
     * next Link
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Creates an instance of ListAppIdResponseInner class. */
    public ListAppIdResponseInner() {
    }

    /**
     * Get the value property: List of AppIds.
     *
     * @return the value value.
     */
    public List<String> value() {
        return this.value;
    }

    /**
     * Set the value property: List of AppIds.
     *
     * @param value the value value to set.
     * @return the ListAppIdResponseInner object itself.
     */
    public ListAppIdResponseInner withValue(List<String> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: next Link.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: next Link.
     *
     * @param nextLink the nextLink value to set.
     * @return the ListAppIdResponseInner object itself.
     */
    public ListAppIdResponseInner withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property value in model ListAppIdResponseInner"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ListAppIdResponseInner.class);
}