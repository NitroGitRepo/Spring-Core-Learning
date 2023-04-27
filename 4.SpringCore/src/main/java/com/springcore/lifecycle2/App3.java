package com.springcore.lifecycle2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle2/config3.xml");
		Pepsi p = (Pepsi)context.getBean("bean1");
		System.out.println(p);
		context.registerShutdownHook();
		

	}

}
