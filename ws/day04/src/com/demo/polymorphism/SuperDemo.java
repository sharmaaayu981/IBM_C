package com.demo.polymorphism;

class A{
	A(){
		System.out.println("In A constructor...");
	}
}
class B{
	B(){
		System.out.println("In B constructor...");
	}
}
class C extends B{
	C(){
		System.out.println("In C constructor...");
	}
}

public class SuperDemo {
	public static void main(String[] args) {
//		A a = new A();
//		B b = new B();
		C c = new C();
	}
}
