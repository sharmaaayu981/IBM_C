package com.demo.bank;

public class HdfcBank implements Bank, Atm, OnlineUser {

	@Override
	public void deposit() {
		System.out.println("depsit done");
	}

	@Override
	public void debit() {
		System.out.println("debit done");
	}

	@Override
	public void credit() {
		System.out.println("credit done");
	}

	@Override
	public void createAcc() {
		System.out.println("account created");
	}

	@Override
	public void applyLoan() {
		System.out.println("apply for loan");
	}

	@Override
	public void checkBal() {
		System.out.println("balance inquiry");
	}

	@Override
	public void cancleCheque() {
		System.out.println("cancle cheque");
	}

	@Override
	public void pay() {
		System.out.println("payment done");
	}

	@Override
	public void updateDetails() {
		System.out.println("details updated");
	}

}
