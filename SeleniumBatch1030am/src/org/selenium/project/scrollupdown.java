package org.selenium.project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class scrollupdown {

	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","D:\\Greens\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		WebElement scrolldown = driver.findElement(By.xpath("//div[@class='nav-logo-base nav-sprite']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", scrolldown);
		
		Thread.sleep(500);	
		
		
		WebElement scrollup = driver.findElement(By.id("nav-logo-sprites"));
		js.executeScript("arguments[0].scrollIntoView();", scrollup);
		
		
	}

}
