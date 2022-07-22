package com.polymorphism;

public class MethodOverRiding extends MethodOverloading{
	@Override
	public void empDetail(int age, String empId, String comPlace) {
		super.empDetail(age, empId, comPlace);
		int empBouns = 50000;
		System.out.println("empBouns "+empBouns);
		
	}
public static void main(String[] args) {
	MethodOverRiding mor = new MethodOverRiding();
	mor.empDetail(35, "goo123", "India");
}
}
