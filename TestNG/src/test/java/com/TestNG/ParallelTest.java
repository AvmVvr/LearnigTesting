package com.TestNG;

import org.testng.annotations.Test;

public class ParallelTest {

	@Test
	private void logIn() {
		System.out.println("User Sign in");
	}

	@Test
	private void logOut() {
		System.out.println("User SignOut");
	}
}
