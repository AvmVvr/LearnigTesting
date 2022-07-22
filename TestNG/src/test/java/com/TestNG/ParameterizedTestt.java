package com.TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTestt {
	@Test 
	@Parameters({"a","b"})
	public void add(int a,int b) {
		int c = a+b;
		System.out.println(c);
	}

}
