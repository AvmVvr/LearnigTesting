package com.java;

public class Child extends ParentClass{
	public void mysalary() {
		System.out.println("My monthly salary is 65000");

	}
	public static void main(String[] args) {
//		object creation
// classname objname = new classname();
		
		Child c = new Child();
		c.dadsalary();
		c.mysalary();
		
	}

}
