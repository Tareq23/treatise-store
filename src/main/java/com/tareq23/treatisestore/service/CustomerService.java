package com.tareq23.treatisestore.service;

import com.tareq23.treatisestore.entity.Customer;
import com.tareq23.treatisestore.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;


    public Customer getCustomerByEmail(String email)
    {
        return customerRepository.findByEmail(email);
    }


}
