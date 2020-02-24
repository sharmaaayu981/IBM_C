package com.demo;

abstract class Account {
	int accountNumber;
	int roi;

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public int getRoi() {
		return roi;
	}
	
	public abstract void setRoi(int roi);
	
//	Bank bank;
}

class SavingsAccount extends Account {

	@Override
	public void setRoi(int roi) {
		// TODO Auto-generated method stub
		
	}

}
class CurrentAccount extends Account{

	@Override
	public void setRoi(int roi) {
		// TODO Auto-generated method stub
		
	}
	
}
public class Demo {
	
	
	public static void main(String[] args) {
//		Account ac = new Account();
	}
}




