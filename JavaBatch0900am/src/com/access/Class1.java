package com.access;

public class Class1 {
	protected void add() {
		System.out.println("Addition from Class1");
	}
	public void sub() {
		System.out.println("Sub");
	}
	private void mul() {
		System.out.println("Mul");
	}
public static void main(String[] args) {
	Class1 c1 = new Class1();
	c1.mul();
	c1.add();
	c1.sub();
}
}
