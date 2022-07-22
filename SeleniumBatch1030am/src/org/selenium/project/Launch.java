package org.selenium.project;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.gecko.driver", "D:\\Greens\\Selenium\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		
		
		WebElement alert = driver.findElement(By.xpath("(//a[@class='analystic'])[1]"));
		alert.click();
		
		WebElement simple = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		simple.click();
		
		Thread.sleep(2000);
		Alert alert2 = driver.switchTo().alert();
		
		alert2.accept();
		
		
		WebElement confirm = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		confirm.click();
		
		WebElement confirmAlert = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		confirmAlert.click();
		
		Thread.sleep(3000);
		
		Alert alert3 = driver.switchTo().alert();
		alert3.dismiss();
		
	}
}
