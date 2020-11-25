package com.example.springboot_restful_demo.services;

import java.util.List;

import com.example.springboot_restful_demo.model.Customers;

public interface CustomersServices {

	public List<Customers> findAllCustomers();
	
	public Customers findCustomer(Long id);
	
	public void createCustomer(Customers customer);
	
	public void updateCustomer(Long id , Customers customer);
	
	public void deleteCustomer(Long id);
	
	public void deleteAllCustomer();
}
