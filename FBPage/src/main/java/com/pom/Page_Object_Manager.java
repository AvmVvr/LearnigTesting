package com.pom;

import org.openqa.selenium.WebDriver;

public class Page_Object_Manager {
	
	public static WebDriver driver;
	
	private PageOne p;
	
	private PageTwo t;
	
	private CreateAccount ca;
	
	
	
	public Page_Object_Manager(WebDriver driver2) {

		this.driver = driver2;
		
	
	}


	public PageOne getInstancePageone() {

		p = new PageOne(driver);
		return p;
		
	}
	
	
	public PageTwo getInstancePageTwo() {

		t = new PageTwo(driver);
		return t;
		
	}
	
	public CreateAccount getInstanceCreatAccount() {

		ca = new CreateAccount(driver);
		return ca;
		
	}

}
