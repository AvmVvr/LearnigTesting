package com.stepdefinition;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.baseclass.BaseClass;
import com.helper.File_Reader_Manager;
import com.pom.PageOne;
import com.pom.PageTwo;
import com.pom.Page_Object_Manager;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
	
	
	
	Page_Object_Manager pom = new Page_Object_Manager(driver);
	

	
	@Given("User Launch the Url")
	public void user_launch_the_url() throws IOException {
	  
		String urlName = File_Reader_Manager.getInstance().getInstanceCr().urlName();
		getUrl(urlName);
	}		

	@When("User click the email id field and enter a value")
	public void user_click_the_email_id_field_and_enter_a_value() {
	

		sendkeys(pom.getInstancePageone().getUserName(), "Venkat");
	}
	@When("User Click the Password field and enter a value")
	public void user_click_the_password_field_and_enter_a_value() {
	
		sendkeys(pom.getInstancePageone().getPassWord(), "123");
		
	}
	@Then("User click the login button")
	public void user_click_the_login_button() {
	 
		clickOnElement(pom.getInstancePageone().getLogIn());
	
	}
	
	
	@Given("User Click the Forgot password button")
	public void user_click_the_forgot_password_button() {

		clickOnElement(pom.getInstancePageTwo().getForgot());
	}
	
	@When("User click the email id field and enter a value of {string}")
	public void user_click_the_email_id_field_and_enter_a_value_of(String string) {
	  
		sendkeys(pom.getInstancePageone().getUserName(),string );
	}
	@When("User Click the Password field and enter a value of {string}")
	public void user_click_the_password_field_and_enter_a_value_of(String string) {
		sendkeys(pom.getInstancePageone().getPassWord(), string);

	}
	
	@When("user Click the Create Account button")
	public void user_click_the_create_account_button() throws InterruptedException {
	    
		clickOnElement(pom.getInstanceCreatAccount().getCreateNewAccount());
		Thread.sleep(3000);
	}
	@When("user sign up with following details")
	public void user_sign_up_with_following_details(DataTable dataTable) throws InterruptedException {
		
		List<List<String>> obj = dataTable.asLists();
		
		
		sendkeys(pom.getInstanceCreatAccount().getFirstName(), obj.get(0).get(0));
		sendkeys(pom.getInstanceCreatAccount().getSurname(), obj.get(0).get(1));
		sendkeys(pom.getInstanceCreatAccount().getMobileNumber(), obj.get(0).get(2));
		sendkeys(pom.getInstanceCreatAccount().getNewPassword(), obj.get(0).get(3));
		sendkeys(pom.getInstanceCreatAccount().getDate(), obj.get(0).get(4));
		Thread.sleep(3000);

		sendkeys(pom.getInstanceCreatAccount().getMonth(), obj.get(0).get(5));
		Thread.sleep(3000);

		sendkeys(pom.getInstanceCreatAccount().getYear(), obj.get(0).get(6));
		
	}
	@When("user select a gender")
	public void user_select_a_gender() throws InterruptedException {
		Thread.sleep(3000);

		clickOnElement(pom.getInstanceCreatAccount().getRadioBox());
		
	}
	@Then("user click the signUp button")
	public void user_click_the_sign_up_button() {
	    
		clickOnElement(pom.getInstanceCreatAccount().getSignUp());
	}

	

}
