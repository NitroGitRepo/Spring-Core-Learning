package com.springcore.removexml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/removexml/config6.xml ");
		
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Student st = (Student)context.getBean("getStudent");
		
		System.out.println(st);
		
		st.study();
		
	
	}

}
