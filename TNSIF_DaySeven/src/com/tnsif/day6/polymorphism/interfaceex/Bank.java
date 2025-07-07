package com.tnsif.day6.polymorphism.interfaceex;

public interface Bank {

	float MiniBal=2000;
	float DepositeLimit=25000;  	//  BY default they are public, final and static
	
	void deposite(float amount);  // BY default abstract and public
	void withdraw(float amount);
	
}
