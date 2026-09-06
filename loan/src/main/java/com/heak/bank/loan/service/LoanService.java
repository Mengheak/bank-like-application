package com.heak.bank.loan.service;


import com.heak.bank.loan.entity.Loan;

import java.util.List;

public interface LoanService {
    Loan save(Loan loan);

    List<Loan> list();


    List<Loan> getByCustomerId(Long customerId);
}
