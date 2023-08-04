package com.kishore.ecommapiwebapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.kishore.ecommapiwebapp.jpa.CustomerRepository;
import com.kishore.ecommapiwebapp.model.Customer;

@Component
public class InitCommandLineRunner implements CommandLineRunner {
	
	private CustomerRepository custRepo;
	
	@Autowired
	public InitCommandLineRunner(CustomerRepository _custRepo) {
		super();
		this.custRepo = _custRepo;
	}

	@Override
	public void run(String... args) throws Exception {
		custRepo.save(new Customer("cus1@email.com","Customer1" ,"One"));
		custRepo.save(new Customer("cus2@email.com","Customer2" ,"Two"));
		custRepo.save(new Customer("cus3@email.com","Customer3" ,"Three"));
		custRepo.save(new Customer("cus4@email.com","Customer4" ,"Four"));
		custRepo.save(new Customer("cus5@email.com","Customer5" ,"Five"));
	}

}
