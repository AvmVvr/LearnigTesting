package com.java;

public class ParentClass {
	public void dadsalary() {
		int salary = 50000;
		System.out.println("My salary is "+salary);
	}
public static void main(String[] args) {
	ParentClass pc = new ParentClass();
	pc.dadsalary();
}
}
