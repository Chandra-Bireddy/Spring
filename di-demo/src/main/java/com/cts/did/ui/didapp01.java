 package com.cts.did.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.service.GreetService;



public class didapp01 {
	public static void main(String args[]) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans1.xml");
		GreetService gs= (GreetService) context.getBean("g1");
		System.out.println(gs.greet("Chandra"));
		GreetService gs1= (GreetService) context.getBean("g2");
		System.out.println(gs1.greet("Chandra"));
	}

}