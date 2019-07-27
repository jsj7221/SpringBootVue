package com.example.demo.customer.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.customer.model.Customer;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
	List<Customer> findByLastName(String lastName);
}
