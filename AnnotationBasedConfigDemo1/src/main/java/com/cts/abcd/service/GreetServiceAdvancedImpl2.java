package com.cts.abcd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("g2")
public class GreetServiceAdvancedImpl2 implements GreetService{
	@Autowired
	private GreetNoteProvider gnp;
	
	
	
	public GreetServiceAdvancedImpl2(GreetNoteProvider gnp) {
		super();
		this.gnp = gnp;
	}




public String greetNote(String username) {
	return gnp.getGreetNote()+" "+username;
}

public GreetNoteProvider getGnp() {
	return gnp;
}



	public void setGnp(GreetNoteProvider gnp) {
		this.gnp = gnp;
	}



	public String greet(String username) {
		
		return gnp.getGreetNote()+" "+username;
	}



	public GreetServiceAdvancedImpl2() {
		super();
		
	}
	

}

