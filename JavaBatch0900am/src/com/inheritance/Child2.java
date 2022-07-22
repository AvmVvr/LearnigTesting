package com.inheritance;

public class Child2 extends Parent{
	public void business() {
		System.out.println("Monthly Turnover 1 lakh");
	}
public static void main(String[] args) {
	Child2 c2 = new Child2();
	c2.business();
	c2.bankBalance();
	c2.BankDetail();
}
}
