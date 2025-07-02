package com.tnsif.day4.oopsconceptdemo.encapsulation;


public class Car {
	
	public String company;
	private String color;
	
	public void setColor(String color) { 
		this.color = color;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public String getColor() {
		return color;
	}
	
	public String getCompany() {
		return company;
	}

	@Override
	public String toString() {
		return "Car [company=" + company + ", color=" + color + "]";
	}
	
}
