package org.selenium.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SnapDeal {
	
		public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Greens\\Java_Selenium\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.snapdeal.com/login");
		WebElement mobile = driver.findElement(By.id("userName"));
		mobile.sendKeys("1234567890");
		WebElement continueButton = driver.findElement(By.id("checkUser"));
		continueButton.click();
	}
}
