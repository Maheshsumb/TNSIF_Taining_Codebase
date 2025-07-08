package com.tnsif.day8.wrapperclass;

public class WrapperClass {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		
		
		// Unboxing
		Integer integer=new Integer(10);   
		System.out.println(integer);
		int b=integer.intValue();
		System.out.println(b);
		
		// Without using intValue()
		
		int c=integer;
		System.out.println(c);
		
		
		// Autoboxing
		int a=100;
		Integer i1=a;
		System.out.println(i1);
		
	}

}
