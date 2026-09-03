package com.heak.bank.loan.mapper;

import com.heak.bank.loan.dto.LoanDTO;
import com.heak.bank.loan.entity.Loan;
import org.springframework.stereotype.Component;

@Component
public class LoanMapper {
    public Loan toLoan(LoanDTO loanDTO) {
        Loan loan = new Loan();
        loan.setAmountPaid(loanDTO.getAmountPaid());
        loan.setCreateDate(loanDTO.getCreateDate());
        loan.setCustomerId(loanDTO.getCustomerId());
        loan.setLoanType(loanDTO.getLoanType());
        loan.setOutstandingAmount(loanDTO.getOutstandingAmount());
        loan.setStartDate(loanDTO.getStartDate());
        loan.setTotalLoan(loanDTO.getTotalLoan());
        return loan;
    }
}
