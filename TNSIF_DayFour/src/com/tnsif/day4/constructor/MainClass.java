package com.tnsif.day4.constructor;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
//		 Non Parameterized Constructor called
		
		Customer a=new Customer();
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Customer ID: ");
		int cId = s.nextInt();
		System.out.print("Enter Customer Name: ");
		String cName = s.next();
		System.out.print("Enter Customer City: ");
		String cCity = s.next();
		System.out.println();
		
		
//		Parameterized Constructor with 2 argument called
		
		Customer b =  new Customer(cId,cName);
		System.out.println(b);
		
//		Parameterized Constructor with 3 argument  called
		
		Customer c = new Customer(cId,cName,cCity);
		System.out.println(c);
		s.close();
	}

}
