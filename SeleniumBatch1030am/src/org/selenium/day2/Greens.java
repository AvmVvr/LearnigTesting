package org.selenium.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Greens {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Greens\\Java_Selenium\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		WebElement search = driver.findElement(By.xpath("//input[@name='q']"));
		search.sendKeys("GreensTechnology");
		WebElement searchButton = driver.findElement(By.xpath("(//input[@value='Google Search'])[2]"));
		searchButton.click();
	}
}
