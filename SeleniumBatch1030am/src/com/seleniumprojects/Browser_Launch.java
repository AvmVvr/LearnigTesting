package com.seleniumprojects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Launch {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\SPD\\eclipse-workspace\\Selenium_07.00_PM\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.navigate().to("https://www.facebook.com/");
	String fbTitle=driver.getTitle();
	System.out.println(fbTitle);
	driver.navigate().back();
	String amazonUrl=driver.getCurrentUrl();
	System.out.println(amazonUrl);
	driver.navigate().refresh();
	driver.navigate().forward();
	driver.quit();
	
	//browser launch
	//amazon URL load
	//maximize  
	//FaceBook  
	    //GetTitle
	//amazon
		//getCurrenturl
	//refresh
	//FaceBook
	//quit
	
	
	
	


	
	}
	
}
