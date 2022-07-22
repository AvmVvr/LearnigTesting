package com.test.details;

public class Constructor {
	public Constructor() {
		System.out.println("Emp Name is John");
	}
	public Constructor(int i) {
	System.out.println("Emp id is "+i);
	}
	public Constructor(String s) {
	System.out.println("Emp Gender is "+s);
	}
public static void main(String[] args) {
	Constructor c1 = new Constructor();
	Constructor c2 = new Constructor(101);
	Constructor c3 = new Constructor("Male");
}
}
