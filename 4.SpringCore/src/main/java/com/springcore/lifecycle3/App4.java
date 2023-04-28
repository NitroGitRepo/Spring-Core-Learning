package com.springcore.lifecycle3;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle3/config4.xml");
		Example ex1 = (Example)context.getBean("bean1");
		System.out.println(ex1); 
		
		context.registerShutdownHook();
	} 

}
