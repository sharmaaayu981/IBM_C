package com.demo;

public class AnnonymousDemo {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
				System.out.println("Car is runnin...");
			}
		});
		
		t1.start();
	}
}
