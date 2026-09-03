package com.heak.bank.account.mapper;

import com.heak.bank.account.dto.CustomerDTO;
import com.heak.bank.account.entity.Customer;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class CustomerMapper {
    public Customer toCustomer(CustomerDTO customerDTO)
    {
        Customer customer = new Customer();
        customer.setName(customerDTO.getName());
        customer.setEmail(customerDTO.getEmail());
        customer.setCustomerId(customerDTO.getCustomerId());
        customer.setMobileNumber(customerDTO.getMobileNumber());
        customer.setCreateDate(LocalDate.parse(customerDTO.getCreateDate()));
        return customer;
    }
}
