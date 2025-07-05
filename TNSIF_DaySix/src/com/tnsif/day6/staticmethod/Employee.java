package com.tnsif.day6.staticmethod;

public class Employee {
	
	private String name;
	private int id;
	
	static String companyName="Shunnyatun var aaleli company";

	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", CompanyName= "+companyName+" ]";
	}

	
}
