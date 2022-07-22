package org.selenium.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Adactin {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Greens\\Java_Selenium\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://adactinhotelapp.com/");
		driver.findElement(By.id("username")).sendKeys("vinoadactin");
		driver.findElement(By.id("password")).sendKeys("@vm9245532039");
		driver.findElement(By.id("login")).click();
	}
}
