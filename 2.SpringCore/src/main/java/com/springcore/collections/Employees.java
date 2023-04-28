package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employees {
   
	private String name;
	private List<String> phones;
	private Set<String> addresses ;
	private Map<String,String> courses;
	private Properties extra;
	
	
	
	
	public Employees(String name, List<String> phones, Set<String> addresses, Map<String, String> courses,
			Properties extra) {
		super();
		this.name = name;
		this.phones = phones;
		this.addresses = addresses;
		this.courses = courses;
		this.extra = extra;
	}
	public Properties getExtra() {
		return extra;
	}
	public void setExtra(Properties extra) {
		this.extra = extra;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("Setting Name....");
		this.name = name;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		System.out.println("Setting Phones...");
		this.phones = phones;
	}
	public Set<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<String> addresses) {
		System.out.println("Setting address");
		this.addresses = addresses;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		System.out.println("Setting courses");
		this.courses = courses;
	}
	public Employees(String name, List<String> phones, Set<String> addresses, Map<String, String> courses) {
		super();
		this.name = name;
		this.phones = phones;
		this.addresses = addresses;
		this.courses = courses;
	}
	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employees [name=" + name + ", phones=" + phones + ", addresses=" + addresses + ", courses=" + courses
				+ ", extra=" + extra + "]";
	}
	
	
}
