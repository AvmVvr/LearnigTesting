package org.webtables;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTable {
	public static void main(String[] args) {
		// browser Launch
		System.setProperty("webdriver.gecko.driver", "D:\\Job\\Selenium\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		// driver.manage().window().maximize();

		// Launch URL
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		// all data
		System.out.println("*************All Data*********************");
		List<WebElement> alldata = driver.findElements(By.id("customers"));
		for (WebElement print : alldata) {
			System.out.println(print.getText());
		}
		// single row
		System.out.println("*************Single Row*********************");
		List<WebElement> singlerow = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[2]"));
		for (WebElement onerow : singlerow) {
			System.out.println(onerow.getText());
		}

		// single column
		System.out.println("*************Single column*********************");
		List<WebElement> singlecolumn = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[3]"));
		for (WebElement column2 : singlecolumn) {
			System.out.println(column2.getText());

		}
		// single Data
		System.out.println("*************Single Data*********************");
		WebElement data = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[2]/td[3]"));
		System.out.println(data.getText());

		// size row / Column
		System.out.println("*************size row / Column*********************");
		List<WebElement> row = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		int rowSize = row.size();
		System.out.println("rowSize " + rowSize);

		List<WebElement> column = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
		int columnSize = column.size();
		System.out.println("columnSize " + columnSize);
	}
}
