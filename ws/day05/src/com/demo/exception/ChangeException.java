package com.demo.exception;

class MyException extends Exception{
	public MyException() {}
	public MyException(String msg) {super(msg);}
	public MyException(Exception e) {super(e);}
	public MyException(String msg, Exception e) {super(msg, e);}
}

public class ChangeException {

	public static void main(String[] args) throws MyException {
		try {
			throw new ArithmeticException();
		} catch (ArithmeticException e) {
			throw new MyException(e);
		}
	}
}
