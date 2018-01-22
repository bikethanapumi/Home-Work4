package com.java.homwork5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DepositProductFactory fac = new DepositProductFactory();
		DepositSaving ds1 = fac.createDepositSaveing();
		Deposit6Month dm1 = fac.createDeposit6Month();
		Deposit6Month dm2 = fac.createDeposit6Month();

		ds1.getInterrest();
		ds1.calculateProfit(150000, 10);
		ds1.calculateTotal(150000, 10);
		ds1.printCondition();
		ds1.getConditionPeriod();
		ds1.isTenurable(10);

		dm1.getInterrest();
		dm1.calculateProfit(100000, 7);
		dm1.calculateTotal(100000, 7);
		dm1.printCondition();
		dm1.getConditionPeriod();
		dm1.isTenurable(7);

		dm2.getInterrest();
		dm2.calculateProfit(50000, 4);
		dm2.calculateTotal(50000, 4);
		dm2.printCondition();
		dm2.getConditionPeriod();
		dm2.isTenurable(4);

	}

}
