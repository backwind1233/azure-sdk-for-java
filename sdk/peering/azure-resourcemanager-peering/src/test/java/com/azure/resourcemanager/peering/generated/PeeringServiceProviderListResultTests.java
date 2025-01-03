// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.peering.fluent.models.PeeringServiceProviderInner;
import com.azure.resourcemanager.peering.models.PeeringServiceProviderListResult;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class PeeringServiceProviderListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PeeringServiceProviderListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"serviceProviderName\":\"vseotgqrl\",\"peeringLocations\":[\"u\",\"lauwzizxbmpgcjef\",\"zmuvpbttdumorppx\",\"bmnzbtbhjpgl\"]},\"id\":\"fgohdneuelfphs\",\"name\":\"yhtozfikdowwqu\",\"type\":\"v\"},{\"properties\":{\"serviceProviderName\":\"clvit\",\"peeringLocations\":[\"zonosgg\",\"hcohfwdsjnk\",\"ljuti\",\"swacffgdkzz\"]},\"id\":\"wkfvhqcrailvp\",\"name\":\"ppfufl\",\"type\":\"wdmhdlxyjrxs\"},{\"properties\":{\"serviceProviderName\":\"fcnihgwq\",\"peeringLocations\":[\"edgfbcvkcvq\",\"pkeqdcvdrhvoo\"]},\"id\":\"sotbob\",\"name\":\"dopcjwvnh\",\"type\":\"ld\"},{\"properties\":{\"serviceProviderName\":\"xcxrsl\",\"peeringLocations\":[\"twuoegrpkhjwni\"]},\"id\":\"qsluicp\",\"name\":\"ggkzzlvmbmpa\",\"type\":\"modfvuefywsbpfvm\"}],\"nextLink\":\"hrfou\"}")
            .toObject(PeeringServiceProviderListResult.class);
        Assertions.assertEquals("vseotgqrl", model.value().get(0).serviceProviderName());
        Assertions.assertEquals("u", model.value().get(0).peeringLocations().get(0));
        Assertions.assertEquals("hrfou", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PeeringServiceProviderListResult model = new PeeringServiceProviderListResult().withValue(Arrays.asList(
            new PeeringServiceProviderInner().withServiceProviderName("vseotgqrl")
                .withPeeringLocations(Arrays.asList("u", "lauwzizxbmpgcjef", "zmuvpbttdumorppx", "bmnzbtbhjpgl")),
            new PeeringServiceProviderInner().withServiceProviderName("clvit")
                .withPeeringLocations(Arrays.asList("zonosgg", "hcohfwdsjnk", "ljuti", "swacffgdkzz")),
            new PeeringServiceProviderInner().withServiceProviderName("fcnihgwq")
                .withPeeringLocations(Arrays.asList("edgfbcvkcvq", "pkeqdcvdrhvoo")),
            new PeeringServiceProviderInner().withServiceProviderName("xcxrsl")
                .withPeeringLocations(Arrays.asList("twuoegrpkhjwni"))))
            .withNextLink("hrfou");
        model = BinaryData.fromObject(model).toObject(PeeringServiceProviderListResult.class);
        Assertions.assertEquals("vseotgqrl", model.value().get(0).serviceProviderName());
        Assertions.assertEquals("u", model.value().get(0).peeringLocations().get(0));
        Assertions.assertEquals("hrfou", model.nextLink());
    }
}
