package com.example.springboot_restful_demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot_restful_demo.model.Customers;
import com.example.springboot_restful_demo.repositories.CustomersRepository;

@Service
public class CustomersServicesImpl implements CustomersServices {
	
	@Autowired
	CustomersRepository custRepo;
	
	public List<Customers> findAllCustomers() {
		return	custRepo.findAll();
		 
	}

	@Override
	public Customers findCustomer(Long id) {
		 Optional<Customers> findById = custRepo.findById(id);
		 return findById.get(); 
	}

	@Override
	public void createCustomer(Customers customer) {
		custRepo.save(customer);
	}

	@Override
	public void updateCustomer(Long id, Customers customer) {
		Optional<Customers> findById = custRepo.findById(id);
		Customers c = findById.get();
		c.setEmail(customer.getEmail());
		custRepo.save(c);
	}

	@Override
	public void deleteCustomer(Long id) {
		custRepo.deleteById(id);
	}

	@Override
	public void deleteAllCustomer() {
		custRepo.deleteAll();	
	}
	
	
	
}
