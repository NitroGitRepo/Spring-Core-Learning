package com.springcore.constructor.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/constructor/injection/config4.xml");
        Person p1 = (Person)context.getBean("bean2");
        
        System.out.println(p1); 
	}

}
