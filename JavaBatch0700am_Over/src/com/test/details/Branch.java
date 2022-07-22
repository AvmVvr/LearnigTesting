package com.test.details;

public class Branch extends Program1{
@Override
public void Bank(String bn) {
	super.Bank(bn);
	System.out.println("Branch name is Chennai");
}
	public static void main(String[] args) {
	Branch b = new Branch();
	b.Bank("HSBC");
}
}
