package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.ICustomerDao;
import com.app.model.Customer;
@Repository
public class CustomerDaoImpl implements ICustomerDao {
	@Autowired
	private HibernateTemplate ht;

	@Override
	public Integer saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return (Integer) ht.save(customer);
	}

	@Override
	public void updateCustomer(Customer customer) {
		ht.update(customer);
		
	}

	@Override
	public void deleteCustomer(int id) {
		Customer c=new Customer();
		c.setId(id);
		ht.delete(c);
		
	}

	@Override
	public Customer getCustomerById(int id) {
		// TODO Auto-generated method stub
		return ht.get(Customer.class, id);
	}

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return ht.loadAll(Customer.class);
	}

}
