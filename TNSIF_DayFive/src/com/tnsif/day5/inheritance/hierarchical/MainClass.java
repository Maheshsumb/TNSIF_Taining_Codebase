package com.tnsif.day5.inheritance.hierarchical;

public class MainClass {
	public static void main(String[] args) {
		Person person=new Person();
		System.out.println("<-------Person details----------->\n"+person);
		
//		Student student=new Student();
//		System.out.println("<-------Student details----------->\n"+student);   
		
		System.out.println("-------------------------------------------------");
		Person person2;
		
		person2=new Person("Ram", "NSK");
		System.out.println("Person Details: "+person2);
		
		person2=new Student("Sahil", "Pune", "BE", 99.5f);
		System.out.println("Student Details: "+person2);
		
		person2=new Employee("Rajesh", "Nagar", 12131, 123456789,"Hacker");
		System.out.println("Employee Details: "+person2);
		

	}

}
