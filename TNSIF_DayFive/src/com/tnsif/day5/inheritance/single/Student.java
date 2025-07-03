package com.tnsif.day5.inheritance.single;

// Child Class
public class Student extends Citizen {

	private int rollNo;
	private String collegeName;

	// Non Parameterized constructor

	public Student() {
		super();

	}

	// Parameterized constructor

	public Student(String name, String adhharNO, String address, long phone, int rollNo, String collegeName) {
		super(name, adhharNO, address, phone);
		this.rollNo = rollNo;
		this.collegeName = collegeName;

	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", collegeName=" + collegeName + ", getName()=" + getName()
				+ ", getAdhharNO()=" + getAdhharNO() + ", getAddress()=" + getAddress() + ", getPhone()=" + getPhone()
				+ "]";
	}
	
	
	
	

}
