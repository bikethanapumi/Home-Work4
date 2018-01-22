package com.java.homwork5;

public interface Profitable {
double getInterrest();
double calculateProfit(double capital,int month_invested);
double calculateTotal(double capital,int month_invested);
String printCondition();
}
