/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.appservice.v2019_08_01.implementation;

import com.microsoft.azure.management.appservice.v2019_08_01.Recommendation;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

import java.util.List;
import com.microsoft.azure.management.appservice.v2019_08_01.Channels;
import org.joda.time.DateTime;
import com.microsoft.azure.management.appservice.v2019_08_01.NotificationLevel;
import java.util.UUID;
import com.microsoft.azure.management.appservice.v2019_08_01.ResourceScopeType;

class RecommendationImpl extends WrapperImpl<RecommendationInner> implements Recommendation {
    private final AppServiceManager manager;

    RecommendationImpl(RecommendationInner inner,  AppServiceManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public AppServiceManager manager() {
        return this.manager;
    }



    @Override
    public String actionName() {
        return this.inner().actionName();
    }

    @Override
    public String bladeName() {
        return this.inner().bladeName();
    }

    @Override
    public List<String> categoryTags() {
        return this.inner().categoryTags();
    }

    @Override
    public Channels channels() {
        return this.inner().channels();
    }

    @Override
    public DateTime creationTime() {
        return this.inner().creationTime();
    }

    @Override
    public String displayName() {
        return this.inner().displayName();
    }

    @Override
    public Integer enabled() {
        return this.inner().enabled();
    }

    @Override
    public DateTime endTime() {
        return this.inner().endTime();
    }

    @Override
    public String extensionName() {
        return this.inner().extensionName();
    }

    @Override
    public String forwardLink() {
        return this.inner().forwardLink();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public Boolean isDynamic() {
        return this.inner().isDynamic();
    }

    @Override
    public String kind() {
        return this.inner().kind();
    }

    @Override
    public NotificationLevel level() {
        return this.inner().level();
    }

    @Override
    public String message() {
        return this.inner().message();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public DateTime nextNotificationTime() {
        return this.inner().nextNotificationTime();
    }

    @Override
    public DateTime notificationExpirationTime() {
        return this.inner().notificationExpirationTime();
    }

    @Override
    public DateTime notifiedTime() {
        return this.inner().notifiedTime();
    }

    @Override
    public UUID recommendationId() {
        return this.inner().recommendationId();
    }

    @Override
    public String resourceId() {
        return this.inner().resourceId();
    }

    @Override
    public ResourceScopeType resourceScope() {
        return this.inner().resourceScope();
    }

    @Override
    public String ruleName() {
        return this.inner().ruleName();
    }

    @Override
    public Double score() {
        return this.inner().score();
    }

    @Override
    public DateTime startTime() {
        return this.inner().startTime();
    }

    @Override
    public List<String> states() {
        return this.inner().states();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
