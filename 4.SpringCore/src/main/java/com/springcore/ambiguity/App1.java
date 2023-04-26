package com.springcore.ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {

	public static void main(String[] args) {
	
      ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ambiguity/config1.xml");
      Addition ad1 = (Addition)context.getBean("bean1");
      ad1.doSum();
	}

}
