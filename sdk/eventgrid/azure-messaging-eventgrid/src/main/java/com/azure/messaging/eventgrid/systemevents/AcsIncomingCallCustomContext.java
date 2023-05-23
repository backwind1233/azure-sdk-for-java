// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Custom Context of Incoming Call. */
@Fluent
public final class AcsIncomingCallCustomContext {
    /*
     * Sip Headers for incoming call
     */
    @JsonProperty(value = "sipHeaders")
    private Map<String, String> sipHeaders;

    /*
     * Voip Headers for incoming call
     */
    @JsonProperty(value = "voipHeaders")
    private Map<String, String> voipHeaders;

    /** Creates an instance of AcsIncomingCallCustomContext class. */
    public AcsIncomingCallCustomContext() {}

    /**
     * Get the sipHeaders property: Sip Headers for incoming call.
     *
     * @return the sipHeaders value.
     */
    public Map<String, String> getSipHeaders() {
        return this.sipHeaders;
    }

    /**
     * Set the sipHeaders property: Sip Headers for incoming call.
     *
     * @param sipHeaders the sipHeaders value to set.
     * @return the AcsIncomingCallCustomContext object itself.
     */
    public AcsIncomingCallCustomContext setSipHeaders(Map<String, String> sipHeaders) {
        this.sipHeaders = sipHeaders;
        return this;
    }

    /**
     * Get the voipHeaders property: Voip Headers for incoming call.
     *
     * @return the voipHeaders value.
     */
    public Map<String, String> getVoipHeaders() {
        return this.voipHeaders;
    }

    /**
     * Set the voipHeaders property: Voip Headers for incoming call.
     *
     * @param voipHeaders the voipHeaders value to set.
     * @return the AcsIncomingCallCustomContext object itself.
     */
    public AcsIncomingCallCustomContext setVoipHeaders(Map<String, String> voipHeaders) {
        this.voipHeaders = voipHeaders;
        return this;
    }
}