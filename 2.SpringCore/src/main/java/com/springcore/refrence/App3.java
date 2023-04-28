package com.springcore.refrence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/refrence/refconfig.xml");
		A a1 = (A)context.getBean("bean3");
        System.out.println(a1.getX());
        System.out.println(a1.getOb().getY());
        
	}

}
