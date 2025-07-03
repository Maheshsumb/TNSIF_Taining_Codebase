package com.tnsif.day5.association;

public class Person {
 private String pName;
 private Address address;
 
 
public Person() {
	
}
public Person(String pName, Address address) {
	this.pName = pName;
	this.address = address;
}
public String getpName() {
	return pName;
}
public void setpName(String pName) {
	this.pName = pName;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}

public void displayInfo() {
	System.out.println("Name: "+pName);
	System.out.println("Address: "+address.getStreet()+", "+address.getCity()+", "+address.getState()+", "+address.getPostalCode());
}

@Override
public String toString() {
	return "Person [pName=" + pName + ", address=" + address + "]";
}
 
	
}
