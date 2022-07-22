package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccount {
	
	
	public static WebDriver driver;

	@FindBy(xpath = "//a[contains(@class,'_4jy6')]")
	private WebElement createNewAccount;

	@FindBy(xpath = "//input[@placeholder='First name']")
	private WebElement firstName;

	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement surname;

	@FindBy(xpath = "//input[@name='reg_email__']")
	private WebElement mobileNumber;

	@FindBy(xpath = "//input[@name='reg_passwd__']")
	private WebElement newPassword;

	@FindBy(xpath = "//select[@name='birthday_day']")
	private WebElement date;

	@FindBy(xpath = "//select[@name='birthday_month']")
	private WebElement month;

	@FindBy(xpath = "//select[@name='birthday_year']")
	private WebElement year;

	@FindBy(xpath = "//label[text()='Mal']")
	private WebElement radioBox;

	@FindBy(xpath = "(//button[text()='Sign Up'])[1]")
	private WebElement signUp;

	public CreateAccount(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getCreateNewAccount() {
		return createNewAccount;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getSurname() {
		return surname;
	}

	public WebElement getMobileNumber() {
		return mobileNumber;
	}

	public WebElement getNewPassword() {
		return newPassword;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getRadioBox() {
		return radioBox;
	}

	public WebElement getSignUp() {
		return signUp;
	}

}
