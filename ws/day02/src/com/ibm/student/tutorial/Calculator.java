package com.ibm.student.tutorial;

public class Calculator {

	int add(int a, int b) {
		return a+b;
	}
	int add(int a, int b, int c) {
		return a+b+c;
	}

	int sub(int a) {
		return 0;
	}
	
	float sub() {
		return 3f;
	}
	
	int mul(int... nums) {
		int result = 1;
//		for(int num: nums) {
//			result *= num;
//		}
		for(int i=0;i<nums.length;i++) {
			result *= nums[i];
		}
		return result;
	}
	
	
}
