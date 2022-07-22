package com.waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", ".\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("q")).sendKeys("Cheese" + Keys.ENTER);
		
		// Initialize and wait till element(link) became clickable - timeout in 20 seconds
		WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(20))
		        .until(ExpectedConditions.elementToBeClickable(By.xpath("//a/h3")));
		// Print the first result
		System.out.println(firstResult.getText());
		
	}

}
