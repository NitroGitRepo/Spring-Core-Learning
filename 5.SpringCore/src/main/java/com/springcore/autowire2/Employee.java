package com.springcore.autowire2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

	@Autowired
	@Qualifier("add2")
	private Address add;

	public Address getAdd() {
		return add;
	}

	//@Autowired
	public void setAdd(Address add) {
		this.add = add;
	}

	//@Autowired
	public Employee(Address add) {
		super();
		this.add = add;
	}

	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [add=" + add + "]";
	}
	
	
}
