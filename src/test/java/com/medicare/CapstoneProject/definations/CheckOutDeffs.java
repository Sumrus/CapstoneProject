package com.medicare.CapstoneProject.definations;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class CheckOutDeffs {
	
	WebDriver driver = SetUp.driver;
	CheckOutPage objCheckout = new CheckOutPage();
	
	@When("User click on the cart Button")
	public void user_click_on_the_cart_button() throws Throwable {
		
		objCheckout.CartBtn();
		Thread.sleep(5000);
	   
	}

	@When("User click on the Checkout Button")
	public void user_click_on_the_checkout_button() throws Throwable {
		
		objCheckout.CheckOutBtn();
		Thread.sleep(5000);
	}

	@When("User click on the Select Button")
	public void user_click_on_the_select_button() throws Throwable {
	   
		objCheckout.SelectBtn();
		Thread.sleep(5000);
	}

	@When("User enter the card detail {string} , {string} , {string} and {string}")
	public void user_enter_the_card_detail_and(String CardNum, String ExpMM, String ExpYY, String CvCode) throws Throwable {
		
		objCheckout.CardDtls(CardNum, ExpMM, ExpYY, CvCode);
		Thread.sleep(5000);
	  
	}

	@When("User clicks on the Pay Button")
	public void user_clicks_on_the_pay_button() {
	  
		objCheckout.PayBtn();
	}

	@Then("User is able to see the Confirmaton Msg {string}")
	public void user_is_able_to_see_the_confirmaton_msg(String ExpMsg) {
		
		String ActualMsg = objCheckout.OrderConfirmation();
		Assert.assertEquals(ExpMsg, ActualMsg);
	    
	}

}
