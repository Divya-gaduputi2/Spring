package com.cts.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.did.service.GreetService;
import com.cts.did.service.GreetServiceAdvancedImpl2;
import com.cts.did.service.GreetServiceEnhancedImpl;
import com.cts.did.service.GreetServiceSimpleImpl;

public class DidApp2 {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("bean2.xml");
	
		
		
		GreetServiceEnhancedImpl gs2=(GreetServiceEnhancedImpl)context.getBean("g2");
		
		gs2.setGreeting("vanakkam");
		System.out.println(gs2.greet("divya"));
		
		GreetServiceEnhancedImpl gs3=(GreetServiceEnhancedImpl)context.getBean("g2");
		System.out.println(gs3.greet("divya"));

		GreetService gs4=(GreetService)context.getBean("g3");
		System.out.println(gs4.greet("divya"));

	}

}
