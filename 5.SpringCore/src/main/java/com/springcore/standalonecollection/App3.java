package com.springcore.standalonecollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalonecollection/config3.xml");
		Employee e1 = (Employee)context.getBean("bean1");
		System.out.println(e1.getPhones().getClass( ));
		
		Person p1 = (Person)context.getBean("person1");
		System.out.println(p1.getFriends().getClass());
		System.out.println(p1.getFriends());
		
		System.out.println(p1.getFeestructure());
		
		System.out.println(p1.getProps()); 
		//System.out.println(p1.getFeestructure().getClass());
		/*
		 * for (int i = 0; i < p1.getFriends().size(); i++) {
		 * System.out.print(p1.getFriends().get(i) + " "); }
		 * 
		 * System.out.println(p1.getFriends().size()); System.out.println("---------");
		 * Person p2 = (Person)context.getBean("person2");
		 * System.out.println(p2.getFriends());
		 */
		
	}

}
