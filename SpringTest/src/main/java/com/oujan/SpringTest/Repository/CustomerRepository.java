package com.oujan.SpringTest.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oujan.SpringTest.Entitys.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
