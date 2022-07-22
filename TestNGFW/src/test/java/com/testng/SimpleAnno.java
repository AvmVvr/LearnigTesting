package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.baseclass.BaseClass;

public class SimpleAnno extends BaseClass{
	@BeforeSuite
	public void WebbrowserLaunch() {
		System.out.println("browserLaunch");
		System.out.println("websiteLaunch");
	}
	
	@BeforeTest
	public void loginPageRedirect()  {
		System.out.println("loginPageRedirect");
	}
	
	@BeforeClass
	public void logindetail() {
		System.out.println("user Entered Username, Password & CLicked Login Button");		
	}
	
	@BeforeMethod
	public void getTitleOfPage() {
		System.out.println("WebPage Title");
	}
	
	@Test
	private void mobile() {
		System.out.println("Mobile unit displayed");

	}
	
	@Test
	public void footWear() {
		System.out.println("Footwears are displayed");
	}
	
	@AfterMethod
	public void takeScreenShot() {
		System.out.println("Screenshot Taken");
	}
	
	@AfterClass
	public void printWebPageURL() {
		System.out.println("Current URL");
	}
	
	@AfterTest
	public void cookiesClear() {
		System.out.println("All cookies are deleted");
	}
	
	@AfterSuite
	public void browserExit() {
		System.out.println("Browser Close & Quit");
	}

}
