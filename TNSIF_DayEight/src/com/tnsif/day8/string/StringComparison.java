package com.tnsif.day8.string;

public class StringComparison {

	public static void main(String[] args) {

		// Pool Memory
		String s1 = "TNSIF";
		String s2 = "TNSIF";

		// Heap Memory

		String s3 = new String("TNSIF");
		String s4 = new String("TNSIF");

		// ==
		System.out.println("Case 1: " + (s1 == s2));
		System.out.println("Case 2: " + (s1 == s3));
		System.out.println("Case 3: " + (s3 == s4));

		// equals
		System.out.println("Case 4: " + (s1.equals(s2)));
		System.out.println("Case 5: " + (s1.equals(s3)));
		System.out.println("Case 6: " + (s3.equals(s4)));

		/*
		 * Case 1: true Case 2: false Case 3: false Case 1: true Case 2: true Case 3:
		 * true
		 */
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		
		// CompareTo
		String s5="tnsif";
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s4));
		System.out.println(s1.compareTo(s5));
		System.out.println(s1.compareToIgnoreCase(s2));



	}
}
