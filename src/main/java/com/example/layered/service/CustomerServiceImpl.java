package com.example.layered.service;

import com.example.layered.model.Customer;
import com.example.layered.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class CustomerServiceImpl implements ICustomerService {


  @Autowired
  CustomerRepository customerRepository;


  @Override
  public Customer save(Customer customer) {
    return customerRepository.save(customer);
  }
}
