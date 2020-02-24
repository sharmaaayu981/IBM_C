package com.demo.bank;

public class BankClient {

	public static void main(String[] args) {
		Bank bankUser = new HdfcBank();
		bankUser.applyLoan();

		Atm atmUser = new HdfcBank();
//		atmUser.applyLoan();
		OnlineUser ou = (OnlineUser)atmUser;
//		ou.
	}
}
