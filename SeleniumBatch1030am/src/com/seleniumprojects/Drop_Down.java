package com.seleniumprojects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://letcode.in/dropdowns");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		//dropdrown
		
			//find the dd
		WebElement dropDownOne=driver.findElement(By.id("fruits"));
		Select s = new Select(dropDownOne);
		boolean result=s.isMultiple();
		
		if(result==false) {
		s.selectByIndex(4);	
		}
		WebElement selectedValue=s.getFirstSelectedOption();
		System.out.println(selectedValue.getText());
		//select the value in dd when single dd//ismultiple
		WebElement dropDownTwo=driver.findElement(By.id("superheros"));
		Select s1 = new Select(dropDownTwo);
		boolean result1=s1.isMultiple();
		if(result1==true) {
			s1.selectByIndex(0);
			s1.selectByValue("aq");
			s1.selectByVisibleText("The Avengers");
		}
			List<WebElement> selectedOptions= s1.getAllSelectedOptions();  //20 elements
//			selectedOptions.get(0).getText();
//			selectedOptions.get(1).getText();
//			selectedOptions.get(2).getText();
			for(WebElement ele:selectedOptions) {
				System.out.println(ele.getText());
			}
			
			s1.deselectByIndex(0);
	}
	
}
