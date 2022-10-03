package org.richardbenes.customers;

import lombok.ToString;

@ToString
public class Customer {

    public Customer() {
        System.out.println("Customer");
    }

//    public Customer(long id, String name) {
//        System.out.println("Customer");
//        this.id = id;
//        this.name = name;
//    }

    private long id;
    private String name;

    public long getId() {
        System.out.println("getId");
        return id;
    }

    public String getName() {
        System.out.println("getName");
        return name;
    }

    public void setId(long id) {
        System.out.println("setId");
        this.id = id;
    }

    public void setName(String name) {
        System.out.println("setName");
        this.name = name;
    }
}
