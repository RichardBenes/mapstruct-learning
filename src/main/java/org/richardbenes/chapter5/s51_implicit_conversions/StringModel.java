package org.richardbenes.chapter5.s51_implicit_conversions;

import lombok.Data;

@Data
public class StringModel {

    public static StringModel initializedWithNulls() {
        return new StringModel(
                null,
                null,
                null,
                null,
                null,
                null
        );
    }

    public static StringModel initializedWithEmpty() {
        return new StringModel(
                "",
                "",
                "",
                "",
                "",
                ""
        );
    }

    public static StringModel initializedWithValues() {
        return new StringModel(
                "127",
                "10",
                "10000000",
                "4.2334d",
                "a",
                "true"
        );
    }

    public static StringModel initializedWithMultiCharacterChar() {
        return new StringModel(
                "127",
                "10",
                "10000000",
                "4.2334d",
                "ah",
                "true"
        );
    }

    public static StringModel initializedWithOverflowingValues() {
        return new StringModel(
                "300",
                "5000000000",
                "10000000",
                "4.2334d",
                "a",
                "true"
        );
    }

    private final String weight;
    private final String age;
    private final String score;
    private final String ratio;
    private final String type;
    private final String enabled;
}
