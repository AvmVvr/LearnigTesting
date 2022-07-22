package com.facebook.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pom.AH_Login;

public class PageObjectManager {
	public static WebDriver driver;
	private AH_Login ahl;

	public PageObjectManager(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public AH_Login getFlp() {
		ahl = new AH_Login(driver);
		return ahl;
	}

}
