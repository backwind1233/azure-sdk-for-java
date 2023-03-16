// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.models.LdapSearchScopeOpt;
import org.junit.jupiter.api.Assertions;

public final class LdapSearchScopeOptTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LdapSearchScopeOpt model =
            BinaryData
                .fromString(
                    "{\"userDN\":\"gpphrcgyn\",\"groupDN\":\"cpecfvmmcoofs\",\"groupMembershipFilter\":\"zevgb\"}")
                .toObject(LdapSearchScopeOpt.class);
        Assertions.assertEquals("gpphrcgyn", model.userDN());
        Assertions.assertEquals("cpecfvmmcoofs", model.groupDN());
        Assertions.assertEquals("zevgb", model.groupMembershipFilter());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LdapSearchScopeOpt model =
            new LdapSearchScopeOpt()
                .withUserDN("gpphrcgyn")
                .withGroupDN("cpecfvmmcoofs")
                .withGroupMembershipFilter("zevgb");
        model = BinaryData.fromObject(model).toObject(LdapSearchScopeOpt.class);
        Assertions.assertEquals("gpphrcgyn", model.userDN());
        Assertions.assertEquals("cpecfvmmcoofs", model.groupDN());
        Assertions.assertEquals("zevgb", model.groupMembershipFilter());
    }
}