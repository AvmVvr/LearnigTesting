package org.selenium.project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webTab {
	public static void main(String[] args) {

		// browser Launch
		System.setProperty("webdriver.gecko.driver", "D:\\Greens\\Selenium\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		// driver.manage().window().maximize();

		// Launch URL
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		// all data
		// single row
		// per data
		// single column
		// size row / Column

		System.out.println("************All Data**************************");

		List<WebElement> alldata = driver.findElements(By.xpath("//table[@id='customers']"));
		for (WebElement all : alldata) {
			System.out.println(all.getText());
		}

		System.out.println("************single row**************************");

		List<WebElement> singleRow = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[7]"));
		for (WebElement row : singleRow) {
			System.out.println(row.getText());
		}
		
		
		System.out.println("************Single Data**************************");

		WebElement data = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[7]/td[3]"));
		System.out.println(data.getText());

		System.out.println("************Row Size**************************");
		List<WebElement> RowSize = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		int Rsize = RowSize.size();
		System.out.println("Row Size is " + Rsize);

		System.out.println("************column Size**************************");
		List<WebElement> ColSize = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
		int Csize = ColSize.size();
		System.out.println("Column Size is " + Csize);

	}

}
