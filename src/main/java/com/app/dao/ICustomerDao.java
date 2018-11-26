package com.app.dao;

import java.util.List;

import com.app.model.Customer;

public interface ICustomerDao {
	Integer saveCustomer(Customer customer);
	void updateCustomer(Customer customer);
	void deleteCustomer(int id);
	Customer getCustomerById(int id);
	List<Customer> getAllCustomers();
}
