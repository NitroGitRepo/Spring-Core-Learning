package com.springcore.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/SpringCore/config1.xml");
		Student s1 = (Student)context.getBean("bean1");
		System.out.println(s1);
	}
}
