package com.heak.bank.account.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

//@Document(collection = "accounts")
@Entity
@Table(name = "accounts")
@Data
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long accountNumber;
    private String accountType;
    private String branchAddress;
    private LocalDate createDate;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customerId")
    private Customer customer;
}
