package com.medicare.CapstoneProject.definations;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class SignUpDeffs {
	
	WebDriver driver = SetUp.driver;
	SignUpPage objSignUp = new SignUpPage();
	
	@When("User clicks on the SignUp Button and land on the SignUp Page")
	public void user_clicks_on_the_sign_up_button_and_land_on_the_sign_up_page() throws Throwable {
		
		objSignUp.SignUpBtn();
		Thread.sleep(5000);
	    
	}

	@When("User enters the Personal Details {string},{string},{string},{string},{string} and {string}")
	public void user_enters_the_personal_details_and(String firstNameVal, String lastNameVal, String emailVal, String contactNum, String passwordVal, String confirmPwdVal) {
	   
		objSignUp.Name(firstNameVal, lastNameVal);
		objSignUp.PersonalDtls(emailVal, contactNum, passwordVal, confirmPwdVal);
		
		
	}

	@When("User selects the Role as User")
	public void user_selects_the_role_as_user() throws Throwable {
		
		objSignUp.Role();
		Thread.sleep(2000);
	   
	}

	@When("User clicks on the Next Button and land on the Sign Up-Address page")
	public void user_clicks_on_the_next_button_and_land_on_the_sign_up_address_page() throws Throwable {
		
		objSignUp.NextBilling();
		Thread.sleep(5000);
	    
	}

	@When("User enters the Address Details {string},{string},{string},{string},{string} and {string}")
	public void user_enters_the_address_details_and(String lineOneVal, String lineTwoVal, String cityVal, String postalVal, String stateVal, String countryVal) throws InterruptedException {
		
		objSignUp.AddressDtls(lineOneVal, lineTwoVal, cityVal, postalVal, stateVal, countryVal);
		Thread.sleep(5000);
	    
	}

	@When("User clicks on the Next Button and land on the confirmation page")
	public void user_clicks_on_the_next_button_and_land_on_the_confirmation_page() throws Throwable {
		
		objSignUp.NextConfirm();
		Thread.sleep(5000);
	    
	}

	@When("User clicks on the Confirm Button")
	public void user_clicks_on_the_confirm_button() throws Throwable {
		
		objSignUp.Confirm();
		Thread.sleep(5000);
	   
	}

	@Then("User is able to SignUp successfully and {string} message is dispalyed")
	public void user_is_able_to_sign_up_successfully_and_message_is_dispalyed(String ExpMsg) throws Throwable {
		
		String ActualMsg = objSignUp.WelcomeMsg();
		Assert.assertEquals(ExpMsg, ActualMsg);
		Thread.sleep(5000);
	}

}
