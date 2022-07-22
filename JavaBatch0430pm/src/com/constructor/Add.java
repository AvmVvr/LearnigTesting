package com.constructor;

public class Add {
	public Add() {
		System.out.println("This is default constructor");
	}
	public Add(int a,int b) {
		int c = a+b;
		System.out.println("Result "+c);
	}
public static void main(String[] args) {
	Add a = new Add();
	Add a1 = new Add(10,20);
	
}
}
