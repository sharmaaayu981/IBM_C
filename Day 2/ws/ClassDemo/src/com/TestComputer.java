package com;

public class TestComputer {

	public static void main(String[] args) {
		Computer hp = new Computer();
		Computer lenovo = new Computer();
		
		hp.setOs("dos");
		Computer.manufacturer = "HP";
		System.out.println(hp);
		System.out.println(lenovo);
	}
}
