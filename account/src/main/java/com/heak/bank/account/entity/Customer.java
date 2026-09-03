package com.heak.bank.account.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

//@Document(collection = "customers")
@Entity
@Table(name = "customers")
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;
    private String name;
    private String email;
    private String mobileNumber;
    private LocalDate createDate;
}
