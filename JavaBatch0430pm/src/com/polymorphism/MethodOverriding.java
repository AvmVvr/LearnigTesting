package com.polymorphism;

public class MethodOverriding extends MethodOverloading{
@Override
	public void empDetail(String Name, int age, int pincode) {
		String empName = "Nithya";
		System.out.println("Other emp name "+empName);
		super.empDetail(Name, age, pincode);
	}
public static void main(String[] args) {
	MethodOverriding mr = new MethodOverriding();
	mr.empDetail("Janani", 35, 605701);
}
}
