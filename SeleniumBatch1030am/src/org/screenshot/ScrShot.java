package org.screenshot;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrShot {
	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.gecko.driver", "D:\\Job\\Selenium\\Driver\\geckodriver.exe");
		WebDriver Driver = new FirefoxDriver();
		Driver.get("https://www.google.com/");

		Thread.sleep(200);
		TakesScreenshot ts = (TakesScreenshot) Driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("D:\\Job\\Selenium\\OutputScreen\\error12134656.png");
		FileUtils.copyFile(source, target);
	}
}
