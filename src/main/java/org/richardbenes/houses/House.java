package org.richardbenes.houses;

import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
//@AllArgsConstructor
public class House {

    private final int height;
    private final int numberOfRooms;

    protected House(Builder builder) {
        this.height = builder.height;
        this.numberOfRooms = builder.numberOfRooms;
        System.out.println("House(Builder)");
    }

    public static House.Builder builder() {
        System.out.println("House.builder()");
        return new Builder();
    }

    public static class Builder {

        private int height;
        private int numberOfRooms;

        public Builder height(int height) {
            System.out.println("Builder.height(int)");
            this.height = height;
            return this;
        }

        public Builder numberOfRooms(int numberOfRooms) {
            System.out.println("Builder.numberOfRooms(int)");
            this.numberOfRooms = numberOfRooms;
            return this;
        }

        public House create() {
            System.out.println("Builder.create()");
            return new House(this);
        }
    }
}
