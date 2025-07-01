package com.tnsif.day3.scanner;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		
	
	
	Scanner s = new Scanner(System.in);
	Person p1= new Person();
	
	System.out.print("Enter name: ");
	p1.setName(s.nextLine());
	System.out.print("Enter income: ");
	p1.setIncome(s.nextInt());
	System.out.print("Enter Gender: ");
	p1.setGender(s.next());
	System.out.print("Enter age: ");
	p1.setAge(s.nextInt());
	System.out.print("Enter Mobile number: ");
	p1.setMobileNumber(s.nextLong());
	
	System.out.println("Before Tax Calculation:");
	System.out.println(p1);
	TaxCalculation tx=new TaxCalculation();
	tx.calulateTax(p1);
	System.out.println("After Tax Calculation:");
	System.out.println(p1);
	
	}
}
