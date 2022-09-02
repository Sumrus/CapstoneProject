package com.medicare.CapstoneProject.definations;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminE2EDeff {
	
	WebDriver driver = SetUp.driver;
	AdminE2EPage objAdminE2E = new AdminE2EPage();
	
	
	@When("User clicks on logout Button")
	public void user_clicks_on_logout_button() throws Throwable {
		
		objAdminE2E.User();
		objAdminE2E.LogOut();
		Thread.sleep(2000);
	   
	}

	@Then("User is landed back to Login Page")
	public void user_is_landed_back_to_login_page() {
	   
		Assert.assertTrue(objAdminE2E.Confirmation(), true);
	}

}
