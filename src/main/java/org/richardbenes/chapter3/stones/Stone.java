package org.richardbenes.chapter3.stones;

import lombok.Builder;
import lombok.Data;

@Data
public class Stone {

    public Stone() {
        System.out.println("new Stone()");
    }

    public Stone(int weight, int maxDimension) {
        System.out.println("new Stone(int, int)");
        this.weight = weight;
        this.maxDimension = maxDimension;
    }

    public Stone(String weight, String maxDimension) {
        System.out.println("new Stone(String, String)");
        this.weight = Integer.parseInt(weight);
        this.maxDimension = Integer.parseInt(maxDimension);
    }

    private int weight;
    private int maxDimension;
}
