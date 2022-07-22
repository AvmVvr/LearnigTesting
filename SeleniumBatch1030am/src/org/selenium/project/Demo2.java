package org.selenium.project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo2 {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "D:\\Greens\\Selenium\\Driver\\geckodriver.exe");
		WebDriver Driver = new FirefoxDriver();
		Driver.get("https://www.myntra.com/");
		Driver.manage().window().maximize();

		WebElement women = Driver.findElement(By.xpath("(//a[@data-reactid='180'])[1]"));
		Actions ac = new Actions(Driver);
		ac.moveToElement(women).perform();

		WebElement men = Driver.findElement(By.xpath("(//a[@data-reactid='21'])[1]"));

		ac.moveToElement(men).perform();

		WebElement tshirt = Driver.findElement(By.xpath("//a[@data-reactid='31']"));
		ac.moveToElement(tshirt).perform();

		Thread.sleep(2000);

		JavascriptExecutor js = (JavascriptExecutor) Driver;
		js.executeScript("arguments[0].click();", tshirt);
		
		

	}
}
