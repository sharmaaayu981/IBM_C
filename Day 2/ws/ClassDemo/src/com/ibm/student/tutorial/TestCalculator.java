package com.ibm.student.tutorial;

public class TestCalculator {

	public static void main(String[] args) {
		int m = 4;
		int n = 3;
		int o = 6;
		
		Calculator cal = new Calculator();
//		int result = cal.add(cal.add(m, n), o);
//		
//		cal.add(m, n, o);
//		cal.add(m, n);
		
		cal.mul(2);
		cal.mul(2,5);
		cal.mul(2,5,6,9,88,1);

		
		cal.mul();
		
		int[] arr = {4,5,8,6};
		System.out.println(cal.mul(arr));
	}
}
