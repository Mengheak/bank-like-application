package com.heak.bank.account.mapper;

import com.heak.bank.account.dto.AccountDTO;
import com.heak.bank.account.entity.Account;
import org.springframework.stereotype.Component;

@Component
public class AccountMapper {
    public Account toAccount(AccountDTO dto) {
        Account account = new Account();
//        account.setCustomer(account.getCustomerId());
        account.setAccountType(account.getAccountType());
        account.setCreateDate(account.getCreateDate());
        account.setBranchAddress(account.getBranchAddress());
        return account;
    }
}
