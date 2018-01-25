package com.java.homwork5;

public class Deposit6Month implements Profitable, Tenurable {
	double profit, totalProfit, interrest, capital, conditionPeriod;
	int month_invested;

	@Override
	public double getConditionPeriod() {
		// TODO Auto-generated method stub
		this.conditionPeriod = 6.0;
		System.out.println("Condition Period"+this.conditionPeriod);
		return 6.0;
	}

	@Override
	public boolean isTenurable(int month_invested) {
		// TODO Auto-generated method stub
		if (month_invested >= 6) {
			System.out.println("Tenurable is true");
			System.out.println("----------------------------------------------");
			return true;
		} else {
			System.out.println("Tenurable is false");
			System.out.println("----------------------------------------------");
			return false;
		}
	}

	@Override
	public double getInterrest() {
		// TODO Auto-generated method stub
		this.interrest = 0.01;
		//System.out.println("Interrest is"+this.interrest);
		return this.interrest;
	}

	@Override
	public double calculateProfit(double capital, int month_invested) {
		this.capital = capital;
		this.month_invested = month_invested;
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
		String Condition = "If you deposit up to 6 month  , you will get 1% of money deposit (every 6 month)" + "\nYour deposit :"
				+ this.capital +"Bath"+ "\nYour Month Invested:"+this.month_invested+"Month"+"\nYour Profit :" + this.profit +"Bath"+ "\nTotal :" + this.totalProfit+"Bath";
		System.out.println(Condition);
		return Condition;
	}

}
