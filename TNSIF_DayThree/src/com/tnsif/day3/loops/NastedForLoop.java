package com.tnsif.day3.loops;

public class NastedForLoop {

	public static void main(String[] args) {
int n=10;
int m=20;
		for (int i = n; i <=m ; i++) {
			System.out.println("Table of "+i);
			for (int j = 1; j <= 10; j++) {
				System.out.print(i*j+" ");
			}
			System.out.println("\n");
			
		}
	}

}
