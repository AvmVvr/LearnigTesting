package com.select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class demoweb {
public static void main(String[] args) throws InterruptedException {
	/* Launching Web-Browser */
	System.setProperty("webdriver.gecko.driver", "D:\\Job\\SeleniumTrain\\Driver\\geckodriver.exe");
	
	WebDriver driver = new FirefoxDriver();
	
	
	
	/* opening the http://practice.automationtesting.in/ */
	driver.get("https://itera-qa.azurewebsites.net/home/automation");
	
	
	Thread.sleep(3000);
	/* Drop down*/
	WebElement dropDown = driver.findElement(By.xpath("//select[@class='custom-select']"));
	Select sel  = new Select(dropDown);
	sel.selectByVisibleText("Turkey");
//	sel.selectByValue("1");
//	sel.selectByIndex(7);
	
	
	
}
	
	
	
}
