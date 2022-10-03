package org.richardbenes.chapter3.houses;

import lombok.*;

@Builder
@ToString
@Getter
@Setter
public class Tent {

    private final String color;
    private final int numberOfPeople;

    public static TentBuilder builder() {
        System.out.println("new TentBuilder()");
        return new TentBuilder();
    }
}
