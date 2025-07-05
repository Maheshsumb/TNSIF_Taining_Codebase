package com.tnsif.day6.finalkeyword;

public class FinalMethod {
	
	public FinalMethod() {
		System.out.println("Default Constructor base class");
	}
	
	final int x=99;
	
	final void show() {
		System.out.println("Final Method Base Class\n Value of x: "+x);
	}

	@Override
	public String toString() {
		return "FinalMethod [x=" + x + "]";
	}
	
	
}
