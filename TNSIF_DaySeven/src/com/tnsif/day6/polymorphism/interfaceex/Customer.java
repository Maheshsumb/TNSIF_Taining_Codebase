package com.tnsif.day6.polymorphism.interfaceex;

public class Customer{
	private String cName;
	private String cCity;
	public Customer() {
		
	}
	public Customer(String cName, String cCity) {
		super();
		this.cName = cName;
		this.cCity = cCity;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getcCity() {
		return cCity;
	}
	public void setcCity(String cCity) {
		this.cCity = cCity;
	}
	
	
	
	

}
