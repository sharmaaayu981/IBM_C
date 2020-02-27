package com.demo.deadlock;

import java.util.ArrayList;
import java.util.List;

public class TestApp {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(); 
		Thread adminThread = new Thread(new Admin(list));
		Thread cusThread = new Thread(new Customer(list));
		
		adminThread.start();
		cusThread.start();
	}
}
