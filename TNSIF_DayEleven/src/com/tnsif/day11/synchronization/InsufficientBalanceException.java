package com.tnsif.day11.synchronization;

public class InsufficientBalanceException extends Exception {

	public InsufficientBalanceException() {
		super("Insufficient balance");
		
	}

	public InsufficientBalanceException(String message) {
		super(message);
		
	}
	
	

}
