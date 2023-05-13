package com.springcore.standalonecollection;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {

	private List<String> friends;
	
	private Map<String, Integer> feestructure;
	
	private Properties props; 

	public Properties getProps() {
		return props;
	}

	public void setProps(Properties props) {
		this.props = props;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		System.out.println("Setter Injection --- List Value Set");
		this.friends = friends;
	}

	public Map<String, Integer> getFeestructure() {
		return feestructure;
	}

	public void setFeestructure(Map<String, Integer> feestructure) {
		System.out.println("Setter Injection --- Map Value Set");
		this.feestructure = feestructure;
	}

	public Person(List<String> friends, Map<String, Integer> feestructure) {
		super();
		System.out.println("Constructor Injection --- Constructor Value Set");
		this.friends = friends;
		this.feestructure = feestructure;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	 
	

	
}
