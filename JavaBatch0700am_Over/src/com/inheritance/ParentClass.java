package com.inheritance;

public class ParentClass {	
	public void bankBalance() {
		System.out.println("Balance is : 100000");
	}
	public void bankinfo() {
		System.out.println("SBI");
	}
	public static void main(String[] args) {
		ParentClass pc = new ChildClass();
		pc.bankBalance();
		((ChildClass) pc).job();
	}
	

}