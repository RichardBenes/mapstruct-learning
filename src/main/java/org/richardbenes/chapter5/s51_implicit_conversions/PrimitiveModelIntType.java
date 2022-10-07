package org.richardbenes.chapter5.s51_implicit_conversions;

import lombok.Data;

@Data
public class PrimitiveModelIntType {

    public static PrimitiveModelIntType initializedWithZeros() {
        return new PrimitiveModelIntType(
                (byte) 0,
                0,
                0L,
                0d,
                0,
                false
        );
    }

    public static PrimitiveModelIntType initializedWithValues() {
        return new PrimitiveModelIntType(
                (byte) 127,
                10,
                10000000L,
                4.2334d,
                80,
                true
        );
    }

    private final byte weight;
    private final int age;
    private final long score;
    private final double ratio;
    private final int type;
    private final boolean enabled;

}
