package org.richardbenes.chapter5.s51_implicit_conversions;

import lombok.Data;

@Data
public class PrimitiveModel {

    public static PrimitiveModel initializedWithZeros() {
        return new PrimitiveModel(
                (byte) 0,
                0,
                0L,
                0d,
                '\u0000',
                false
        );
    }

    public static PrimitiveModel initializedWithValues() {
        return new PrimitiveModel(
                (byte) 127,
                10,
                10000000L,
                4.2334d,
                'a',
                true
        );
    }

    public static PrimitiveModel initializedWithValues(Character c) {
        return new PrimitiveModel(
                (byte) 127,
                10,
                10000000L,
                4.2334d,
                c,
                true
        );
    }

    public static PrimitiveModel initializedWithValues(Double d) {
        return new PrimitiveModel(
                (byte) 127,
                10,
                10000000L,
                d,
                'a',
                true
        );
    }

    private final byte weight;
    private final int age;
    private final long score;
    private final double ratio;
    private final char type;
    private final boolean enabled;

}
