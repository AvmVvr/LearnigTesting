package com.adactin.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclass.BaseClass;
import com.facebook.helper.FileReaderManager;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature",
				glue = "com\\adactin\\stepdefinition",
				monochrome = true,
				dryRun = false,
				stepNotifications = true
				)

public class TestRunner {
	public static WebDriver driver;
	@BeforeClass
	public static void launch() throws IOException{
		String launch = FileReaderManager.getInstance().getCrInstance().launchBrowser();
		driver = BaseClass.browserLaunch(launch);
	}
	@AfterClass
	public static void browserClose() {
		driver.quit();
	}
}
