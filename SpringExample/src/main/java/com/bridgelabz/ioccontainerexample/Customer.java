package com.bridgelabz.ioccontainerexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Customer 
{
	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("NewFile.xml");
		System.out.println("config loaded");
		BankReport report=(BankReport) context.getBean("report");
		report.generateReport();
		((ConfigurableApplicationContext)context).close();

	}
}
