package org.selenium.project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {

	public static void main(String[] args) {
				
		System.setProperty("webdriver.gecko.driver", "D:\\Greens\\Selenium\\Driver\\geckodriver.exe");
		WebDriver Driver = new FirefoxDriver();
		Driver.get("https://www.myntra.com/");
	    Driver.manage().window().maximize();
		
		WebElement Men = Driver.findElement(By.xpath("//a[@data-reactid='21']"));
		Actions as = new Actions(Driver);
		as.moveToElement(Men).perform();
		
		WebElement tshrit = Driver.findElement(By.xpath("//a[@data-reactid='31']"));
		as.moveToElement(tshrit).perform();
		JavascriptExecutor  js = (JavascriptExecutor) Driver;
		js.executeScript("arguments[0].click();",tshrit);
	}
}
