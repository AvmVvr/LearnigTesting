package com.TestNG;

import org.testng.annotations.Test;

public class Exceptionn {

	@Test 
	private void login() {
		System.out.println("login successfull");
	}

	@Test  (expectedExceptions = Exception.class)
	private void display() {
		System.out.println(1);
		System.out.println(1);
		System.out.println(1/0);
		System.out.println(1);
	}

	
	
	
}
