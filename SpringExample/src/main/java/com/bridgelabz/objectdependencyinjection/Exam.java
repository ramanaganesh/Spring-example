package com.bridgelabz.objectdependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam 
{
	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("objectbean.xml");
		System.out.println("xml file is loaded");
		Student student=(Student) context.getBean("student");
		student.studentAddress();
	}
}
