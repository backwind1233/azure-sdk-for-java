// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.selfhelp.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Properties returned with in an insight. */
@Fluent
public final class Diagnostic {
    /*
     * Solution Id
     */
    @JsonProperty(value = "solutionId")
    private String solutionId;

    /*
     * Denotes the status of the diagnostic resource.
     */
    @JsonProperty(value = "status")
    private Status status;

    /*
     * The problems (if any) detected by this insight.
     */
    @JsonProperty(value = "insights")
    private List<Insight> insights;

    /*
     * Error definition.
     */
    @JsonProperty(value = "error")
    private Error error;

    /** Creates an instance of Diagnostic class. */
    public Diagnostic() {
    }

    /**
     * Get the solutionId property: Solution Id.
     *
     * @return the solutionId value.
     */
    public String solutionId() {
        return this.solutionId;
    }

    /**
     * Set the solutionId property: Solution Id.
     *
     * @param solutionId the solutionId value to set.
     * @return the Diagnostic object itself.
     */
    public Diagnostic withSolutionId(String solutionId) {
        this.solutionId = solutionId;
        return this;
    }

    /**
     * Get the status property: Denotes the status of the diagnostic resource.
     *
     * @return the status value.
     */
    public Status status() {
        return this.status;
    }

    /**
     * Set the status property: Denotes the status of the diagnostic resource.
     *
     * @param status the status value to set.
     * @return the Diagnostic object itself.
     */
    public Diagnostic withStatus(Status status) {
        this.status = status;
        return this;
    }

    /**
     * Get the insights property: The problems (if any) detected by this insight.
     *
     * @return the insights value.
     */
    public List<Insight> insights() {
        return this.insights;
    }

    /**
     * Set the insights property: The problems (if any) detected by this insight.
     *
     * @param insights the insights value to set.
     * @return the Diagnostic object itself.
     */
    public Diagnostic withInsights(List<Insight> insights) {
        this.insights = insights;
        return this;
    }

    /**
     * Get the error property: Error definition.
     *
     * @return the error value.
     */
    public Error error() {
        return this.error;
    }

    /**
     * Set the error property: Error definition.
     *
     * @param error the error value to set.
     * @return the Diagnostic object itself.
     */
    public Diagnostic withError(Error error) {
        this.error = error;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (insights() != null) {
            insights().forEach(e -> e.validate());
        }
        if (error() != null) {
            error().validate();
        }
    }
}