package com.oujan.SpringTest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.oujan.SpringTest.Entitys.Customer;
import com.oujan.SpringTest.Repository.CustomerRepository;


public class CustomerServiceImpl implements CustomerService 
{
	@Autowired
    private CustomerRepository customerRepository;

	@Override
	public List<Customer> getCustomers() {
		return customerRepository.findAll();
	}

	@Override
	public void saveCustomer(Customer theCustomer) {
		 customerRepository.save(theCustomer);
	}

	@Override
	public Customer getCustomer(Long theId) {
		return customerRepository.findById(theId).orElse(new Customer());
	}

	@Override
	public void deleteCustomer(Long theId) {
		customerRepository.deleteById(theId);
	}

}
