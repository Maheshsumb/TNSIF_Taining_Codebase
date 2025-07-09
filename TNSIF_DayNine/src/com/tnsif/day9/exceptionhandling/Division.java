package com.tnsif.day9.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {

	public static void divide() {
		
		int a,b,c;
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter 2 numbers: ");
		try {
			a=scanner.nextInt();
			b=scanner.nextInt();
			
			c=a/b;
			System.out.println(c);
		} catch (InputMismatchException e ) {
			System.err.println("Wrong input "+e.getMessage());
			
			
		}
		catch (ArithmeticException e) {
			System.err.println("Cannot perform operation "+ e.getMessage());
		}
		finally {
			System.out.println("End of program.......");
			scanner.close();
		}
	}
}
