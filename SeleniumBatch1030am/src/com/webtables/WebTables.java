package com.webtables;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class WebTables {
	public static void main(String[] args) {
		// Browser Launch
		System.setProperty("webdriver.gecko.driver", "D:\\Job\\SeleniumTrain\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		// url Launch
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		// All Data --> table
		System.out.println("================All Data ======================");
		List<WebElement> allData = driver.findElements(By.xpath("//table[@id='customers']"));
		
		
		for (WebElement data : allData) {
			
			boolean result = data.getText().contains("Mexico");
			System.out.println(result);

		}
//		// single row ---> row value
//		System.out.println("================single row======================");
//		List<WebElement> singleRow = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[6]"));
//		for (WebElement sixRow : singleRow) {
//			System.out.println(sixRow.getText());
//		}
//		// single column---> column value
//		System.out.println("================single Column======================");
//		List<WebElement> singleColumn = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[2]"));
//		for (WebElement secondcolumn : singleColumn) {
//			System.out.println(secondcolumn.getText());
//		}
//		// specific data---> row,column
//		System.out.println("================specific data======================");
//		WebElement data = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[3]/td[3]"));
//		System.out.println(data.getText());
//		
//		// size of row/column  ---> Task
//		System.out.println("================size of row/column======================");
//		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
//		int rsize = rows.size();
//		System.out.println("Row Size is: "+rsize);
//		
//		List<WebElement> column = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[2]/td"));
//		int colsize = column.size();
//		System.out.println("Column size is "+colsize);
	}
}