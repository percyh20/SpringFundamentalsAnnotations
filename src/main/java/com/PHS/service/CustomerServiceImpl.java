package com.PHS.service;

import com.PHS.interfaces.CustomerRepository;
import com.PHS.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customerService")
public class CustomerServiceImpl implements com.PHS.interfaces.CustomerService {



    //@Autowired
    private CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository){
        System.out.println("we are using constructor injection");
        this.customerRepository =customerRepository;

    }

    @Override
    public List<Customer> findAll(){
        return customerRepository.findAll();
    }

    //@Autowired
    public void setCustomerRepository(CustomerRepository customerRepository) {
        System.out.println("we are using setter injection");
        this.customerRepository = customerRepository;
    }

}
