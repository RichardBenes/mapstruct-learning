package org.richardbenes.chapter3.customers;

import lombok.ToString;

@ToString
public class CustomerDto {

    public CustomerDto(long id, String name) {
        System.out.println("CustomerDto");
        this.id = id;
        this.name = name;
    }

    public long id;
    public String name;
}
