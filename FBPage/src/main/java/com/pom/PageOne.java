package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageOne {
	
	
	public static WebDriver driver; // Null driver
	
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement userName;
	
	
	@FindBy(xpath="//input[@name='pass']")
	private WebElement passWord;
	
	@FindBy(xpath="//button[@name='login']")
	private WebElement logIn;

	public PageOne(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public WebElement getLogIn() {
		return logIn;
	}
	
	
	
	

}
