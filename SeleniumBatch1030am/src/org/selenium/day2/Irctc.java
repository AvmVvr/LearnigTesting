package org.selenium.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Irctc {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Greens\\Java_Selenium\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.irctc.co.in/");
		WebElement okbutton = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		okbutton.click();
		WebElement from = driver.findElement(By.xpath("(//input[@role='searchbox'])[1]"));
		from.sendKeys("CHENNAI EGMORE - MS");
		WebElement to = driver.findElement(By.xpath("(//input[@role='searchbox'])[2]"));
		from.sendKeys("COIMBATORE JN - CBE");
		WebElement searchbutton = driver.findElement(By.xpath("//button[@class='search_btn train_Search']"));
		searchbutton.click();

	}
}
