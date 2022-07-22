package org.selenium.project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class robo {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\Job\\Selenium\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("vinosizzel@gmail.com");

		Actions act = new Actions(driver);
		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);

		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);

		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);

		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);

		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);

		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

//	r.keyPress(KeyEvent.VK_CONTROL);
//	r.keyPress(KeyEvent.VK_A);	
//	r.keyRelease(KeyEvent.VK_CONTROL); 
//	r.keyRelease(KeyEvent.VK_A); 
//	
//	act.contextClick(username).perform();
//	Thread.sleep(2000);
//	
//	for (int i = 1; i <=5; i++) {
//		
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN); 
//		
//	}
//	
//	r.keyPress(KeyEvent.VK_ENTER);
//	r.keyRelease(KeyEvent.VK_ENTER);
//	
//	r.keyPress(KeyEvent.VK_TAB);
//	r.keyRelease(KeyEvent.VK_TAB);
//	
//	r.keyPress(KeyEvent.VK_CONTROL);
//	r.keyPress(KeyEvent.VK_V);
//	
//	r.keyRelease(KeyEvent.VK_V);
//	r.keyRelease(KeyEvent.VK_CONTROL);
//	
//	WebElement submit = driver.findElement(By.name("login"));
//	submit.click();

	}

}
