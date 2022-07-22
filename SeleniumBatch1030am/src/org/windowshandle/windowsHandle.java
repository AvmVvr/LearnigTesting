package org.windowshandle;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class windowsHandle {

	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.gecko.driver","D:\\Job\\Selenium\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		WebElement mobile = driver.findElement(By.xpath("(//a[@class='nav-a  '])[2]"));

		Actions act = new Actions(driver);
		act.contextClick(mobile).perform();

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(2000);

		WebElement todaydeals = driver.findElement(By.xpath("(//a[@class='nav-a  '])[4]"));
		act.contextClick(todaydeals).perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		Set<String> windowHandles = driver.getWindowHandles();
		ArrayList<String> ali = new ArrayList<>(windowHandles);

		String home = driver.switchTo().window(ali.get(0)).getTitle();
		System.out.println(home);

		String title = driver.switchTo().window(ali.get(2)).getTitle();
		System.out.println(title);

		String title1 = driver.switchTo().window(ali.get(1)).getTitle();
		System.out.println(title1);

		driver.switchTo().window(ali.get(1));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Oneplus");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.close();

		driver.switchTo().window(ali.get(2));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Redmi");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.quit();
	}
}
