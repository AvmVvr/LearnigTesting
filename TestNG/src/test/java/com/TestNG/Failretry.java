package com.TestNG;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Failretry implements IRetryAnalyzer
{
	int count = 1;

	@Override
	public boolean retry(ITestResult result) {
		if(count<=5) {
			count++;
		return true;
		}
		return false;
	}
	
}
