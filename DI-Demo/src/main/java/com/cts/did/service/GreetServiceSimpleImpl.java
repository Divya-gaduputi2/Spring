package com.cts.did.service;

public class GreetServiceSimpleImpl implements GreetService {
	
public String greet(String username) {
	return "hi"+username;
}
}
