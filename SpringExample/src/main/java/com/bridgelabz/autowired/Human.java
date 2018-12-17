package com.bridgelabz.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human
{


	@Autowired
	@Qualifier("humanHeart")
	private Heart heart;

	public Human() {
			}

	
	public Human(Heart heart) {
		System.out.println("constructor called");
		this.heart = heart;
	}


	public void setHeart(Heart heart) {
		
		this.heart = heart;
		System.out.println("setter method is executed");
	}
	
	
	void startPumping()
	{
		if(heart!=null)
		{
		heart.pump();
		System.out.println("name is "+heart.getName()+" and no of heart is " +heart.getNoOfHeart());
		}
		else
		{
			System.out.println("you are dead");
		}
	}
	
}
