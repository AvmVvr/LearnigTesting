package com.seleniumprojects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDrop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://play.letcode.in/aui");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement sourceElement=driver.findElement(By.xpath("//p[.='Drag me to my target']"));
		WebElement targetElement=driver.findElement(By.id("droppable"));
		Actions act = new Actions(driver);
		act.clickAndHold(sourceElement)
		.moveToElement(targetElement)
		.release(targetElement).perform();
		
		
		driver.navigate().to("https://jqueryui.com/draggable/");
		driver.switchTo().frame(0);
		WebElement sourceForDrag=driver.findElement(By.id("draggable"));
		act.dragAndDropBy(sourceForDrag, 40, 50).perform();
//		
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.visibilityOf(targetElement));
//		wait.until(ExpectedConditions.elementToBeClickable(null))
		
		
		
		//source --->click panni hold pannanum
		//target --->move to target
		//target --->release to target
	}
}
