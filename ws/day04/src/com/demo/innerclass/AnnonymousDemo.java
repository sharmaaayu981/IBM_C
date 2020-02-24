package com.demo.innerclass;

interface Greet {
	void sayHello(String name);
}
public class AnnonymousDemo {

	public static void main(String[] args) {
		Greet g = new Greet() {
			public void sayHello(String name) {
				System.out.println("Welcome "+name);
			}
		};

		g.sayHello("mahesh");
		
		
		
		Greet g2 = new Greet() {
			
			@Override
			public void sayHello(String name) {
				// TODO Auto-generated method stub
				
			}
		};
	}
}
