package com.tnsif.day5.association;

public class Address {

	private String City;
	private String street;
	private int postalCode;
	private String  state;
	
	
	public Address() {
		
	}
	public Address(String city, String street, int postalCode, String state) {
		super();
		City = city;
		this.street = street;
		this.postalCode = postalCode;
		this.state = state;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	@Override
	public String toString() {
		return "Address [City=" + City + ", street=" + street + ", postalCode=" + postalCode + ", state=" + state + "]";
	}
	
	
	
}
