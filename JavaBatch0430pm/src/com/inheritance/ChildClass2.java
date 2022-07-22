package com.inheritance;

public class ChildClass2 extends ParentClass{
	public void businessDetail() {
		System.out.println("Monthly Turnover is 60k");
	}
public static void main(String[] args) {
	ChildClass2 cc2 = new ChildClass2();
	cc2.bankBalance();
	cc2.landDetail();
	cc2.businessDetail();
}
}
