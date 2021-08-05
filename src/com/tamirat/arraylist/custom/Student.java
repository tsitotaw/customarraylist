package com.tamirat.arraylist.custom;

public class Student {
	
	private String firstName;
	
	public Student(String firstName) {
		this.firstName = firstName;
	}

	public void setFirstName(String fName) {
		this.firstName = fName;
	}
	
	
	public String toString() {
		return "Student Name is " + this.firstName;
	}
	
	
}
