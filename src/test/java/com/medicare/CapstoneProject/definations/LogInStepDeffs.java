package com.medicare.CapstoneProject.definations;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LogInStepDeffs {
	
	WebDriver driver = SetUp.driver;
	LoginPage objLogin = new LoginPage();
	
	@When("User click on LogIn Button")
	public void user_click_on_log_in_button() {
		
		objLogin.LogInBtn();
	    
	}

	@When("User enters the Valid Email and Password {string} and {string}")
	public void user_enters_the_valid_email_and_password_and(String email, String password) throws Throwable {
		
		objLogin.Credentials(email, password);
		Thread.sleep(5000);
		
	    
	}

	@When("User clicks the LogIn Button")
	public void user_clicks_the_log_in_button() throws Throwable {
		
		objLogin.Submit();
		Thread.sleep(5000);
	    
	}

	@Then("User is able LogIn sccessfully")
	public void user_is_able_log_in_sccessfully() throws Throwable {
		
		String UserName = objLogin.User();
		
		System.out.println(" "+UserName+" is able to login successfully");
		
		Thread.sleep(5000);
	   
	}

	@When("User Enters Invalid Email and Password {string} and {string}")
	public void user_enters_invalid_email_and_password_and(String email, String password) throws Throwable {
		
		objLogin.Credentials(email, password);
		Thread.sleep(5000);
	    
	}

	@Then("User get the Error message {string}")
	public void user_get_the_error_message(String ExpMsg) throws Throwable {
		
		String ActualMsg = objLogin.ErrorMsg();
		Assert.assertEquals(ExpMsg, ActualMsg);
		Thread.sleep(5000);
	   
	}

	@When("User enters Admin Email and Password {string} and {string}")
	public void user_enters_admin_email_and_password_and(String email, String password) throws Throwable {
		
		objLogin.Credentials(email, password);
		Thread.sleep(5000);
	  
	}

	@Then("User is able to see the Admin Page")
	public void user_is_able_to_see_the_admin_page() throws Throwable {
		
		String AdminName = objLogin.User();
		
		System.out.println(" "+AdminName+" is able to login successfully");
		Thread.sleep(5000);
	}

}
