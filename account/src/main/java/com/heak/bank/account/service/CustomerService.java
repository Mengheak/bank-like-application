package com.heak.bank.account.service;

import com.heak.bank.account.entity.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    Customer saveCustomer(Customer customer);
    List<Customer> findAllCustomers();
    Customer findCustomerById(Long id);

}
