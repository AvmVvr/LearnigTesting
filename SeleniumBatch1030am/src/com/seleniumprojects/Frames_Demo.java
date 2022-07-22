package com.seleniumprojects;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.switchTo().frame(0);
		WebElement btnOne=driver.findElement(By.id("Click"));
		btnOne.click();
		driver.switchTo().defaultContent();
		WebElement outerframe=driver.findElement(By.xpath("//iframe[@src='page.html']"));
		driver.switchTo().frame(outerframe);
		driver.switchTo().frame("frame2");  //nestedFrame
		
		WebElement btnTwo=driver.findElement(By.id("Click1"));
		btnTwo.click();
		
		driver.switchTo().parentFrame();
		driver.switchTo().parentFrame();
		
		List<WebElement> noOfFrames = driver.findElements(By.tagName("iframe"));
		System.out.println(noOfFrames.size());
	}
}
