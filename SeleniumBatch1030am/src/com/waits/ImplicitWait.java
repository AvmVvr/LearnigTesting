package com.waits;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ImplicitWait {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", ".\\Driver\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	
	driver.get("https://www.google.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//	driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	
	
	
	WebElement searchBar = driver.findElement(By.name("qjhfjftrs"));
//	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
//	wait.until(ExpectedConditions.visibilityOf(searchBar));
	
	searchBar.sendKeys("Amazon");
	WebElement searchButton = driver.findElement(By.name("btnK"));
	searchButton.click();
	

}
}
