package com.demo.exception;

import java.io.File;
import java.util.Scanner;

public class Exception02_Nested {
	public static void main(String[] args) {
		try {
			System.out.println("Enter your name: ");
			Scanner sc = new Scanner(new File("f://abc//a.txt"));
			int age = sc.nextInt();
			String name = null;
			try {
				System.out.println(name.toUpperCase());
			} catch (NullPointerException e) {
				System.out.println("Name is null");
			}
		} catch(Exception e) {
			try {
//			file.close()
			} catch(Exception e2) {
				
			}
		}
		
	}

}
