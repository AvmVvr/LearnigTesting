package org.selenium.project;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlretBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Greens\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		driver.manage().window().maximize();
		
		WebElement altext = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		altext.click();
		
		
		WebElement entertext = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		entertext.click();
		
		Alert text = driver.switchTo().alert();

		text.sendKeys("Vinoth");
		text.accept();
		
		
	}

}
