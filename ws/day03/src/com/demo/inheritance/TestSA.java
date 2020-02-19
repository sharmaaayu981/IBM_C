package com.demo.inheritance;

public class TestSA {
	public static void main(String[] args) {
		SavingsAccount sa = new SavingsAccount();
		
		sa.setBalance(50000);
//		
//		System.out.println(sa.toString());
//		
//		System.out.println(sa.getBalance());
		
		
		sa.setRoi(8);
		System.out.println(sa.getRoi());
		
		sa.withdraw(2000);

	}
}
