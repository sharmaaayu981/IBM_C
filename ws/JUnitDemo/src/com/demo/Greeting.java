package com.demo;

public class Greeting {

	public String greet(String name) {
		// TODO Auto-generated method stub

		return "Welcome " + String.valueOf(name.charAt(0)).toUpperCase() + name.substring(1).toLowerCase();
	}

}
