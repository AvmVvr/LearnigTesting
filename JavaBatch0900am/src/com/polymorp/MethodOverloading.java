package com.polymorp;

public class MethodOverloading {
	public void empDetails(String empName,int age,long aadhar) {
		System.out.println("Emp. Name is "+empName);
		System.out.println("Emp Aadhar No. is "+aadhar);
		System.out.println("Emp age is "+age);
	}
		public void empDetails(int mobile, int empId,String location) {
		System.out.println("Emp. mobile no is "+mobile);
		System.out.println("Emp Id is "+empId);
		System.out.println("Emp Location is "+location);
	}
	public static void main(String[] args) {
		MethodOverloading mo = new MethodOverloading();
		mo.empDetails("Rahul", 24, 1234567890123456l);
		mo.empDetails(1234567890, 100, "Chennai");
	}
}
