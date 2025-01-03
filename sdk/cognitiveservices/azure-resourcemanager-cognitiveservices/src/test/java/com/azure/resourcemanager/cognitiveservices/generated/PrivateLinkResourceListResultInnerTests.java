// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.cognitiveservices.fluent.models.PrivateLinkResourceListResultInner;
import com.azure.resourcemanager.cognitiveservices.models.PrivateLinkResource;
import com.azure.resourcemanager.cognitiveservices.models.PrivateLinkResourceProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class PrivateLinkResourceListResultInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateLinkResourceListResultInner model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"groupId\":\"xwbpokulpiuj\",\"requiredMembers\":[\"sipqii\",\"byuqerpqlp\"],\"requiredZoneNames\":[\"ciuqgbdb\",\"t\",\"uvfbtkuwh\",\"mhykojoxafnndl\"],\"displayName\":\"chkoymkcdyh\"},\"id\":\"pkkpw\",\"name\":\"reqnovvqfov\",\"type\":\"jxywsuws\"},{\"properties\":{\"groupId\":\"ndsytgadg\",\"requiredMembers\":[\"ea\",\"neqn\",\"arrwlquu\",\"jfqka\"],\"requiredZoneNames\":[\"iipfpubj\",\"bwwift\"],\"displayName\":\"qkvpuvksgplsakn\"},\"id\":\"n\",\"name\":\"synljphuopxodl\",\"type\":\"iyntorzihle\"},{\"properties\":{\"groupId\":\"swsrms\",\"requiredMembers\":[\"rpzbchckqqzqi\",\"xiy\"],\"requiredZoneNames\":[\"i\",\"ynkedyatrwyhqmib\",\"yhwitsmypyynpcdp\",\"mnzgmwznmabi\"],\"displayName\":\"sorgj\"},\"id\":\"xbldtlwwrlkdmtn\",\"name\":\"vokotllxdyh\",\"type\":\"syocogjltdtbnnha\"},{\"properties\":{\"groupId\":\"crkvcikhnv\",\"requiredMembers\":[\"qgxqquezikyw\"],\"requiredZoneNames\":[\"kallatmel\",\"uipiccjzk\"],\"displayName\":\"v\"},\"id\":\"vvcnayr\",\"name\":\"yrnxxmueedn\",\"type\":\"rdvstkwqqtch\"}]}")
            .toObject(PrivateLinkResourceListResultInner.class);
        Assertions.assertEquals("ciuqgbdb", model.value().get(0).properties().requiredZoneNames().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateLinkResourceListResultInner model = new PrivateLinkResourceListResultInner().withValue(Arrays.asList(
            new PrivateLinkResource().withProperties(new PrivateLinkResourceProperties()
                .withRequiredZoneNames(Arrays.asList("ciuqgbdb", "t", "uvfbtkuwh", "mhykojoxafnndl"))),
            new PrivateLinkResource().withProperties(
                new PrivateLinkResourceProperties().withRequiredZoneNames(Arrays.asList("iipfpubj", "bwwift"))),
            new PrivateLinkResource().withProperties(new PrivateLinkResourceProperties()
                .withRequiredZoneNames(Arrays.asList("i", "ynkedyatrwyhqmib", "yhwitsmypyynpcdp", "mnzgmwznmabi"))),
            new PrivateLinkResource().withProperties(
                new PrivateLinkResourceProperties().withRequiredZoneNames(Arrays.asList("kallatmel", "uipiccjzk")))));
        model = BinaryData.fromObject(model).toObject(PrivateLinkResourceListResultInner.class);
        Assertions.assertEquals("ciuqgbdb", model.value().get(0).properties().requiredZoneNames().get(0));
    }
}
