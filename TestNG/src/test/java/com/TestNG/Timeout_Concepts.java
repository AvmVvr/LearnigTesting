package com.TestNG;

import org.testng.annotations.Test;

public class Timeout_Concepts {

	@Test
	private void logIn() {
		System.out.println("User Sign in");
	}

	@Test(timeOut = 4000)
	private void logOut() throws InterruptedException {
//		Thread.sleep(5000);
		System.out.println("User SignOut");

	}
}
