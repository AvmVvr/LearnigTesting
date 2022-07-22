package org.selenium.project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webtables {
	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "D:\\Greens\\Selenium\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();

		System.out.println("*****************All Data***********************");
		List<WebElement> alldata = driver.findElements(By.xpath("//table[@id='customers']"));
		for (WebElement all : alldata) {
			System.out.println(all.getText());
		}

		System.out.println("******************Per row*******************************");
		List<WebElement> Perrow = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[4]"));
		for (WebElement singlerow : Perrow) {
			System.out.println(singlerow.getText());
		}

		System.out.println("******************Per column*******************************");
		List<WebElement> Percol = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[1]"));
		for (WebElement col : Percol) {
			System.out.println(col.getText());
		}

		System.out.println("******************Per Data*******************************");
		WebElement perdata = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[3]/td[2]"));
		System.out.println(perdata.getText());

		System.out.println("++++++++++++++++++Column Size & Row Size============================");
		List<WebElement> colsize = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
		List<WebElement> rowsize = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		int a = colsize.size();
		int b = rowsize.size();

		System.out.println("Column size and Row size of the table is " + a + " & " + b);

	}
}