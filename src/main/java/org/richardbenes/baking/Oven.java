package org.richardbenes.baking;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Oven {

    private int setTemperature;
    private int realTemperature;
    private boolean lightOn;

    private final int bakingSheetHeight;
    private final String bakedStuff;
    private final String smell;
}
