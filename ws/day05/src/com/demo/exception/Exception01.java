package com.demo.exception;

import java.io.FileNotFoundException;

public class Exception01 {
	
	public static void main(String[] args) {
		System.out.println("App started");
		
		String name = "arunkumar";
		
		try {
			System.out.println(name.charAt(5));
	//		throw new NullPointerException();
			// System.exit();
			System.out.println("end of try block");
		}
//		catch(NullPointerException ex) {// = new NullPointerException()
//			System.out.println("name is null");
//		} catch (StringIndexOutOfBoundsException e) {
//			System.out.println("name is too short");
//		}
		catch (Exception e) {
			System.out.println("exceptoin");
		}
		
		System.out.println("App ended");
	}

}
