package com.example.springboot_restful_demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springboot_restful_demo.model.Customers;
@Repository
public interface CustomersRepository extends JpaRepository<Customers, Long> {

}
