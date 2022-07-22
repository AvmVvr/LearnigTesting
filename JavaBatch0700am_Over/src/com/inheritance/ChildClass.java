package com.inheritance;

public class ChildClass extends ParentClass{
public void job() {
	System.out.println("My salary is : 10000");
}
	public static void main(String[] args) {
		ChildClass cc = new ChildClass();
		cc.bankBalance();
		cc.bankinfo();
		cc.job();
	}	
}