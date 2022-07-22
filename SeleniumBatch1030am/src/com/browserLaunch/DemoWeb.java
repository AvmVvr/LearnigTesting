package com.browserLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoWeb {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vinothraj\\Desktop\\Backup1\\SeleniumBatch1030am\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); // Launch Chrome Browser

		driver.get("https://www.amazon.in/"); // Launch the Website
		
		driver.manage().window().maximize();
		// Maximize the Screen
		
		driver.navigate().to("https://www.facebook.com/"); // Navigate to another URL
		driver.navigate().back(); // facebook to amazon
		driver.navigate().refresh(); // refresh the webpage once
		driver.navigate().forward(); // amazon --> Facebook
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		String title = driver.getTitle();
		System.out.println(title);
		driver.close(); // Closing current TAB
		driver.quit(); // Close the Web Browser
	}
}
