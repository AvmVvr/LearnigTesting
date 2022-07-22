package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FramesDemo {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D:\\Job\\Selenium\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.leafground.com/pages/frame.html");
	}
}

