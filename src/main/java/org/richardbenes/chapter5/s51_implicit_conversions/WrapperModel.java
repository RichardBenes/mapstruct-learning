package org.richardbenes.chapter5.s51_implicit_conversions;

import lombok.Data;

@Data
public class WrapperModel {

    public static WrapperModel initializedWithNulls() {
        return new WrapperModel(
                null,
                null,
                null,
                null,
                null,
                null
        );
    }

    public static WrapperModel initializedWithZeros() {
        return new WrapperModel(
                (byte)0,
                0,
                0L,
                0d,
                '\u0000',
                false
        );
    }

    public static WrapperModel initializedWithValues() {
        return new WrapperModel(
                (byte) 127,
                10,
                10000000L,
                4.2334d,
                'a',
                true
        );
    }

    private final Byte weight;
    private final Integer age;
    private final Long score;
    private final Double ratio;
    private final Character type;
    private final Boolean enabled;
}
