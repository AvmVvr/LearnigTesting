package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPOM {
	public static WebDriver driver;

//	POJO - Plain Old Java Object 
	@FindBy(xpath ="//input[@name='email']")
	private WebElement userName;

	@FindBy(name="pass")
	private WebElement passWord;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement loginButton;
	

	
public FacebookLoginPOM(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	

}
