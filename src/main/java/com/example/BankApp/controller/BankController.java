package com.example.BankApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.BankApp.service.BankService;
import com.example.BankApp.service.GreetingService;

@RestController
@RequestMapping("/api/bank")
public class BankController {

	@Autowired
	private BankService bankService;

	@Autowired
	private GreetingService greetingService;

	@Autowired
	@Qualifier("hindiGreeting")
	private GreetingService hindiGreetingService;

	@GetMapping("/english")
	public String getEnglishGreeting() {
		return greetingService.greet();
	}

	@GetMapping("/hindi")
	public String getHindiGreeting() {
		return greetingService.greet();
	}

	@PostMapping("/transfer")
	public String transfer(
			@RequestParam(name = "fromId") Long fromId,
			@RequestParam(name = "toId") Long toId,
			@RequestParam(name = "amount") double amount) {
		bankService.transfer(fromId, toId, amount);
		return "Amount has been transferred!";
	}
}
