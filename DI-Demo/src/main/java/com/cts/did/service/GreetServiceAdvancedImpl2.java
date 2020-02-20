package com.cts.did.service;

public class GreetServiceAdvancedImpl2 implements GreetService{
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

