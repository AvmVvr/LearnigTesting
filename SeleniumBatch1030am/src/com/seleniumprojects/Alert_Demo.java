package com.seleniumprojects;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Demo {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("http://demo.automationtesting.in/Alerts.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	WebElement simpleAlert=driver.findElement(By.xpath("(//button[contains(text(),'click the button to display')])[1]"));
	simpleAlert.click();
	Alert simpleAlertBox=driver.switchTo().alert();
	
	Thread.sleep(3000);
	simpleAlertBox.accept();
	
	
	WebElement rootOfConfirmAlert=driver.findElement(By.xpath("//a[.='Alert with OK & Cancel ']"));
	rootOfConfirmAlert.click();

	//alert website
	// click simple alert button 
	
//alert is presentr
//	we can handled it
}
}
