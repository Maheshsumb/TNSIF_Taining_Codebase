package com.tnsif.day5.association;

public class MainClass {
	public static void main(String[] args) {
		
		Address address = new Address("Pune", "103 varale road", 410507, "Maharashtra");
		Person person = new Person("Mahesh", address);
		person.displayInfo();
		System.out.println(person);

	}
}

