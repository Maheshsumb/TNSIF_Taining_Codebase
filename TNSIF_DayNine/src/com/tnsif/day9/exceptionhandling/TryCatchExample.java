package com.tnsif.day9.exceptionhandling;

public class TryCatchExample {

	
	public static void performDivision(int x,int y) {
		
		System.out.println("I am a method ");
		try {
			System.out.println("Try Block");
			int z=x/y;
			
			System.out.println("Division of "+ x +" and "+y+" is :"+z);
		} catch (ArithmeticException e) {
			System.err.println("Cannot divide "+ x+" by "+ y+" !!!!");
		}
		
	}
}
