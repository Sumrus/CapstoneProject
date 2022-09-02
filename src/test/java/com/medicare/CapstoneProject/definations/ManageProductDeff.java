package com.medicare.CapstoneProject.definations;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class ManageProductDeff {
	
	WebDriver driver = SetUp.driver;
	ManageProductPage objManage = new ManageProductPage();
	
	@When("User clicks the Manage Product Button")
	public void user_clicks_the_manage_product_button() throws Throwable {
		
		objManage.ManageProduct();
		Thread.sleep(2000);
	    
	}

	@When("User enters the Product Details {string},{string},{string},{string} and {string}")
	public void user_enters_the_product_details_and(String productName, String brand, String description, String unitPrice, String Qty) {
		
		objManage.ProductDtls(productName, brand, description, unitPrice, Qty);
	   
	}

	@When("User clicks on Upload File Button")
	public void user_clicks_on_upload_file_button() throws Throwable {
		
		objManage.Upload();
		Thread.sleep(1000);
	   
	}

	@When("User Selects the Category for the Product")
	public void user_selects_the_category_for_the_product() {
		
		objManage.Category();
		
	    
	}

	@When("User clicks Save Button")
	public void user_clicks_save_button() throws Throwable {
		
		objManage.Save();
		Thread.sleep(5000);
	   
	}
	
	@When("User clicks on the Show All Button")
	public void user_clicks_on_the_show_all_button() throws Throwable {
	    
		objManage.ShowBtn();
		Thread.sleep(3000);
		
	}

	@Then("User sees the {string} name")
	public void user_sees_the_name(String ExpName) {
	    
		String ActualName = objManage.AddedProduct();
		Assert.assertEquals(ExpName, ActualName);
	}

}
