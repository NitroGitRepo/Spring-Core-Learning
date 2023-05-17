package com.springcore.componentannotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
@Component("stu")
//@Scope("singleton")
@Scope("prototype")
public class Student {

	@Value("Durgesh Tiwari")
	private String studentName;
	
	@Value("Jabalpur ")
	private String city;
	
	//pass value of standalone value here
	@Value("#{pack}")
	private List<String> addresses;
	
   
	
	public List<String> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<String> addresses) {
		this.addresses = addresses;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + ", addresses=" + addresses + "]";
	}
	
	
}
