package com.inheritance;

public class ChildClass extends ParentClass {
	public void add() {
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println("Result is "+c);
	}
	
	public static void main(String[] args) {
		ChildClass c = new ChildClass();
		c.add(); // Child Method
		c.sub(); //parent method
		c.multiply();
		c.Division();
		c.reminder();//grandParent
	}

}
