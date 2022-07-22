package com.inheritance;

public class ParentClass extends GrandParent {
	public void sub() {
		System.out.println("Subtraction");
	}
	public void multiply() {
		System.out.println("Multiplication");
	}
	public void Division() {
		System.out.println("Division");
	}
public static void main(String[] args) {
	ParentClass pc = new ParentClass();
	pc.sub();
	pc.multiply();
	pc.Division();
	
}
}
