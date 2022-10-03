package org.richardbenes.chapter3.cars;

import lombok.Data;

@Data
public class Painting {

    private final int id;
    private final String color;
    private final String finish; // matt or glossy
}
