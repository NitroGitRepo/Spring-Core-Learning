package com.springcore.standalonecollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalonecollection/config3.xml");
		Employee e1 = (Employee)context.getBean("bean1");
		System.out.println(e1.getPhones().getClass( ));
		
		Person p = (Person)context.getBean("bean2");
		System.out.println(p.getFriends().getClass());
	}

}
