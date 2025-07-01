package com.tnsif.day3.jumpstatment;

import java.util.Scanner;

public class SwitchCaseExample {
	public static void main(String[] args) {

		/*
		 Switch case Statement
		 	- Use to execute code from various cases 
		 	- If case is match then code is executed 
		 	- break is statement is    if we don't use break then the case below matched cases are 
			- default case is executed when there is no match cases
		 */
	Scanner scanner=new Scanner(System.in);
		System.out.println("<_____Choose Langauge_____>\n1. Hindi\n2. English\n3. Marathi");
		int usrIP= scanner.nextInt();
		switch (usrIP) {
		case 1: System.out.println("Namaste");
		break;
		case 2:System.out.println("Hello");
		break;
		case 3: System.out.println("Naskar");
		default:System.out.println("Invalid Option");
		
		
		}
		scanner.close();
	}
}
