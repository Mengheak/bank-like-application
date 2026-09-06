package com.heak.bank.loan.controller;

import com.heak.bank.loan.dto.LoanDTO;
import com.heak.bank.loan.entity.Loan;
import com.heak.bank.loan.mapper.LoanMapper;
import com.heak.bank.loan.service.LoanService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/loans")
@RequiredArgsConstructor
public class LoanController {

    private final LoanService loanService;
    private final LoanMapper loanMapper;

    @PostMapping
    public ResponseEntity<Loan> save(@RequestBody LoanDTO dto) {
        return ResponseEntity.status(HttpStatus.CREATED).body( loanService.save(loanMapper.toLoan(dto)));
    }
    @GetMapping
    public ResponseEntity<List<Loan>> list(){
        return ResponseEntity.status(HttpStatus.OK).body(loanService.list());
    }

    @GetMapping("{customerId}")
    public ResponseEntity<List<Loan>> getByCustomerId(@PathVariable("customerId") Long customerId){
        return ResponseEntity.status(HttpStatus.OK).body(loanService.getByCustomerId(customerId));
    }
}
