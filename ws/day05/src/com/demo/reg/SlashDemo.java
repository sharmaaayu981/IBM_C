package com.demo.reg;

public class SlashDemo {

	public static void main(String[] args) {
		System.out.println("My name is \"Arun\"");
		
		String name = "abc";
		for(int i=0;i<100000;i++) {
			name = name + name + name;
			name = name + name + name;
			name = name + name + name;
			name = name + name + name;
		}
	}
}
