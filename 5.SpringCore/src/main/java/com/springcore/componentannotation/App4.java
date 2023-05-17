package com.springcore.componentannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/componentannotation/config4.xml");
		
         Student student1 = (Student)context.getBean("stu");
         System.out.println(student1.hashCode());
         Student student2 = (Student)context.getBean("stu");
         System.out.println(student2.hashCode());
         
         System.out.println("Scope With XML------------");
         
         Teacher t1 = (Teacher)context.getBean("teacher");
         Teacher t2 = (Teacher)context.getBean("teacher");
         System.out.println(t1.hashCode());
         System.out.println(t2.hashCode());
         
		
	}

}
