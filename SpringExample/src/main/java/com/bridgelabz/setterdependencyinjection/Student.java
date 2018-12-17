package com.bridgelabz.setterdependencyinjection;

public class Student {
	private String studentName;
	private int id;
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void display()
	{
		System.out.println("the student name is "+studentName+" and Id is :"+id);
	}
}
