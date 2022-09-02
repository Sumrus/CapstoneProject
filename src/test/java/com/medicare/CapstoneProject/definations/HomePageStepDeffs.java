package com.medicare.CapstoneProject.definations;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStepDeffs  {
	
	WebDriver driver = SetUp.driver;
	HomePage homepage = new HomePage();
	
	@Given("User is on HomePage")
	public void user_is_on_home_page() throws Throwable {
	    
		driver.get("http://localhost:8082/medicare/home");
		Thread.sleep(5000);
	}

	@When("User click on About Button")
	public void user_click_on_about_button() throws Throwable {
		homepage.About();
		Thread.sleep(2000);
	    
	}

	@Then("User lands on the About Us page")
	public void user_lands_on_the_about_us_page() throws Throwable {
		
	    String aboutUs = homepage.AboutUS(); 
	    Assert.assertTrue(aboutUs.contains("about us page"));
	    Thread.sleep(1000);
	        
	}

	@When("User click on Contact Button")
	public void user_click_on_contact_button() throws Throwable {
		homepage.Contact();
		Thread.sleep(2000);
	  
	}

	@Then("User lands on Contact Us page")
	public void user_lands_on_contact_us_page() throws Throwable {
		
		String contactUs = homepage.ContactUs();
		Assert.assertTrue(contactUs.contains("contact us page"));
		Thread.sleep(1000);
	    
	}

	@When("User click on View Product Button")
	public void user_click_on_view_product_button() throws Throwable {
		
		homepage.ViewProduct();
		Thread.sleep(2000);
	    
	}

	@Then("User can view all the Products")
	public void user_can_view_all_the_products() throws Throwable {
	   
		homepage.AllProduct();
		Thread.sleep(5000);
	}

	@When("enters the Product Name in Search bar {string}")
	public void enters_the_product_name_in_search_bar(String SearchVal) throws Throwable {
	  
		homepage.Search(SearchVal);
		Thread.sleep(5000);
	}

	@Then("User is able to see that Product")
	public void user_is_able_to_see_that_product()throws Throwable {
		
		String searchResult = homepage.SearchResult();
		Assert.assertTrue(searchResult.contains("Amoxicillin"));
		Thread.sleep(5000);	
	    
	}

	@When("User clicks on Antipyretics Button")
	public void user_clicks_on_antipyretics_button() throws Throwable {
		
		homepage.Categories();
		Thread.sleep(5000);
	  
	}

	@Then("User is able to see the Products of that Categories")
	public void user_is_able_to_see_the_products_of_that_categories() throws Throwable {
		homepage.Category();
		Thread.sleep(5000);
	}
	

}
