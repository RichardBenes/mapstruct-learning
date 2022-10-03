package org.richardbenes.chapter3.cars;

import lombok.Data;

@Data
public class Engine {

    private final int id;
    private final int power; // in kW
    private final String type; // diesel or petrol
}
