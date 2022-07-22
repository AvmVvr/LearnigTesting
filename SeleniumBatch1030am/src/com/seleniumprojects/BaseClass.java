package com.seleniumprojects;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	public static WebDriver driver;
	
//	public static void chromeLaunch() {
//		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//	}
//	
//	public static void firefox() {
//		System.setProperty("webdriver.gecko.driver", "");
//	}
	
	public static void browsers(String browserName) {
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Driver//chromedriver.exe");
			 driver = new ChromeDriver();
			 driver.manage().window().maximize();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./Driver/chromedriver.exe");
			 driver = new FirefoxDriver();
			 driver.manage().window().maximize();
		}
		
		else {
			//edgeDriver
		}
	}
	public static void loadUrl(String url) {
		driver.get(url); 
	}
	
	public static WebElement findElementBy(String whichLocator,String value) {
		if(whichLocator.equalsIgnoreCase("name")) {
			return driver.findElement(By.name(value));
		}
		else if(whichLocator.equalsIgnoreCase("id")) {
			return driver.findElement(By.id(value));
		}
		//xpath , cssselector,linkText
		return null;
	}
	
	public static void enterText(WebElement element,String value) {
		element.sendKeys(value);
	}
	
	public static String gettingTitle() {  //getCurrentUrl   getText,getWEindowenHandle
		return driver.getTitle();
	}
	
	public static void screenshot(String File) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File browser=ts.getScreenshotAs(OutputType.FILE);
		File system = new File(File);
		try {
		FileUtils.copyFile(browser, system);	
	}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void tearDown() {
		driver.quit();
	}
	
	public static void waitFor(long sec) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
	}
	//get(String url)
	
}
