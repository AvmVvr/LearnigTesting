package com.runner;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclass.BaseClass;
import com.helper.File_Reader_Manager;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\venka\\eclipse-workspace\\FBPage\\src\\test\\java\\com\\feature\\facebook.feature" , 
                     glue = "com.stepdefinition" , 
        
                     monochrome = true ,
                     plugin = {"html:target/cucumber.html" , "json:target/cucumber.json" , 
                    		  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
                     )
public class Runner {

	
	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() throws IOException {
		
		String browserName = File_Reader_Manager.getInstance().getInstanceCr().browserName();
		driver = BaseClass.browser(browserName);
	}
	
	
}
