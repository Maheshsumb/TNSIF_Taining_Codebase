package com.tnsif.day6.polymorphism.overriding;

public class MainClass {
public static void main(String[] args) {
	RBI rbi;
	rbi=new RBI();
	rbi.rateOfInterest();
	rbi=new SBI();
	rbi.rateOfInterest();
	rbi=new ICICI();
	rbi.rateOfInterest();
}
}
