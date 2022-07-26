package com.TestNG;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class Annotation {

	public WebDriver driver;
	public String url = "https://www.amazon.in/";

	@BeforeSuite
	private void setUp() {
		System.setProperty("webdriver.gecko.driver", ".\\Driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		System.out.println("Browser launched sucessfully");
		driver.get(url);
		System.out.println("Webpage Launched sucessfully");
	}

	@BeforeTest
	private void signin() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		System.out.println("redirect to Signin page");
	}

	@BeforeClass
	private void givelogin() {
		// Login details were removed please give your own login details
		driver.findElement(By.id("ap_email")).sendKeys("vinothrajvrsfile@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("4227@Vrscet");
		driver.findElement(By.id("signInSubmit")).click();
		System.out.println("login successfull");
	}

	@BeforeMethod
	private void homepage() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	@Test 
//	(retryAnalyzer = IretryAnalyzerr.class)
	private void mobiles() throws InterruptedException {
//		Thread.sleep(3000);
//		driver.findElement(By.id("twotabsearchtextbox")).clear();
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Oppo");
//		driver.findElement(By.id("nav-search-submit-butto")).click();
		System.out.println("Oppo search result is displayed");
// 		HardAssert
		Assert.assertEquals("Amazon.in : Oppoo","Amazon.in : Oppo");
// 		SoftAssert - Predefined class
//		SoftAssert sa = new SoftAssert();
//		sa.assertEquals(driver.getTitle(),"Amazon.in : Oppoo");
//		sa.assertAll();
	}

	@Test
	private void laptop() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.id("twotabsearchtextbox")).clear();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("imac");
		driver.findElement(By.id("nav-search-submit-button")).click();
		System.out.println("imac search result is displayed");
	}
//	@Ignore
//	@Test
//	private void electronics() throws InterruptedException {
//		Thread.sleep(3000);
//		driver.findElement(By.id("twotabsearchtextbox")).clear();
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Air Purifier");
//		driver.findElement(By.id("nav-search-submit-button")).click();
//		System.out.println("AIR-Purifier search result is displayed");
//	}
//
//	@Test
//	private void household() throws InterruptedException {
//		Thread.sleep(3000);
//		driver.findElement(By.id("twotabsearchtextbox")).clear();
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("sofa");
//		driver.findElement(By.id("nav-search-submit-button")).click();
//		System.out.println("Sofa search result is displayed");
//	}

	@AfterMethod

	private void screenShot() throws IOException {
		TakesScreenshot scr = (TakesScreenshot) driver;
		File source = scr.getScreenshotAs(OutputType.FILE);
		File target = new File("D:\\Greens\\testng\\Screenshot\\1.png");
		FileUtils.copyFile(source, target);
	}

	@AfterClass
	private void refressh() {
		driver.navigate().refresh();
		String postTitle = driver.getTitle();
		System.out.println("PostTitle: " + postTitle);
		System.out.println("Refresh the current webpage and print the title of the page");
	}

	@AfterTest
	private void delete() {
		driver.manage().deleteAllCookies();
		System.out.println("Deleted all the cookies");
	}

	@AfterSuite
	private void browserclose() {
		driver.quit();
		System.out.println("tested Successfully");
	}
}
