package com.demo;

class Car implements Runnable {
	public void run() {
		for (int i = 0; i < 100; i++) {
			String name = Thread.currentThread().getName();
			System.out.println("Car is running...." + name + "-->i is "+i);
		}
	}
}

public class RunnableDemo {
	public static void main(String[] args) {
		Car c1 = new Car();

		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(new Car());

		c1.run();
		t1.start();
		t2.start();
	}
}
