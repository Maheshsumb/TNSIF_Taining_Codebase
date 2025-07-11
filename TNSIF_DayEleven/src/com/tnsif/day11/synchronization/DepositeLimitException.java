package com.tnsif.day11.synchronization;

public class DepositeLimitException extends Exception {

	public DepositeLimitException() {
		super("Amount is out exceed the deposite limit");
		
	}

	public DepositeLimitException(String message) {
		super(message);
	}

}
