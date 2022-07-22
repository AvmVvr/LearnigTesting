package com.TestNG;

import org.testng.annotations.Test;

public class DependencyConcepts {

	@Test
	public void signIn() {
		System.out.println("User signin");
	}

	@Test
	public void openBrowser() {
		
		System.out.println("Browser Open");
	}

	@Test(dependsOnMethods = "signIn")
	public void homePage() {
		
		System.out.println("User Navigate to Home Page");
	}
}
