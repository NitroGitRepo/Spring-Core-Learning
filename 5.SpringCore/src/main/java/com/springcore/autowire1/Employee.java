package com.springcore.autowire1;

public class Employee {

	private Address add;

	
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		System.out.println("Setting Value- Setter Injection");
		this.add = add;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, Address add) {
		super();
		
		this.add = add;
		System.out.println("Setting Value - Constructor Injection");
	}
	@Override
	public String toString() {
		return "Employee [ add=" + add + "]";
	}
	
	
}
