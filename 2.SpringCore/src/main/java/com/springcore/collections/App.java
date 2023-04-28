package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		System.out.println("Jai Mata Di");
		Employees e1 = (Employees)context.getBean("bean1");
		System.out.print(e1.getName());
		System.out.println(e1.getAddresses());
		System.out.println(e1.getCourses());
		System.out.println(e1.getPhones());
		System.out.println(e1.getExtra());
		
		

	}

}
