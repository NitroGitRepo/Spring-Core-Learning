package com.springcore.componentannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/componentannotation/config4.xml");
		
         Student student1 = (Student)context.getBean("stu");
 
         System.out.println(student1.getAddresses().getClass());
		
	}

}
