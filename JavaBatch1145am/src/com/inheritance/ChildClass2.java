package com.inheritance;

public class ChildClass2 extends ParentClass{
	public void business() {
		System.out.println("Monthly Turnover 60k");
	}
	public static void main(String[] args) {
		ChildClass2 c2 = new ChildClass2();
			c2.business();
	}
}
