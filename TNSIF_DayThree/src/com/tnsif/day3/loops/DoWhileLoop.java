package com.tnsif.day3.loops;

public class DoWhileLoop {

	public static void main(String[] args) {
		
		/*
		 Do While Loop:
		 	- It is same as the while loop but the only difference i that it execute loop body at least  once 
		 	- It is Exist Control Loop
		 	- Executed until condition become false 
		 */

		int i = 1;

		do {
			System.out.println(i * 3);
			i++;
		} while (i <= 10);

	}

}
