package com.springcore.lifecycle;

public class Samosa {

	 private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting Price");
		this.price = price;
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	//init() method
	public void init1() {
		System.out.println("Inside Init Method");
	}
	
	public void destroy1() {
		System.out.println("Inside Destroy Method");
		System.out.println("Java File");
	}
	
	
	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	 
	 
}
