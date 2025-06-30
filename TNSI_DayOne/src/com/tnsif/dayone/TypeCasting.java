package com.tnsif.dayone;

public class TypeCasting {
public static void main(String[] args) {
	
	//Type casting - 2 types
	
		//	widening- Implicit type casting
	
	float f1=3.34f;
	double d1=f1;
	System.out.println(d1);
	
	
		// Narrowing - Explicit type casting
	
	int f2=23;
	double d3= (double) f2;
	System.out.println(d3);
}
}
