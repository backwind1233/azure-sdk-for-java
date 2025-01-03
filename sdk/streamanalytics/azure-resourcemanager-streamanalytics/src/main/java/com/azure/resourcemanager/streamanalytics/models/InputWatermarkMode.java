// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The input watermark mode.
 */
public final class InputWatermarkMode extends ExpandableStringEnum<InputWatermarkMode> {
    /**
     * Static value None for InputWatermarkMode.
     */
    public static final InputWatermarkMode NONE = fromString("None");

    /**
     * Static value ReadWatermark for InputWatermarkMode.
     */
    public static final InputWatermarkMode READ_WATERMARK = fromString("ReadWatermark");

    /**
     * Creates a new instance of InputWatermarkMode value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public InputWatermarkMode() {
    }

    /**
     * Creates or finds a InputWatermarkMode from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding InputWatermarkMode.
     */
    public static InputWatermarkMode fromString(String name) {
        return fromString(name, InputWatermarkMode.class);
    }

    /**
     * Gets known InputWatermarkMode values.
     * 
     * @return known InputWatermarkMode values.
     */
    public static Collection<InputWatermarkMode> values() {
        return values(InputWatermarkMode.class);
    }
}
