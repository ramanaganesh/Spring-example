package com.bridgelabz.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body
{
	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("autowiredbean.xml");
		Human human=(Human) context.getBean("human");
		human.startPumping();
	}
}