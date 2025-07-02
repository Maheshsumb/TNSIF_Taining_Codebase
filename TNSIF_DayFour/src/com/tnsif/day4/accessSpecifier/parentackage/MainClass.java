package com.tnsif.day4.accessSpecifier.parentackage;

public class MainClass {
 public static void main(String[] args) {
	
	 //Accessing same package class
	 
	 Base b1 =new Base();
	 
	 b1.methodDefault();
	 b1.methodPublic();
	 b1.methodProtected();
	 
//	 b1.methodPrivate(); 				- Cannot access because of private specifier
	 
	 b1.varDefault=90;
	 b1.methodDefault();
	 
	 b1.varProtected=9;
	 b1.methodProtected();
	 
}
}
