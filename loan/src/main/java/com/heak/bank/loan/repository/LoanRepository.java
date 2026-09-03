package com.heak.bank.loan.repository;

import com.heak.bank.loan.entity.Loan;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LoanRepository extends MongoRepository<Loan,String> {
    Optional<Loan> findByCustomerId(Long customerId);
}
