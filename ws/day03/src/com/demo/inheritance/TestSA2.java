package com.demo.inheritance;

public class TestSA2 {

	public static void main(String[] args) {
//		Account a = new Account();
//		SavingsAccount sa = new SavingsAccount();
//		
//		a.withdraw(2000);
//		sa.withdraw(2000);
		
		Account a = new SavingsAccount();
		
		a.withdraw(2000);
		
//		a.openAccount();
	}
}
