package com.demo;

class Demo extends Thread{

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println("Thread is running...."+name);
	}
}

public class ThreadDemo {

	public static void main(String[] args) {
		
		Demo t1 = new Demo();
		Demo t2 = new Demo();
		
		t1.start();
		t2.start();
	}
}
