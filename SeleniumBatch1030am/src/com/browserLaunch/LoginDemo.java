package com.browserLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginDemo {
	public static void main(String[] args) {
		// Browser Launch
		System.setProperty("webdriver.gecko.driver", "D:\\Job\\SeleniumTrain\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		// WebSite Launch --> Facebook
		driver.get("https://www.facebook.com/");
//		WebElement userName = driver.findElement(By.id("email"));
//		userName.sendKeys("vinosizzle@gmail.com");
		WebElement uN = driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']"));
		uN.sendKeys("vinosizzle@gmail.com");
		WebElement passWord = driver.findElement(By.id("pass"));
		passWord.sendKeys("@vm9245532039");
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();
	}
}
