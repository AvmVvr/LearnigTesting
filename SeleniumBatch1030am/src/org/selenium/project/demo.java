package org.selenium.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\Greens\\Selenium\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		//WebElement single = driver.findElement(By.xpath("//a[@class='analystic']"));
		//single.click();
		
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		
		driver.switchTo().frame(frame1);
		
		
		WebElement textbox = driver.findElement(By.xpath("//input[@type='text']"));
		textbox.sendKeys("asdf");
		
		driver.switchTo().defaultContent();
		
		
		
	}

}
