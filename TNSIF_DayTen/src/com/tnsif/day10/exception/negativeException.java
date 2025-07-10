package com.tnsif.day10.exception;

public class negativeException extends Exception {

	public negativeException (String s) {
		super(s);
	}
	public negativeException () {
		super("Percentage should not be negative");
	}
	
}
