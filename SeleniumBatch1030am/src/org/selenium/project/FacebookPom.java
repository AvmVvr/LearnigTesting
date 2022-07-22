package org.selenium.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FacebookPom {
	public static WebDriver driver;
	
	@FindBy(id = "email") private WebElement email;
	@FindBy(name = "pass") private WebElement pass;
	@FindBy(name="login") private WebElement login;
	
	


}
