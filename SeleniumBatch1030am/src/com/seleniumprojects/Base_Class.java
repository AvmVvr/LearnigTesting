package com.seleniumprojects;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Base_Class {

	public static WebDriver driver;
	
	public static WebDriver browser_Launch(String browserName) {
		
		if(browserName.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
	
		}
		else if(browserName=="firefox") {
			System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		
		return driver;
	}
	
	
	public static void enterUrl(String url) {
		
		driver.get(url);
		
	}
	
	public static WebElement byName(String whichLocator,String nameValue) {
		if(whichLocator.equalsIgnoreCase("name")) {
		return driver.findElement(By.name(nameValue));
		}
		return null;
	}
	
	public static void enterText(WebElement element,String value) {
		
		element.sendKeys(value);
		
	}
	
	public static void enter(WebElement element) {
		element.submit();
	}
	
	public static String gettingTitle() {
		return driver.getTitle();
	}
	
	public static void screenShot(String path) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sourceElement = ts.getScreenshotAs(OutputType.FILE);
		File targetElement=new File(path);
		try {
		FileHandler.copy(sourceElement, targetElement);
		}
		catch(Exception e) {
			System.out.println("Check it");
		}
	}
}
	
