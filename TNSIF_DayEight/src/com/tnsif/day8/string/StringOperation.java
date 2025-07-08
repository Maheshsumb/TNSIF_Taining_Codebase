package com.tnsif.day8.string;

public class StringOperation {
public static void main(String[] args) {
	
	// Heap Memory
	String s=new String(" Indian ");
	System.out.println(s);
	
	System.out.println(s.toUpperCase());
	System.out.println(s.toLowerCase());
	System.out.println("Length of string "+s.length());
	System.out.println(s.substring(2));
	System.out.println(s.substring(2,4));
	System.out.println(s.trim());
	System.out.println(s.stripTrailing());
	System.out.println(s.stripLeading());
	
	System.out.println(s.isEmpty());
	
	String s1=new String(s);
	System.out.println();
	
	
//	== ---> Check object reference
//	equals ---> check data
	
	
	
	System.out.println("Case 1: "+s1==s);
	System.out.println("Case 2: "+s1.equals(s));
	
	

	
	
}
}
