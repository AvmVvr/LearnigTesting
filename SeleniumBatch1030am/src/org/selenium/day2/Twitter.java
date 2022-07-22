package org.selenium.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Twitter {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Greens\\Java_Selenium\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://twitter.com/login");
		WebElement user = driver.findElement(By.xpath("//input[@autocomplete='username']"));
		user.sendKeys("GreensTechnology");
		WebElement next = driver.findElement(By.xpath(
				"(//div[@class='css-901oao r-1awozwy r-6koalj r-18u37iz r-16y2uox r-37j5jr r-a023e6 r-b88u0q r-1777fci r-rjixqe r-bcqeeo r-q4m81j r-qvutc0'])[3]"));
		next.click();
		WebElement pass = driver.findElement(By.xpath(
				"//div[@class='css-1dbjc4n r-18u37iz r-16y2uox r-1wbh5a2 r-1wzrnnt r-1udh08x r-xd6kpl r-1pn2ns4 r-ttdzmv']"));
		pass.sendKeys("Greens@123");

		WebElement login = driver.findElement(By.xpath(
				"(//div[@class='css-901oao r-1awozwy r-6koalj r-18u37iz r-16y2uox r-37j5jr r-a023e6 r-b88u0q r-1777fci r-rjixqe r-bcqeeo r-q4m81j r-qvutc0'])[3]"));
		login.click();
	}

}
