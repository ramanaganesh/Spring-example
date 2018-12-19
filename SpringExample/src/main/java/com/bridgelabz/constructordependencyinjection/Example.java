package com.bridgelabz.constructordependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Example
{
	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("constructor.xml");
		Student student=(Student) context.getBean("student");
		student.display();
		Student student1=(Student) context.getBean("student1");
		student1.display();
		((ConfigurableApplicationContext)context).close();

	}
}
