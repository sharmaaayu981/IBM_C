package com.demo.reg;

public class Demo03 {

	public static void main(String[] args) {
//		String phoneReg = "[0-9]{10}";
		String phoneReg = "^[0]?(91)?[0-9]{10}$";
		String[] phones = { 
				"9685741236",
				"09685741236",
//				"+919685741236",
				"919685741236",
			};
		for (int i = 0; i < phones.length; i++) {
			if (phones[i].matches(phoneReg)) {
				System.out.println("valid");
			} else {
				System.out.println("invalid");
			}
		}
	}
}
