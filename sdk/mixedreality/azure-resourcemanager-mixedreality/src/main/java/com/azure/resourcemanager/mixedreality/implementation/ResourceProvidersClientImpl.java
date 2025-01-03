// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mixedreality.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.mixedreality.fluent.ResourceProvidersClient;
import com.azure.resourcemanager.mixedreality.fluent.models.CheckNameAvailabilityResponseInner;
import com.azure.resourcemanager.mixedreality.models.CheckNameAvailabilityRequest;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in ResourceProvidersClient.
 */
public final class ResourceProvidersClientImpl implements ResourceProvidersClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final ResourceProvidersService service;

    /**
     * The service client containing this operation class.
     */
    private final MixedRealityClientImpl client;

    /**
     * Initializes an instance of ResourceProvidersClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    ResourceProvidersClientImpl(MixedRealityClientImpl client) {
        this.service
            = RestProxy.create(ResourceProvidersService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for MixedRealityClientResourceProviders to be used by the proxy service
     * to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "MixedRealityClientRe")
    public interface ResourceProvidersService {
        @Headers({ "Content-Type: application/json" })
        @Post("/subscriptions/{subscriptionId}/providers/Microsoft.MixedReality/locations/{location}/checkNameAvailability")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<CheckNameAvailabilityResponseInner>> checkNameAvailabilityLocal(
            @HostParam("$host") String endpoint, @PathParam("subscriptionId") String subscriptionId,
            @PathParam("location") String location, @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") CheckNameAvailabilityRequest checkNameAvailability,
            @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * Check Name Availability for local uniqueness.
     * 
     * @param location The location in which uniqueness will be verified.
     * @param checkNameAvailability Check Name Availability Request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return check Name Availability Response along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<CheckNameAvailabilityResponseInner>> checkNameAvailabilityLocalWithResponseAsync(
        String location, CheckNameAvailabilityRequest checkNameAvailability) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (checkNameAvailability == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter checkNameAvailability is required and cannot be null."));
        } else {
            checkNameAvailability.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.checkNameAvailabilityLocal(this.client.getEndpoint(),
                this.client.getSubscriptionId(), location, this.client.getApiVersion(), checkNameAvailability, accept,
                context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Check Name Availability for local uniqueness.
     * 
     * @param location The location in which uniqueness will be verified.
     * @param checkNameAvailability Check Name Availability Request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return check Name Availability Response along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<CheckNameAvailabilityResponseInner>> checkNameAvailabilityLocalWithResponseAsync(
        String location, CheckNameAvailabilityRequest checkNameAvailability, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (checkNameAvailability == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter checkNameAvailability is required and cannot be null."));
        } else {
            checkNameAvailability.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.checkNameAvailabilityLocal(this.client.getEndpoint(), this.client.getSubscriptionId(), location,
            this.client.getApiVersion(), checkNameAvailability, accept, context);
    }

    /**
     * Check Name Availability for local uniqueness.
     * 
     * @param location The location in which uniqueness will be verified.
     * @param checkNameAvailability Check Name Availability Request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return check Name Availability Response on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<CheckNameAvailabilityResponseInner> checkNameAvailabilityLocalAsync(String location,
        CheckNameAvailabilityRequest checkNameAvailability) {
        return checkNameAvailabilityLocalWithResponseAsync(location, checkNameAvailability)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Check Name Availability for local uniqueness.
     * 
     * @param location The location in which uniqueness will be verified.
     * @param checkNameAvailability Check Name Availability Request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return check Name Availability Response along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<CheckNameAvailabilityResponseInner> checkNameAvailabilityLocalWithResponse(String location,
        CheckNameAvailabilityRequest checkNameAvailability, Context context) {
        return checkNameAvailabilityLocalWithResponseAsync(location, checkNameAvailability, context).block();
    }

    /**
     * Check Name Availability for local uniqueness.
     * 
     * @param location The location in which uniqueness will be verified.
     * @param checkNameAvailability Check Name Availability Request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return check Name Availability Response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CheckNameAvailabilityResponseInner checkNameAvailabilityLocal(String location,
        CheckNameAvailabilityRequest checkNameAvailability) {
        return checkNameAvailabilityLocalWithResponse(location, checkNameAvailability, Context.NONE).getValue();
    }
}
