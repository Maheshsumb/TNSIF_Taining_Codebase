
package com.tnsif.day6.polymorphism.overloading;

// Constructor overloading
public class Constructor {

	public Constructor() {
		System.out.println("Non Parametrized constructor..............");
	}

	public Constructor(int a) {
		System.out.println("Parametrized constructor with 1 variable= " + a);
	}

	public Constructor(float a) {
		System.out.println("Parametrized constructor with 1 variable= " + a);
	}

	public Constructor(int a, String s) {
		System.out.println("Parametrized constructor with 2 variable a: " + a +" and s: "+s);
	}

}
