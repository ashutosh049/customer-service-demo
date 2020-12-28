package com.example.layered.controller;

import com.example.layered.model.Customer;
import com.example.layered.repository.CustomerRepository;
import com.example.layered.service.ICustomerService;
import javax.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@Validated
@RestController
@RequestMapping("/")
public class CustomerController {

  @Autowired
  ICustomerService customerService;
  @Autowired
  CustomerRepository customerRepository;

  @PostMapping("/byService")
  public Customer addByService(@RequestBody @Valid Customer customer) {
    return customerService.save(customer);

  }

  @PostMapping("/byRepository")
  public Customer addByRepository(@RequestBody @Valid Customer customer) {
    return customerRepository.save(customer);

  }

}
