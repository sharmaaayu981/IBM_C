package com.demo;

public class LambdaThread {

	public static void main(String[] args) {
		Thread t1 = new Thread(()-> {
				System.out.println(Thread.currentThread().getName());
				System.out.println("Car is runnin...");
			}
		);
		t1.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("something...");
	}
}
