package com.java;

public class EmployeeDetails {
	public EmployeeDetails() {
		System.out.println("Company Name is Java");
	}
	public EmployeeDetails(int id) {
		System.out.println("Employee id is "+id);
	}
	public EmployeeDetails(String Name) {
		System.out.println("Employee name is "+Name);
	}
public static void main(String[] args) {
	EmployeeDetails ed = new EmployeeDetails();
	EmployeeDetails ed1 = new EmployeeDetails(100);
	EmployeeDetails ed2 = new EmployeeDetails("Vinoth");
}
}