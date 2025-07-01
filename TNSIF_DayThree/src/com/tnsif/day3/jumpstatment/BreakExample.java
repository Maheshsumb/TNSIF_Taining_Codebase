package com.tnsif.day3.jumpstatment;

public class BreakExample {

	public static void main(String[] args) {
		
		
		/*
		 Break Statement 
		 	- Used to terminate the execution of an loop
		 */
		int usrIP = 18;

		int i = 0;
		while (true) {
			if (i == usrIP) {
				System.out.println("Your Are  able to vote");
				break;
			}
			i++;
		}

	}
}
