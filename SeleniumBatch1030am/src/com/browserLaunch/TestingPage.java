package com.browserLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestingPage {
	public static void main(String[] args) throws InterruptedException {
		//Browser Launch
		System.setProperty("webdriver.gecko.driver", "D:\\Job\\SeleniumTrain\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//Website Launch
		driver.get("http://demo.automationtesting.in/Register.html");
		
		WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		firstName.sendKeys("Vinothraj");
		
		WebElement lastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		lastName.sendKeys("V");
		
		WebElement address = driver.findElement(By.xpath("//textarea[@rows='3']"));
		address.sendKeys("Chennai-Adyar");
		
		
		WebElement gender = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		gender.click();
		
		WebElement hobby1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		hobby1.click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		
		WebElement skills = driver.findElement(By.xpath("//option[@value='Adobe InDesign']"));
		skills.click();

	}
}
