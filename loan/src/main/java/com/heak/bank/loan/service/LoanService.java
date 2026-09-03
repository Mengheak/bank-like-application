package com.heak.bank.loan.service;


import com.heak.bank.loan.entity.Loan;

import java.util.List;

public interface LoanService {
    Loan save(Loan loan);

    List<Loan> list();

    Loan getById(String id);

    Loan getByCustomerId(Long customerId);
}
