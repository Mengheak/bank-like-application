package com.heak.bank.account.service.impl;

import com.heak.bank.account.dto.AccountDTO;
import com.heak.bank.account.entity.Account;
import com.heak.bank.account.mapper.AccountMapper;
import com.heak.bank.account.repository.AccountRepository;
import com.heak.bank.account.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;
    private final AccountMapper accountMapper;

    @Override
    public Account save(AccountDTO dto) {
        return accountRepository.save(accountMapper.toAccount(dto));
    }

    @Override
    public List<Account> getAll() {
        return accountRepository.findAll();
    }

    @Override
    public Account getById(Long id) {
        return accountRepository.findById(id).orElseThrow(() -> new RuntimeException("Can't find account with id = "+id));
    }

}
