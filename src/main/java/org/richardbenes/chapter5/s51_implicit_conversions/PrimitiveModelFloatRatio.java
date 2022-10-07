package org.richardbenes.chapter5.s51_implicit_conversions;

import lombok.Data;

@Data
public class PrimitiveModelFloatRatio {

    public static PrimitiveModelFloatRatio initializedWithValues() {
        return new PrimitiveModelFloatRatio(
                (byte) 127,
                10,
                10000000L,
                2.71f,
                'a',
                true
        );
    }

    private final byte weight;
    private final int age;
    private final long score;
    private final float ratio;
    private final char type;
    private final boolean enabled;

}
