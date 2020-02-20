package com.cts.abcd.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.abcd.config.AbcdConfig;
import com.cts.abcd.service.GreetNoteProviderTimeBasedImpl;
import com.cts.abcd.service.GreetService;
import com.cts.abcd.service.GreetServiceAdvancedImpl2;


public class DemoApp {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(AbcdConfig.class);
				System.out.println(context.getBean("today"));
		
		GreetService gs1=(GreetService)context.getBean("g1");
		System.out.println(gs1.greet("divya"));
	
	GreetServiceAdvancedImpl2 gs2=(GreetServiceAdvancedImpl2)context.getBean("g2");
	System.out.println(gs2.greet("mahi"));
	
	GreetNoteProviderTimeBasedImpl gs3=(GreetNoteProviderTimeBasedImpl)context.getBean("g3");
	System.out.println("sowdya");
	}

}
