package org.selenium.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Swiggy {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Greens\\Java_Selenium\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.swiggy.com");
		WebElement user = driver.findElement(By.id("location"));
		user.sendKeys("Adayar");
		WebElement findFood = driver.findElement(By.xpath("//a[@class='_3iFC5']"));
		findFood.click();
	}
}
