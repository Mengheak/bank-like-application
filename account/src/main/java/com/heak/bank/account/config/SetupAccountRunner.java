package com.heak.bank.account.config;

import com.heak.bank.account.entity.Account;
import com.heak.bank.account.entity.Customer;
import com.heak.bank.account.repository.AccountRepository;
import com.heak.bank.account.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@RequiredArgsConstructor
@Slf4j
public class SetupAccountRunner implements CommandLineRunner{

    private final AccountRepository accountRepository;
    private final CustomerRepository customerRepository;

    @Override
    public void run(String... args) throws Exception {
//        Customer customer = new Customer();
//        customer.setCreateDate(LocalDate.now());
//        customer.setEmail("heakcg@gmail.com");
//        customer.setMobileNumber("000000000");
//        customer.setName("Mengheak Chheang");
//        customerRepository.save(customer);
//
//        Account account = new Account();
//        account.setCreateDate(LocalDate.now());
//        account.setAccountNumber(11L);
//        account.setAccountType("Savings");
//        account.setBranchAddress("Phnom Penh");
//        account.setCustomer(customer);
//        accountRepository.save(account);
        log.info("Account Created Successfully");
    }
}
