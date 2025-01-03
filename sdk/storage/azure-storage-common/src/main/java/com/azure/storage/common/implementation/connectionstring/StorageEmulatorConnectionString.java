// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.common.implementation.connectionstring;

import com.azure.core.util.logging.ClientLogger;
import com.azure.storage.common.implementation.Constants;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * Type to parse a connection string and creates {@link StorageConnectionString} for emulator.
 */
final class StorageEmulatorConnectionString {
    /**
     * Try parsing the connection string and create {@link StorageConnectionString}
     * from it.
     *
     * @param settings the connection settings
     * @param logger the logger
     * @return the StorageConnectionString for emulator
     * @throws IllegalArgumentException If settings is invalid for emulator.
     */
    static StorageConnectionString tryCreate(final ConnectionSettings settings, final ClientLogger logger) {
        if (ConnectionSettingsFilter.matchesSpecification(settings, requireUseEmulatorFlag(), optionalProxyUri())) {
            if (!parseUseEmulatorFlag(settings)) {
                throw logger.logExceptionAsError(new IllegalArgumentException("Invalid connection string, "
                    + "the 'UseDevelopmentStorage' key must always have the value 'true'. "
                    + "Remove the flag entirely otherwise."));
            }
            String scheme;
            String host;
            if (settings.hasSetting(Constants.ConnectionStringConstants.EMULATOR_STORAGE_PROXY_URI_NAME)) {
                try {
                    URI devStoreProxyUri = new URI(
                        settings.getSettingValue(Constants.ConnectionStringConstants.EMULATOR_STORAGE_PROXY_URI_NAME));
                    scheme = devStoreProxyUri.getScheme();
                    host = devStoreProxyUri.getHost();
                } catch (URISyntaxException use) {
                    throw logger.logExceptionAsError(new RuntimeException(use));
                }
            } else {
                scheme = "http";
                host = "127.0.0.1";
            }

            StorageConnectionString storageConnectionString;
            try {
                URI blobPrimaryEndpoint = new URI(scheme + "://" + host + ":10000/devstoreaccount1");
                URI queuePrimaryEndpoint = new URI(scheme + "://" + host + ":10001/devstoreaccount1");
                URI tablePrimaryEndpoint = new URI(scheme + "://" + host + ":10002/devstoreaccount1");

                URI blobSecondaryEndpoint = new URI(scheme + "://" + host + ":10000/devstoreaccount1-secondary");
                URI queueSecondaryEndpoint = new URI(scheme + "://" + host + ":10001/devstoreaccount1-secondary");
                URI tableSecondaryEndpoint = new URI(scheme + "://" + host + ":10002/devstoreaccount1-secondary");

                storageConnectionString = new StorageConnectionString(StorageAuthenticationSettings.forEmulator(),
                    new StorageEndpoint(blobPrimaryEndpoint, blobSecondaryEndpoint),
                    new StorageEndpoint(queuePrimaryEndpoint, queueSecondaryEndpoint),
                    new StorageEndpoint(tablePrimaryEndpoint, tableSecondaryEndpoint), null, null);
            } catch (URISyntaxException use) {
                throw logger.logExceptionAsError(new RuntimeException(use));
            }
            return storageConnectionString;
        } else {
            return null;
        }
    }

    private static ConnectionSettingsFilter requireUseEmulatorFlag() {
        return ConnectionSettingsFilter.allRequired(Constants.ConnectionStringConstants.USE_EMULATOR_STORAGE_NAME);
    }

    private static ConnectionSettingsFilter optionalProxyUri() {
        return ConnectionSettingsFilter.optional(Constants.ConnectionStringConstants.EMULATOR_STORAGE_PROXY_URI_NAME);
    }

    private static Boolean parseUseEmulatorFlag(final ConnectionSettings settings) {
        return Boolean
            .parseBoolean(settings.getSettingValue(Constants.ConnectionStringConstants.USE_EMULATOR_STORAGE_NAME));
    }
}
