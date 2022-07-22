package org.selenium.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class adactin {
	public static void main(String[] args) {

		// Browser Launch
		System.setProperty("webdriver.chrome.driver", "D:\\Greens\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// load the adactin website
		driver.get("http://adactinhotelapp.com/");

		// passing login details in login page

		driver.findElement(By.id("username")).sendKeys("vinoadactin");
		driver.findElement(By.id("password")).sendKeys("@vm9245532039");
		driver.findElement(By.id("login")).click();

		// choose location
		WebElement location = driver.findElement(By.id("location"));
		Select s = new Select(location);
		s.selectByIndex(5);

		// choose Hotel
		WebElement hotels = driver.findElement(By.id("hotels"));
		Select s1 = new Select(hotels);
		s1.selectByValue("Hotel Sunshine");

		// choose Room type
		WebElement roomtype = driver.findElement(By.id("room_type"));
		Select s2 = new Select(roomtype);
		s2.selectByVisibleText("Super Deluxe");

		// choose room number
		WebElement roomnumb = driver.findElement(By.id("room_nos"));
		Select s3 = new Select(roomnumb);
		s3.selectByIndex(2);

		//choose the check-in date
		WebElement checkin = driver.findElement(By.id("datepick_in"));
		checkin.sendKeys("13/04/2022");

		//choose the checkout date
		WebElement checkout = driver.findElement(By.id("datepick_out"));
		checkout.sendKeys("17/04/2022");

		//choose the adult room
		WebElement adultroom = driver.findElement(By.id("adult_room"));
		Select s4 = new Select(adultroom);
		s4.selectByIndex(2);

		//choose the child room
		WebElement childroom = driver.findElement(By.id("child_room"));
		Select s5 = new Select(childroom);
		s5.selectByIndex(0);
		
		//select search
		WebElement search = driver.findElement(By.id("Submit"));
		search.click();
		
		//select radio button
		
		WebElement radio = driver.findElement(By.id("radiobutton_0"));
		radio.click();
		
		//select continue button
		WebElement continuue = driver.findElement(By.id("continue"));
		continuue.click();
		
		//entering firstname
		
	}
}
