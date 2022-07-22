package org.selenium.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Instagram {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Greens\\Java_Selenium\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en) login page");
		WebElement user = driver.findElement(By.xpath("//input[@name='username']"));
		user.sendKeys("Greens Technology");
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("1234568790");
		WebElement loginbutton = driver.findElement(By.xpath(
				"(//div[@class='             qF0y9          Igw0E     IwRSH      eGOV_       acqo5   _4EzTm    bkEs3                          CovQj                  jKUp7          DhRcB                                                    '])[1]"));
		loginbutton.click();

	}
}
