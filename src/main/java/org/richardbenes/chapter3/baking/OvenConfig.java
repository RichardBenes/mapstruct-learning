package org.richardbenes.chapter3.baking;

import lombok.Data;

@Data
public class OvenConfig {

    private final int setTemperature;
    private final boolean lightOn;
}
