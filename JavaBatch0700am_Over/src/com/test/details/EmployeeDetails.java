package com.test.details;

// Parent Class
public class EmployeeDetails {

	public void empID() {
		System.out.println("Empid is 100");
		}
	
	public void empName() {
		System.out.println("Emp Name is Java");
		}
	
	public void empDept() {
		System.out.println("Emp dept is Banking");

	}
		
	public static void main(String[] args) {
		EmployeeDetails ed = new EmployeeDetails();
		ed.empID();
		ed.empName();
		ed.empDept();
	}
	}
