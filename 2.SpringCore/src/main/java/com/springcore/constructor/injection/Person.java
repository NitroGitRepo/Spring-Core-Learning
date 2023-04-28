package com.springcore.constructor.injection;

import java.util.List;

public class Person {
  
	private String name;
	private int personId;
	private Certi certi;
	private List<String> location;
	
	public Person(String name, int personId, Certi C) {
		this.name = name;
		this.personId = personId;
		this.certi = C;
	}
	

	public Person(String name, int personId, Certi certi, List<String> location) {
		super();
		this.name = name;
		this.personId = personId;
		this.certi = certi;
		this.location = location;
	}




	@Override
	public String toString() {
		return "Person [name=" + name + ", personId=" + personId + ", certi=" + certi + ", location=" + location + "]";
	}
	
	
	
}
