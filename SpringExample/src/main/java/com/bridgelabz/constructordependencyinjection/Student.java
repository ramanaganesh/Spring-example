package com.bridgelabz.constructordependencyinjection;

public class Student 
{
	private String studentName;
	private int id;
	
	public Student(String studentName, int id) 
	{
		this.studentName = studentName;
		this.id = id;
	}

	public Student(int id)
	{
		this.id = id;
	}

	public void display()
	{
		System.out.println("the student name is "+studentName+" and Id is :"+id);
	}
}