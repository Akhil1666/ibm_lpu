package com.example.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.CustomerDao;
import com.example.entity.Customer;

@Service
public class CustomerServiceImplement implements CustomerService {

	
	@Autowired
	CustomerDao customerDao;
	
	
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		
		return customerDao.getCustomers();
	}


	@Override
	public Customer getCustomer(int theId) {
		// TODO Auto-generated method stub
		return customerDao.getCustomer(theId);
	}

}