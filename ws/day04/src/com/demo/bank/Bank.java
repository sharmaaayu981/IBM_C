package com.demo.bank;

public interface Bank {
	void deposit();
	void debit();
	void credit();
	void createAcc();
	void applyLoan();
	void checkBal();
	void cancleCheque();
	void pay();
	void updateDetails();
}
interface OnlineUser {
	void debit();
	void applyLoan();
	void checkBal();
	void cancleCheque();
	void pay();
	void updateDetails();
}
interface Atm {
	void debit();
	void checkBal();
	void updateDetails();
}
interface BankVistor {
	void deposit();
	void debit();
	void credit();
	void createAcc();
	void applyLoan();
	void checkBal();
	void cancleCheque();
	void updateDetails();
}
