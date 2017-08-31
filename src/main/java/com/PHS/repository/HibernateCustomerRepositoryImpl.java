package com.PHS.repository;

import com.PHS.interfaces.CustomerRepository;
import com.PHS.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Override
    public List<Customer> findAll(){
        List<Customer> customers = new ArrayList<>();

        Customer customer = new Customer();

        customer.setFirstName("Percy");
        customer.setLastName("Herrera");

        customers.add(customer);
        return customers;
    }

}
