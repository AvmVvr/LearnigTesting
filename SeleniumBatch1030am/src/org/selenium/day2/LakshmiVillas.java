package org.selenium.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LakshmiVillas {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Greens\\Java_Selenium\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.lvbankonline.in/lvbretail/RetailLogin.html");
		WebElement user = driver.findElement(By.xpath("//input[@name='username']"));
		user.sendKeys("GreensTechnology");
		WebElement pass = driver.findElement(By.id("login_password|input"));
		pass.sendKeys("Greens@123");
		WebElement loginButton = driver.findElement(By.id("ui-id-9"));
		loginButton.click();
	}
}
