// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datamigration.fluent.models.QuotaInner;
import com.azure.resourcemanager.datamigration.models.QuotaList;
import com.azure.resourcemanager.datamigration.models.QuotaName;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class QuotaListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        QuotaList model = BinaryData.fromString(
            "{\"value\":[{\"currentValue\":0.0161532366757422,\"id\":\"gmbmbexppbh\",\"limit\":42.629804332769986,\"name\":{\"localizedValue\":\"fpfpsalgbquxigj\",\"value\":\"gzjaoyfhrtxilne\"},\"unit\":\"ujysvle\"}],\"nextLink\":\"vfqawrlyxwjkcpr\"}")
            .toObject(QuotaList.class);
        Assertions.assertEquals(0.0161532366757422D, model.value().get(0).currentValue());
        Assertions.assertEquals("gmbmbexppbh", model.value().get(0).id());
        Assertions.assertEquals(42.629804332769986D, model.value().get(0).limit());
        Assertions.assertEquals("fpfpsalgbquxigj", model.value().get(0).name().localizedValue());
        Assertions.assertEquals("gzjaoyfhrtxilne", model.value().get(0).name().value());
        Assertions.assertEquals("ujysvle", model.value().get(0).unit());
        Assertions.assertEquals("vfqawrlyxwjkcpr", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        QuotaList model = new QuotaList().withValue(Arrays.asList(new QuotaInner().withCurrentValue(0.0161532366757422D)
            .withId("gmbmbexppbh")
            .withLimit(42.629804332769986D)
            .withName(new QuotaName().withLocalizedValue("fpfpsalgbquxigj").withValue("gzjaoyfhrtxilne"))
            .withUnit("ujysvle"))).withNextLink("vfqawrlyxwjkcpr");
        model = BinaryData.fromObject(model).toObject(QuotaList.class);
        Assertions.assertEquals(0.0161532366757422D, model.value().get(0).currentValue());
        Assertions.assertEquals("gmbmbexppbh", model.value().get(0).id());
        Assertions.assertEquals(42.629804332769986D, model.value().get(0).limit());
        Assertions.assertEquals("fpfpsalgbquxigj", model.value().get(0).name().localizedValue());
        Assertions.assertEquals("gzjaoyfhrtxilne", model.value().get(0).name().value());
        Assertions.assertEquals("ujysvle", model.value().get(0).unit());
        Assertions.assertEquals("vfqawrlyxwjkcpr", model.nextLink());
    }
}
