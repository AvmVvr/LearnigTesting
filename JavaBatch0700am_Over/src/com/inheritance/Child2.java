package com.inheritance;

public class Child2 extends ParentClass {
public void business() {
	System.out.println("Earning Rs . 15K");
}
public static void main(String[] args) {
	Child2 c2 = new Child2();
	c2.bankBalance();
	c2.bankinfo();
	c2.business();
}
}
