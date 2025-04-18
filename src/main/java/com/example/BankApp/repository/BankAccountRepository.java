package com.example.BankApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BankApp.entity.BankAccount;

public interface BankAccountRepository extends JpaRepository<BankAccount, Long> {

}
