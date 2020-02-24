package com.demo.innerclass;

class Outer{
	public void show() {
		System.out.println("outer show");
	}
	class Inner{
		public void show() {
			System.out.println("inner show");
		}
	}
}

public class Demo {
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.show();
		Outer.Inner oi = new Outer().new Inner();
		oi.show();
	}
}
