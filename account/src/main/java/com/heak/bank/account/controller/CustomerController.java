package com.heak.bank.account.controller;

import com.heak.bank.account.dto.CustomerDTO;
import com.heak.bank.account.entity.Customer;
import com.heak.bank.account.mapper.CustomerMapper;
import com.heak.bank.account.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;
    @Autowired
    private CustomerMapper customerMapper;

    @PostMapping
    public ResponseEntity<?> save(@RequestBody CustomerDTO customerDTO)
    {
        Customer customer = customerMapper.toCustomer(customerDTO);
        customerService.saveCustomer(customer);
        return ResponseEntity.ok(customer);
    }
    @GetMapping
    public ResponseEntity<?> getCustomers(){
        List<Customer> customers = customerService.findAllCustomers();
        return ResponseEntity.ok(customers);
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> getCustomer(@PathVariable("id") Long id){
        return ResponseEntity.ok(customerService.findCustomerById(id));
    }
}
