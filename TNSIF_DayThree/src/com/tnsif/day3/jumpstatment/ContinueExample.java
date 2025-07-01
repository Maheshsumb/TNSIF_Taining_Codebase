package com.tnsif.day3.jumpstatment;

public class ContinueExample {

	public static void main(String[] args) {
		
		/*
		 Continue Statement
		 	- it skips that iteration and go to next iteration
		 */
		for (int i = 0; i <= 10; i++) {
			
			
			if (i % 2 != 0)  // Odd numbers are skipped
				continue;
			System.out.println(i + " is even number");  // Even Number are printed
		}

	}

}
