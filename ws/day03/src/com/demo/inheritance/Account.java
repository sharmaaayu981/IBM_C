package com.demo.inheritance;

public class Account {

	private int accNum;
	private int balance;
	protected int roi;
	
	public int getAccNum() {
		return accNum;
	}
	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}
	public int getBalance() {
		return balance;
	}
	protected void setBalance(int balance) {
		this.balance = balance;
	}
	public int getRoi() {
		return roi;
	}
	public void setRoi(int roi) {
		this.roi = roi;
	}
	
	public void deposit(int amount) {
		balance += amount;
	}
	public void withdraw(int amount) {
		balance -= amount;
	}
	
	
	static public void abc() {
		System.out.println("parent abc");
	}
	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", balance=" + balance + ", roi=" + roi + "]";
	}
	
	

	
}
