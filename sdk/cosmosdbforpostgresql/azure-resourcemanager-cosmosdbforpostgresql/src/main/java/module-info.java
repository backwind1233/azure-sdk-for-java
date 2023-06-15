// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

module com.azure.resourcemanager.cosmosdbforpostgresql {
    requires transitive com.azure.core.management;

    exports com.azure.resourcemanager.cosmosdbforpostgresql;
    exports com.azure.resourcemanager.cosmosdbforpostgresql.fluent;
    exports com.azure.resourcemanager.cosmosdbforpostgresql.fluent.models;
    exports com.azure.resourcemanager.cosmosdbforpostgresql.models;

    opens com.azure.resourcemanager.cosmosdbforpostgresql.fluent.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
    opens com.azure.resourcemanager.cosmosdbforpostgresql.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
}