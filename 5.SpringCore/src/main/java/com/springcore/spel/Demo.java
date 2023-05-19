package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("demo")
public class Demo {
  
	 @Value("#{22+11}")
	 private int x;
	 
	 @Value("#{22+1 }")
	 private int y;
	 
	 
	 //static method call
	 @Value("#{T(java.lang.Math).sqrt(16)}")
	 private double z;
	 
	 //static variable invoke
	 @Value("#{T(java.lang.Math).PI }")
	 private double E;
	 
	 //create object using spel
	 @Value("#{new java.lang.String('Rajneeesh Yadav')}")
	 private String name;
	 
	 @Value("#{ 8>3}")
	 private boolean isActive;
	 
	 
	 
	 

	public double getE() {
		return E;
	}

	public void setE(double e) {
		E = e;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Demo(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Demo() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", E=" + E + ", name=" + name + ", isActive=" + isActive
				+ "]";
	}
	 
	  
	 
	 
	
	 
}
