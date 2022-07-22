package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "C:\\Users\\venka\\eclipse-workspace\\FBPage\\src\\test\\java\\com\\feature\\facebook.feature", 
                  glue = "com.stepdefinition")
public class TestNgRunner extends AbstractTestNGCucumberTests{

	
	
}
