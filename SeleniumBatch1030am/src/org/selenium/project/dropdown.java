package org.selenium.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\Greens\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	WebElement create = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
	create.click();
	
	Thread.sleep(2000);
	
	WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
	firstname.sendKeys("Vinothraj");
	
	WebElement surname = driver.findElement(By.xpath("//input[@name='lastname']"));
	surname.sendKeys("Velmayil");
	
	WebElement mobile = driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']"));
	mobile.sendKeys("1234567890");
	
	WebElement pwd = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
	pwd.sendKeys("qwerty123");
	
	/* Date of Birth - Drop Down */
	
	WebElement bdate = driver.findElement(By.xpath("//select[@id='day']"));
	Select date = new Select(bdate);
	date.selectByIndex(23);
	
	WebElement bmonth = driver.findElement(By.xpath("//select[@name='birthday_month']"));
	Select month = new Select(bmonth);
	month.selectByIndex(8);
	
	WebElement byear = driver.findElement(By.xpath("//select[@id='year']"));
	byear.click();
	Select year = new Select(byear);
	year.selectByVisibleText("1987");
	
	/* Gender - Radio */
	WebElement gender = driver.findElement(By.xpath("(//label[@class='_58mt'])[2]"));
	gender.click();
	
	/* Submit */
	WebElement submit = driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']"));
	submit.click();
	
			
	
}
	
}
