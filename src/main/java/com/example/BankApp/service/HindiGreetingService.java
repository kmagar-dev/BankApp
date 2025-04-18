package com.example.BankApp.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component("hindiGreeting")
@Primary
public class HindiGreetingService implements GreetingService {

	
	public String greet() {
		// TODO Auto-generated method stub
		return "नमस्ते Bittu patil";
	}
	

}
