package com.tnsif.day5.inheritance.single;

public class Citizen {

	private String name;
	private String adhharNO;
	private String address;
	private long phone;

	// Non Parameterized Constructor
	public Citizen() {

	}

//	Parameterized Constructor
	public Citizen(String name, String adhharNO, String address, long phone) {
		super();
		this.name = name;
		this.adhharNO = adhharNO;
		this.address = address;
		this.phone = phone;
	}

	// getter setter

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdhharNO() {
		return adhharNO;
	}

	public void setAdhharNO(String adhharNO) {
		this.adhharNO = adhharNO;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	// toString

	@Override
	public String toString() {
		return "Citizen [name=" + name + ", adhharNO=" + adhharNO + ", address=" + address + ", phone=" + phone + "]";
	}

}
