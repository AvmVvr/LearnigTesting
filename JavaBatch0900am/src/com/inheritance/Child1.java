package com.inheritance;
public class Child1 extends Parent {
	public void job() {
		System.out.println("Monthly Salary is 60k");
	}
	public static void main(String[] args) {
		Child1 c1 = new Child1();
		c1.job();
		c1.BankDetail();
		c1.bankBalance();
	}
}
