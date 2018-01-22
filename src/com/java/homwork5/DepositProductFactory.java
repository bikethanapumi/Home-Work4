package com.java.homwork5;

public class DepositProductFactory {
	DepositSaving createDepositSaveing() {
		return new DepositSaving();
	}
	Deposit6Month createDeposit6Month() {
		return new Deposit6Month();
	}
}
