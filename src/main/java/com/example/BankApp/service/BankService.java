package com.example.BankApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BankApp.entity.BankAccount;
import com.example.BankApp.exception.InsufficientBalanceException;
import com.example.BankApp.repository.BankAccountRepository;

import jakarta.transaction.Transactional;

@Service
public class BankService {

	@Autowired
	private BankAccountRepository bankAccountRepository;

	@Transactional
	public void transfer(Long fromAccountID, Long toAccountId, double amount) {
		BankAccount from = bankAccountRepository.findById(fromAccountID).orElseThrow();
		BankAccount to = bankAccountRepository.findById(toAccountId).orElseThrow();

		if (from.getBalance() >= amount) {
			from.setBalance(from.getBalance() - amount);
			to.setBalance(to.getBalance() + amount);

			bankAccountRepository.save(from);
			bankAccountRepository.save(to);
		} else {
			throw new InsufficientBalanceException("Insufficient Balance!");
		}
	}

}
