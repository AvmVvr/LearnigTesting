package org.selenium.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Icici {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Greens\\Java_Selenium\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		WebElement user = driver.findElement(By.id("AuthenticationFG.USER_PRINCIPAL"));
		user.sendKeys("GreensTechnology");
		WebElement pass = driver.findElement(By.id("AuthenticationFG.ACCESS_CODE"));
		pass.sendKeys("Greens@123");
		WebElement loginButton = driver.findElement(By.id("VALIDATE_CREDENTIALS1"));
		loginButton.click();
	}

}
