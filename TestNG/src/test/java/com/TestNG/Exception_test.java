package com.TestNG;

import org.testng.annotations.Test;

public class Exception_test {

	@Test
	private void add() {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 10;
		System.out.println("Add: " + (a + b));

	}
@Test(expectedExceptions = ArithmeticException.class)
//@Test(expectedExceptions = Exception.class) ----> for unknown exception
	private void divide() {
		// TODO Auto-generated method stub
		int i = 10;
		int j = 0;

		System.out.println("result is : " + (i / j));
	}
}
