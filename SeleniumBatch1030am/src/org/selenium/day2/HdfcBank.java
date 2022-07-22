package org.selenium.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HdfcBank {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Greens\\Java_Selenium\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://netbanking.hdfcbank.com/");
		WebElement user = driver.findElement(By.xpath("(//input[@name='fldLoginUserId'])"));
		user.sendKeys("GreensTechnology");
		WebElement continueButton = driver.findElement(By.xpath("(//a[@class='btn btn-primary login-btn'])"));
		continueButton.click();
	}
}
