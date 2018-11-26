package com.app.service;

import java.util.List;

import com.app.model.Customer;

public interface ICustomerService {
	Integer saveCustomer(Customer customer);
	void updateCustomer(Customer customer);
	void deleteCustomer(int id);
	Customer getCustomerById(int id);
	List<Customer> getAllCustomers();
}
