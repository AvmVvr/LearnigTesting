package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageTwo {

	
	public WebDriver driver;
	
	@FindBy(xpath = "(//a[text()='Forgotten password?'])[2]")
	private WebElement forgot;

	public PageTwo(WebDriver driver2) {

		
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getForgot() {
		return forgot;
	}
	
	
}
