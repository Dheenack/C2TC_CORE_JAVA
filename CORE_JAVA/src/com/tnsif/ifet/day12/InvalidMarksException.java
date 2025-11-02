package com.tnsif.ifet.day12;
@SuppressWarnings("serial")
public class InvalidMarksException extends Exception{
	public InvalidMarksException() {
		super();
	}
	public InvalidMarksException(String message) {
		super(message);
	}
}