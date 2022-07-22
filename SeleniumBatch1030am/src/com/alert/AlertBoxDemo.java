package com.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertBoxDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\Job\\SeleniumTrain\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("http://demo.automationtesting.in/Alerts.html");

		Thread.sleep(4000);
		WebElement simpleAlert = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		simpleAlert.click();

		driver.switchTo().alert().accept();

		WebElement alert = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		alert.click();

		WebElement okcancel = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		okcancel.click();
		driver.switchTo().alert().dismiss();

		WebElement textAlert = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		textAlert.click();

		WebElement text = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		text.click();

		Alert txt = driver.switchTo().alert();
		txt.sendKeys("Vinothraj");
		txt.accept();
	}
}
