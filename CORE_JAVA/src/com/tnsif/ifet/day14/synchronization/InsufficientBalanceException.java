package com.tnsif.ifet.day14.synchronization;

@SuppressWarnings("serial")
public class InsufficientBalanceException extends Exception {

	public InsufficientBalanceException() {
		super("Insufficient balance in your account!");
	}

	public InsufficientBalanceException(String message) {
		super(message);
	}
}
