package com.polymorphism;

public class MethodOverriding extends MethodOverloading{
	@Override
	public void empDetailz(int id, String company) {
		
		super.empDetailz(id, company);
	}
public static void main(String[] args) {
	MethodOverriding mr = new MethodOverriding();
	mr.empDetailz(200, "TCS");
}
}
