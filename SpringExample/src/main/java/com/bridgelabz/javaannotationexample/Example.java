package com.bridgelabz.javaannotationexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example {

	  
	public static void main(String[] args) {
		      ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		   
		      HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld");
		      helloWorld.setMessage("Hello World!");
		      helloWorld.getMessage();
		   }
}
