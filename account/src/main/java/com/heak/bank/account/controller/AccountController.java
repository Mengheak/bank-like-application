package com.heak.bank.account.controller;

import com.heak.bank.account.dto.AccountDTO;
import com.heak.bank.account.entity.Account;
import com.heak.bank.account.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/accounts")
@RequiredArgsConstructor
public class AccountController {
    private final AccountService accountService;

    @PostMapping
    public ResponseEntity<?> save(@RequestBody AccountDTO dto) {
        return ResponseEntity.ok(accountService.save(dto));
    }

    @GetMapping
    public ResponseEntity<List<Account>> getAccounts(){
        return ResponseEntity.ok(accountService.getAll());
    }

    @GetMapping("{id}")
    public ResponseEntity<Account> getAccount(@PathVariable("id") Long id){
        return ResponseEntity.ok(accountService.getById(id));
    }
}
