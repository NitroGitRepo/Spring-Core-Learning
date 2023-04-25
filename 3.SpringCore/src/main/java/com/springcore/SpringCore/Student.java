package com.springcore.SpringCore;

import java.util.List;

public class Student {

	private int studentId;
	private String studentName;
	private List<String> courses;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public List<String> getCourses() {
		return courses;
	}
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studentId, String studentName, List<String> courses) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", courses=" + courses + "]";
	}
	
	
}
