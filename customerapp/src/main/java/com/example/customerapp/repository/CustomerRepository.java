package com.example.customerapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.customerapp.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
