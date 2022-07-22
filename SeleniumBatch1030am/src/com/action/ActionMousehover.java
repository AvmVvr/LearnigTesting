package com.action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionMousehover {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "D:\\Job\\SeleniumTrain\\Driver\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	
	driver.get("https://www.myntra.com/");
	
	WebElement men = driver.findElement(By.xpath("//a[@data-reactid='21']"));
	
	Actions act = new Actions(driver);
	act.moveToElement(men).perform();
	
	Thread.sleep(2000);
	WebElement jacket = driver.findElement(By.xpath("//a[@data-reactid='41']"));
	act.moveToElement(jacket).perform();
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].click()", jacket);
}
}
