package com.kishore.ecommapiwebapp.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kishore.ecommapiwebapp.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
