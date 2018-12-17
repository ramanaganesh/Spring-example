package com.bridgelabz.objectdependencyinjection;

public class Student {

	private String name;
	private Address address;
	
	public void setName(String name) {
		System.out.println("the setter method for id");
		this.name = name;
	}
	
	public void setAddress(Address address) {
		System.out.println("the setter method for address object");
		this.address = address;
	}
	void studentAddress()
	{
		address.display();
	}
}
