package com.medicare.CapstoneProject.definations;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class UserE2EDeff {
	
	WebDriver driver = SetUp.driver;
	UserE2EPage objUserE2E = new UserE2EPage();
	
	
	@When("User click on the Continue Shopping Button")
	public void user_click_on_the_continue_shopping_button() throws Throwable {
		
		objUserE2E.ContinueShop();
		Thread.sleep(1000);
	   
	}

	@Then("User sees the All Product page")
	public void user_sees_the_all_product_page() {
		
		String ExpPage = "All Products";
		String ActualPage = objUserE2E.Allproducts();
		Assert.assertEquals(ExpPage, ActualPage);
		
	    
	}

}
