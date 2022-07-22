package org.selenium.project;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class demoweb {
public static void main(String[] args) throws InterruptedException {
	/* Launching Web-Browser */
	System.setProperty("webdriver.gecko.driver", "D:\\Greens\\Selenium\\Driver\\geckodriver.exe");
	
	WebDriver driver = new FirefoxDriver();
	
	
	
	/* opening the http://practice.automationtesting.in/ */
	driver.get("https://itera-qa.azurewebsites.net/home/automation");
	
	WebElement Name = driver.findElement(By.id("name"));
	Name.sendKeys("Vinothraj V");
	
	WebElement phone = driver.findElement(By.id("phone"));
	phone.sendKeys("1234567890");
	
	WebElement email = driver.findElement(By.id("email"));
	email.sendKeys("vinoth1234@gmail.com");
	
	WebElement pwd = driver.findElement(By.id("password"));
	pwd.sendKeys("Avm123456");
 
	WebElement address = driver.findElement(By.id("address"));
	address.sendKeys("1st TechPark, 2nd Cross street, Chennai");
	
	WebElement gender = driver.findElement(By.id("male"));
	gender.click();
	
	/* Best day to start the new task*/
	driver.findElement(By.id("monday")).click();
	driver.findElement(By.id("wednesday")).click();
	
	/* Drop down*/
	Select nation = new Select(driver.findElement(By.xpath("//select[@class='custom-select']")));
	nation.selectByIndex(1);
	
	
	/*Radio Button*/
	
	WebElement experience = driver.findElement(By.xpath("(//label[@class='custom-control-label'])[3]"));
	experience.click();
	
	/* Multi-Select in checkbox */
	driver.findElement(By.xpath("(//label[@class='custom-control-label'])[6]")).click();
	driver.findElement(By.xpath("(//label[@class='custom-control-label'])[7]")).click();
	driver.findElement(By.xpath("(//label[@class='custom-control-label'])[8]")).click();
}
	
	
	
}
