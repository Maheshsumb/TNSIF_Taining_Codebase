package com.tnsif.day5.inheritance.hierarchical;

public class Person {
	
	private String pName;
	private String pCity;
	
	
	public Person() {
		
		System.out.println("Person class default class");
		pName="Mahesh";
		pCity="Pune";
	}
	
	
	public Person(String pName, String pCity) {
		super();
		this.pName = pName;
		this.pCity = pCity;
	}


	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpCity() {
		return pCity;
	}
	public void setpCity(String pCity) {
		this.pCity = pCity;
	}
	@Override
	public String toString() {
		return "Person [pName=" + pName + ", pCity=" + pCity + "]";
	}
	
	
	
	
	

}
