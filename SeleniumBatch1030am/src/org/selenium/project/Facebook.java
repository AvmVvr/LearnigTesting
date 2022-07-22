package org.selenium.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Greens\\Selenium\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	}

}
