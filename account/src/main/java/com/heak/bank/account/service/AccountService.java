package com.heak.bank.account.service;

import com.heak.bank.account.dto.AccountDTO;
import com.heak.bank.account.entity.Account;

import java.util.List;

public interface AccountService {
    Account save(AccountDTO dto);

    List<Account> getAll();

    Account getById(Long id);
}
