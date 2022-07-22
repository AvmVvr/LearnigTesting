package org.selenium.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Redbus {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Greens\\Java_Selenium\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.redbus.in/");
		WebElement from = driver.findElement(By.id("src"));
		from.sendKeys("Chennai");
		WebElement to = driver.findElement(By.id("dest"));
		to.sendKeys("Ooty");
	}	
}
