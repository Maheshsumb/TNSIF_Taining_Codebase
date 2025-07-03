package com.tnsif.day5.inheritance.hierarchical;

public class Student extends Person{

	private String sClass;
	private float percent;
	public Student() {
		System.out.println("Student class default constructor");
		sClass="BE";
		percent=67.88f;
	}
	public Student(String pName, String pCity,String sClass, float percent) {
		super(pName,pCity);
		this.sClass = sClass;
		this.percent = percent;
	}
	public String getsClass() {
		return sClass;
	}
	public void setsClass(String sClass) {
		this.sClass = sClass;
	}
	public float getPercent() {
		return percent;
	}
	public void setPercent(float percent) {
		this.percent = percent;
	}
	@Override
	public String toString() {
		return "Student [sClass=" + sClass + ", percent=" + percent + ", getpName()=" + getpName() + ", getpCity()="
				+ getpCity() + "]";
	}
	
	
	
	
	
}
