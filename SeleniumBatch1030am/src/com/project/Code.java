package com.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Code extends BaseClass  {
	static WebDriver driver1;
	static FaceBookLoginPOM fbl;
	public static void browserWeblaunch() {
		browserLaunch("firefox");
		 driver1 = new FirefoxDriver();
		websiteLaunch("https://www.facebook.com/");
	}
	public static void login() {
		fbl = new FaceBookLoginPOM(driver);
		sendkeys(fbl.getUserName(), "vinosizzle@gmail.com");
		sendkeys(fbl.getPassWord(), "123456789");
		clickOnElement(fbl.getLoginButton());
	}
	
	public static void main(String[] args) {
		browserWeblaunch();
		login();
		
		
	}

}
