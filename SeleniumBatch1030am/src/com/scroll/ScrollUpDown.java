package com.scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollUpDown {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "D:\\Job\\SeleniumTrain\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		
		WebElement down = driver.findElement(By.xpath("(//div[@class='navFooterColHead'])[1]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", down);
		
		Thread.sleep(3000);
		WebElement up = driver.findElement(By.xpath("(//span[@class='a-truncate-cut'])[1]"));
		js.executeScript("arguments[0].scrollIntoView();", up);
	}
}