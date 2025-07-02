package com.tnsif.day4.constructor;

public class Customer {
	
	

	private int cID;
	private String cName;
	private String cCity;
	
	
	// Non Parameterized Constructor
	public Customer() {
		System.out.println("Non Parameterized Constructor-------------");
	}
	
	// Parameterized Constructor
	public Customer(int cID, String cName, String cCity) {
		
		this();  // Calls the non parameterized constructor of same class
		this.cID = cID;   // this. used to assign value to current fields;
		this.cName = cName;
		this.cCity = cCity;
	}
	
	

	public Customer(int cID, String cName) {
		super();
		this.cID = cID;
		this.cName = cName;
	}
	
	

	public int getcID() {
		return cID;
	}

	public void setcID(int cID) {
		this.cID = cID;
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

	@Override
	public String toString() {
		return "Constructor [cID=" + cID + ", cName=" + cName + ", cCity=" + cCity + "]";
	}
	
	
	
	
	
}
