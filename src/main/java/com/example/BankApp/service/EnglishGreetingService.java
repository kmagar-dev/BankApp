package com.example.BankApp.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component


public class EnglishGreetingService implements GreetingService {

	public String greet() {
		// TODO Auto-generated method stub
		return "hello patil english";
	}

}
