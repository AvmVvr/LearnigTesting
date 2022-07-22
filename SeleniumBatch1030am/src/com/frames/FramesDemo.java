package com.frames;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FramesDemo {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "D:\\Job\\SeleniumTrain\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.leafground.com/pages/frame.html");
		
		driver.switchTo().frame(0);
		
		WebElement firstBtn = driver.findElement(By.xpath("//button[@id='Click']"));
		firstBtn.click();
		
		driver.switchTo().defaultContent();
		
		WebElement outerFrame = driver.findElement(By.xpath("//iframe[@src='page.html']"));
		
		driver.switchTo().frame(outerFrame);
		driver.switchTo().frame("frame2");
		Thread.sleep(2000);
		
		WebElement nestedClick = driver.findElement(By.id("Click1"));
		nestedClick.click();
		
		driver.switchTo().parentFrame();
		driver.switchTo().parentFrame();
		
		List<WebElement> frameCount = driver.findElements(By.tagName("div"));
		System.out.println(frameCount.size());
		
	}
}


