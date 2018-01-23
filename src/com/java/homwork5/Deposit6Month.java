package com.java.homwork5;

public class Deposit6Month implements Profitable, Tenurable {
	double profit, totalProfit, interrest, capital, conditionPeriod;

	@Override
	public double getConditionPeriod() {
		// TODO Auto-generated method stub
		this.conditionPeriod = 6.0;
		System.out.println(this.conditionPeriod);
		return 6.0;
	}

	@Override
	public boolean isTenurable(int month_invested) {
		// TODO Auto-generated method stub
		if (month_invested >= 6) {
			System.out.println("true");
			System.out.println("----------------------------------------------");
			return true;
		} else {
			System.out.println("false");
			System.out.println("----------------------------------------------");
			return false;
		}
	}

	@Override
	public double getInterrest() {
		// TODO Auto-generated method stub
		this.interrest = 0.01;
		System.out.println(this.interrest);
		return this.interrest;
	}

	@Override
	public double calculateProfit(double capital, int month_invested) {
		this.capital = capital;
		// TODO Auto-generated method stub
		if (month_invested >= 6) {
			int countMonth = month_invested / 6;
			this.profit = (0.01 * capital) * countMonth;
			return this.profit;
		} else {
			return this.totalProfit = capital;
		}

	}

	@Override
	public double calculateTotal(double capital, int month_invested) {
		this.capital = capital;
		// TODO Auto-generated method stub
		if (month_invested >= 6) {
			double calProfix=calculateProfit(capital,month_invested);
			this.totalProfit = calProfix + capital;
			return this.totalProfit;
		} else {
			return this.totalProfit = capital;
		}

	}

	@Override
	public String printCondition() {
		// TODO Auto-generated method stub
		String Condition = "if you deposit 6 month up , you will get 1% of money deposit" + "\nYour deposit :"
				+ this.capital + "\nYour Profit :" + this.profit + "\nTotal :" + this.totalProfit;
		System.out.println(Condition);
		return Condition;
	}

}
