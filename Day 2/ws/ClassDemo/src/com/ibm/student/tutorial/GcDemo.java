package com.ibm.student.tutorial;

public class GcDemo {

	public static void main(String[] args) {
		String a = "1";
		for(int i=0;i<50000;i++) {
			a += a+i;
//			System.out.println(a);
		}
	}
}
