package com.example.springboot_restful_demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot_restful_demo.model.Customers;
import com.example.springboot_restful_demo.services.CustomersServices;

@RestController
@RequestMapping("/api")
public class CustomersRestController {

	@Autowired
	CustomersServices custSer;
	
	// to get all customers
	@GetMapping(path = "/")
	public List<Customers> findAllCustomer() {
		return custSer.findAllCustomers();
		
	}
	
	// to get a customer by id
	@GetMapping(path = "/{id}")
	public Customers findCustomer(@PathVariable("id") Long id) {
		return custSer.findCustomer(id);
		
	}
	
	// to create new customer
	@PostMapping
	public void addCustomer(@RequestBody Customers customer) {
		custSer.createCustomer(customer);
	}
	
	// to update new customer
	@PutMapping(path = "/{id}")
	public void updateCustomer(@PathVariable("id") Long id ,@RequestBody Customers customer) {
		custSer.updateCustomer(id, customer);
	}
	
	// to delete new customer
	@DeleteMapping(path="/{id}")
	public void deleteCustomer(@PathVariable("id") Long id) {
		custSer.deleteCustomer(id);
	}
	
	// to delete all customer
	@DeleteMapping
	public void deleteAllCustomer() {
		custSer.deleteAllCustomer();
	}
	
}
