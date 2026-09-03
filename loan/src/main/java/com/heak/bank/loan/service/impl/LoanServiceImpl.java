package com.heak.bank.loan.service.impl;


import com.heak.bank.loan.entity.Loan;
import com.heak.bank.loan.repository.LoanRepository;
import com.heak.bank.loan.service.LoanService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LoanServiceImpl implements LoanService {
    private final LoanRepository loanRepository;

    @Override
    public Loan save(Loan loan) {
        return loanRepository.save(loan);
    }

    @Override
    public List<Loan> list() {
        return loanRepository.findAll();
    }

    @Override
    public Loan getById(String id) {
        return loanRepository.findById(id).orElseThrow(() -> new RuntimeException("Cannot find loan with id = "+id));
    }

    @Override
    public Loan getByCustomerId(Long customerId) {
        return loanRepository.findByCustomerId(customerId).orElseThrow(() -> new RuntimeException("Cannot find loan with id = "+customerId));
    }
}
