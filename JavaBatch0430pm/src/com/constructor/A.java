package com.constructor;

public class A extends B{
public A() {
//	super(12);
	super("Hello");
System.out.println("Default const...");
}
public static void main(String[] args) {
A a = new A();
}
}