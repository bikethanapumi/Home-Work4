package com.java.homwork5;

public class DepositSaving implements Profitable, Tenurable {
	double profit, totalProfit, interrest, capital,conditionPeriod;

	@Override
	public double getConditionPeriod() {
		// TODO Auto-generated method stub
		this.conditionPeriod = 0.0;
		System.out.println();
		return 0.0;
	}

	@Override
	public boolean isTenurable(int month_invested) {
		// TODO Auto-generated method stub
		if (month_invested >= 1) {
			System.out.println("true");
			return true;
		} else {
			System.out.println("false");
			return false;
		}

	}

	@Override
	public double getInterrest() {
		// TODO Auto-generated method stub
		this.interrest = 0.0025;
		return this.interrest;
	}

	@Override
	public double calculateProfit(double capital, int month_invested) {
		// TODO Auto-generated method stub

		this.capital = capital;
		// TODO Auto-generated method stub
		if (month_invested >= 1) {

			this.profit = (0.0025 * capital) * month_invested;
			return this.profit;
		} else {
			return this.totalProfit = capital;
		}
	}

	@Override
	public double calculateTotal(double capital, int month_invested) {
		// TODO Auto-generated method stub
		this.capital = capital;
		// TODO Auto-generated method stub
		if (month_invested >= 1) {
			
			this.totalProfit = ((0.0025 * capital) * month_invested) + capital;
			return this.totalProfit;
		} else {
			return this.totalProfit = capital;
		}

	}

	@Override
	public String printCondition() {
		// TODO Auto-generated method stub
		String Condition = "if you deposit 12 month , you will get 0.25% of money deposit" + "\nYour deposit :"
				+ this.capital + "\nYour Profit :" + this.profit + "\nTotal :" + this.totalProfit;
		System.out.println(Condition);
		return Condition;
	}

}