package com.springcore.autowire2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context  = new ClassPathXmlApplicationContext("com/springcore/autowire2/config2.xml");
//		A  ddress ad = (Address)context.getB ean("add");
		
		Employee e = (Employee)context.getBean("bean2");
		System.out.println(e);

	}

}
