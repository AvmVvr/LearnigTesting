package com.waits;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class FluentWaitt {
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
	// Waiting 24 hours for an element to be present on the page, checking
	// for its presence once every 30 minutes.
	FluentWait<WebDriver> ignoring = new FluentWait<>(driver)
			.withTimeout(Duration.ofHours(24))
	  .pollingEvery(Duration.ofMinutes(30))
	  .ignoring(NoSuchElementException.class);  
	}
}