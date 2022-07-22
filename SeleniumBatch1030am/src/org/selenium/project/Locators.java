package org.selenium.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	public static void main(String[] args) {
		
		// Browser Launch
		System.setProperty("webdriver.chrome.driver", "D:\\Greens\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// load the amazon website
		driver.get("https://www.amazon.in/");
		
		// Linktext
		
		driver.findElement(By.linkText("Home & Kitchen")).click();
		
		
		
	}

}
