package com.oujan.SpringTest.service;

import java.util.List;

import com.oujan.SpringTest.Entitys.Customer;

public interface CustomerService {
	public List<Customer> getCustomers();
    public void saveCustomer(Customer theCustomer);
    public Customer getCustomer(Long theId);
    public void deleteCustomer(Long theId);
}
