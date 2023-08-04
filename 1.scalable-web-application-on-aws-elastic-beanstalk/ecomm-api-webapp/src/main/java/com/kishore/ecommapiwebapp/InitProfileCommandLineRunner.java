package com.kishore.ecommapiwebapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.kishore.ecommapiwebapp.jpa.ProductRepository;
import com.kishore.ecommapiwebapp.jpa.ProductRepository;
import com.kishore.ecommapiwebapp.model.Product;

@Component
public class InitProfileCommandLineRunner implements CommandLineRunner {
	
	private ProductRepository prodRepo;
	
	@Autowired
	public InitProfileCommandLineRunner(ProductRepository _prodRepo) {
		super();
		this.prodRepo = _prodRepo;
	}

	@Override
	public void run(String... args) throws Exception {
		prodRepo.save(new Product("Book","Brief Desc" ,"Elaborate Desc",200.00));
	}

}
