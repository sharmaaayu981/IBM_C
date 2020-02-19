package com.demo.inherit;

class GP{
	protected String fn;
	private String mn;
	protected String ln;
	
	GP(String fn, String mn, String ln){
		System.out.println("in gp constructor");
		this.fn = fn;
		this.mn = mn;
		this.ln = ln;
	}
	void showName() {
		System.out.println("GrandParent-> "+fn+" "+this.mn+" "+ln);
	}

}
class P extends GP{
	protected String fn;
	P(String fn, String mn, String ln, String pmn){
		super(mn, pmn, ln);
		this.fn = fn;
		System.out.println("in p constructor");
	}
	void showName() {
		System.out.println("Parent-> "+fn+" "+super.fn+" "+ln);
		System.out.println("Grand Parent -> ");
		super.showName();
	}

}
class C extends P{
	protected String fn;
	C(String fn, String mn, String ln, String pmn, String gmn){
		super(mn, pmn, ln, gmn);
		this.fn = fn;
		System.out.println("in child constructor");
	}
	
	void showName() {
		System.out.println("Child -> "+fn+" "+super.fn+" "+ln);
		System.out.println("Parent -> ");
		super.showName();
	}
	
}
public class Demo {
	public static void main(String[] args) {
		C c = new C("a", "b", "c", "d", "e");
		c.showName();
	}

}
