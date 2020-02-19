package com.demo.inheritance;

public class SavingsAccount extends Account{

//	int roi = 3;
	int minBal = 5000;
	
	
	
	public int getRoi() {
//		return super.getRoi();
		return super.roi;
	}

	
	public void deposit(int amount) {
		setBalance(getBalance() + amount);
	}
	public void withdraw(int amount) {
		System.out.println("in child class");
		if(getBalance()-amount >= minBal) 
		{
			setBalance(getBalance() - amount);
		} else {
			System.out.println("invalid amount");
		}
	}
	
	
	public void openAccount() {
		System.out.println("new account request");
	}


	public void setRoi(int roi) {
		this.roi = roi;
	}


	static public void abc() {
		System.out.println("child abc");
	}

	@Override
	public int getBalance() {
		return 5000;
	}
	
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return super.toString();
//	}
	
}
