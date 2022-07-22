package org.selenium.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {
	public static void main(String[] args) throws InterruptedException {

		// Loading Web Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Greens\\Selenium\\Driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();

		// loading Web browser
		d.get("https://itera-qa.azurewebsites.net/home/automation");

		WebElement Name = d.findElement(By.id("name"));
		Name.sendKeys("Vinoth");
		
		WebElement mobile = d.findElement(By.id("phone"));
		mobile.sendKeys("9898989898");

		d.findElement(By.id("female")).click();
		
		WebElement monday = d.findElement(By.id("monday"));
		monday.click();
		d.findElement(By.id("tuesday")).click();
		
		Thread.sleep(2000);
		
		monday.click();
		
	}

}
