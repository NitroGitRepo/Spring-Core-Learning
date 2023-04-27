package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config2.xml");
        Samosa s1 = (Samosa)context.getBean("bean1");
        System.out.println("Java File");
        System.out.println(s1);
        
        //registering shutdown hook->call destroy method which is given in destroy-method attribute 
        context.registerShutdownHook(); 
        
        
	}

}
