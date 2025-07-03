package com.tnsif.day5.inheritance.hierarchical;

public class Employee extends Person {

	
	private int empId;
	private float salary;
	private String dept;
	public Employee() {
		System.out.println("Default constructor Person class");
		empId=133;
		salary=898982.9f;
		dept="HR";
	}
	public Employee(String pName, String pCity ,int empId, float salary, String dept) {
		super(pName,pCity);
		this.empId = empId;
		this.salary = salary;
		this.dept = dept;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", salary=" + salary + ", dept=" + dept + ", getpName()=" + getpName()
				+ ", getpCity()=" + getpCity() + "]";
	}
	
	
	
	
	
	
}
