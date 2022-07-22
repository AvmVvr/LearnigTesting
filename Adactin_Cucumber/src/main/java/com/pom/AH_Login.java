package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AH_Login {
	public static WebDriver driver;

//	POJO - Plain Old Java Object 
	@FindBy(xpath ="//input[@name='username']")
	private WebElement userName;

	@FindBy(name="password")
	private WebElement passWord;
	
	@FindBy(xpath="//input[@type='Submit']")
	private WebElement loginButton;
	

	
public AH_Login(WebDriver driver2) {
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
