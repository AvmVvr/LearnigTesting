package org.selenium.waits;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpectedConditionExample {
	
public static void main(String[] args) {

// initializing driver variable using FirefoxDriver
	System.setProperty("webdriver.chrome.driver", "D:\\Greens\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
// launching gmail.com on the browser
driver.get("https://gmail.com");


driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

// saving the GUI element reference into a "element" variable of WebElement type
WebElement username = driver.findElement(By.id("identifierId"));
username.sendKeys("");

WebElement nxtbutton = driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']"));
nxtbutton.click();

// entering password
WebElement password = driver.findElement(By.name("password"));
password.sendKeys("");

// clicking signin button
WebElement nxtsign = driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']"));
nxtsign.click();



// explicit wait - to wait for the compose button to be click-able
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='T-I T-I-KE L3']")));

// click on the compose button as soon as the "compose" button is visible
driver.findElement(By.xpath("//div[@class='T-I T-I-KE L3']")).click();

}

}