package com.demo.exception;

public class InvalidUserExceptoin extends Exception {

	public InvalidUserExceptoin() {}
	public InvalidUserExceptoin(String msg) {
		super(msg);
	}
	public InvalidUserExceptoin(Exception e) {super(e);}
	public InvalidUserExceptoin(String msg, Exception e) {super(msg, e);}
}
