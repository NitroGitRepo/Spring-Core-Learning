package com.springcore.autowire1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowire1/config1.xml");
        Employee E1 = (Employee)context.getBean("bean2");
        System.out.println(E1)  ;

	}

}
