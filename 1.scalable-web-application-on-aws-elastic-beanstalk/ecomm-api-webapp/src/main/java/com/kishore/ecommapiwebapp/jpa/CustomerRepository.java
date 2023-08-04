package com.kishore.ecommapiwebapp.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kishore.ecommapiwebapp.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
