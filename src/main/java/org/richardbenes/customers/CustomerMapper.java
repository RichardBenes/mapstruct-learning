package org.richardbenes.customers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CustomerMapper {

    Customer toCustomer(CustomerDto dto);

    CustomerDto toDto(Customer customer);

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    static void main(String[] args) {
        System.out.println("Hello from org.richardbenes.customers.CustomerMapper");

        System.out.println("#let's create Customer");
//        var customer = new Customer(10, "Glenn");
        var customer = new Customer();
        customer.setId(10);
        customer.setName("Glenn");

        System.out.println("#let's convert it to CustomerDto");
        var customerDto = INSTANCE.toDto(customer);

        System.out.println(">> " + customerDto);



        System.out.println("#let's create CustomerDto");
        var dto = new CustomerDto(20, "Michal");

        System.out.println("#let's convert it to Customer");
        var createdCustomer = INSTANCE.toCustomer(dto);

        System.out.println(">> " + createdCustomer);
    }
}
