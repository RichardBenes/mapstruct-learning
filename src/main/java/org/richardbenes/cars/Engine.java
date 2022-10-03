package org.richardbenes.cars;

import lombok.Data;

@Data
public class Engine {

    private final int power; // in kW
    private final String type; // diesel or petrol
}
