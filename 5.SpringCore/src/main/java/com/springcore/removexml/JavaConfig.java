package com.springcore.removexml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.springcore.removexml")
public class JavaConfig {

	@Bean
	public Samosa getSamosa() {
		Samosa s = new Samosa();	
		return s;
	}
	
	@Bean(name = {"getStudent","temp","von"})
	public Student getStudent() {
		
		//creating a new object
		Student st = new Student();
		
		return st;
	}
	 
}
