package com.exception;

public class Basic {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		try {
			System.out.println(4/0);
		} catch (ArithmeticException e) {
			System.out.println("Values cant divide by zero");
		}
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
	}

}
