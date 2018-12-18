package com.bridgelabz.setterdependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam 
{
	public static void main(String[] args) {
		
	

	ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
	Student student=(Student) context.getBean("student");
	student.display();
	Student student1=(Student) context.getBean("student1");
	student1.display();
	((ConfigurableApplicationContext)context).close();
	}
}
