package com.exception;

public class AriException {
	public static void main(String[] args) {
		System.out.println("Start");
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		try{
			System.out.println(3/0);
			String s = null;
			try {
				int length = s.length();
				System.out.println(length);
			} catch (NullPointerException e) {
				System.out.println("String cant be empty/null");
			}
		}
		catch(ArithmeticException e) {
			System.out.println("zero is not a divisor");
		}
		finally {
			System.out.println("the finally block");
		}
		System.out.println("4");
		System.out.println("5");
		System.out.println("End");
	}
}


