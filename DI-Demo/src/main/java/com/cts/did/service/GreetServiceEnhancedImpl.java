package com.cts.did.service;

public class GreetServiceEnhancedImpl implements GreetService{
	private String greeting;
	
	public GreetServiceEnhancedImpl(String greeting) {
		super();
		this.greeting = greeting;
	}

	
	public GreetServiceEnhancedImpl() {
		super();
	}
	public String greet(String username) {
		return greeting+" "+username;
	}
	
	

	public String getGreeting() {
		return greeting;
	}
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

}
