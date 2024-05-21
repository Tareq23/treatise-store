package com.tareq23.treatisestore.service;

import com.tareq23.treatisestore.dto.LoginDTO;
import com.tareq23.treatisestore.dto.RegistrationDTO;
import com.tareq23.treatisestore.entity.Customer;
import com.tareq23.treatisestore.repository.CustomerRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ModelMapper modelMapper;


    public void register(RegistrationDTO registration){

        Customer customer = convertToCustomerEntity(registration);
        customer.setPassword(passwordEncoder.encode(customer.getPassword()));
        customerRepository.save(customer);

    }

    public void login(LoginDTO credential)
    {
        String encodedPassword = passwordEncoder.encode(credential.getPassword());
        System.out.println(encodedPassword);
    }

    public Customer convertToCustomerEntity(RegistrationDTO registration){
        return modelMapper.map(registration, Customer.class);
    }

}
