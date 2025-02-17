package com.example.customerapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.customerapp.entity.Customer;
import com.example.customerapp.repository.CustomerRepository;

@RestController
@RequestMapping("/api/customer")
@CrossOrigin(origins = "http://localhost:5174") 
public class CustomerController {

	 @Autowired 
	 CustomerRepository customerRepository;

    
    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer) {
        return customerRepository.save(customer);
    }
	
}
