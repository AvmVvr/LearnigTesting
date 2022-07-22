package org.selenium;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunch {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver", "D:\\Job\\Selenium\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
				driver.get("http://www.facebook.com/");
				WebElement username = driver.findElement(By.name("email"));
		username.sendKeys("vinosizzle@gmail.com");
				WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("@vm9245532039");
				WebElement loginbutton = driver.findElement(By.name("login"));
		loginbutton.click();
		
	
		
	}
		
}
