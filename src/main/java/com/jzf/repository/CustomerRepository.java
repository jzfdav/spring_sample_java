package com.jzf.repository;

import java.util.List;

import com.jzf.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}