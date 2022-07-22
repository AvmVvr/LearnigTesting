package com.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CrossBrowser {
	@Test
	private void setUpOne() {
		System.setProperty("webdriver.gecko.driver", ".\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		System.out.println("Browser launched sucessfully");
		driver.get("https://www.facebook.com/");
		System.out.println("Webpage Launched sucessfully");
	}
	@Test
	private void setUpTwo() {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Browser launched sucessfully");
		driver.get("https://www.amazon.in/");
		System.out.println("Webpage Launched sucessfully");
	}
}
