package com.polymorp;

public class MethodOverriding extends MethodOverloading{
@Override
public void empDetails(int mobile, int empId, String location) {
	// TODO Auto-generated method stub
	super.empDetails(mobile, empId, location);
}
@Override
	public void empDetails(String empName, int age, long aadhar) {
		// TODO Auto-generated method stub
		super.empDetails(empName, age, aadhar);
	}
	public static void main(String[] args) {
		MethodOverriding mr = new MethodOverriding();
		mr.empDetails("Aswanth", 25, 1234567890654321l);
	}
}
