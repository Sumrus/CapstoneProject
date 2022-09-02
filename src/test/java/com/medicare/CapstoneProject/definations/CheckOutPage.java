package com.medicare.CapstoneProject.definations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {
	
	WebDriver driver = SetUp.driver;
	
	@FindBy(xpath = "//*[@href='/medicare/cart/add/1/product']")
	WebElement AddToCart;
	
	@FindBy(xpath = "//*[@href='/medicare/cart/validate']")
	WebElement Checkout;
	
	@FindBy(xpath = "//a[contains(text(),'Select')]")
	WebElement Select;
	
	@FindBy(id = "cardNumber")
	WebElement CardNumber;
	
	@FindBy(id = "expityMonth")
	WebElement ExpMonth;
	
	@FindBy(id = "expityYear")
	WebElement ExpYear;
	
	@FindBy(id = "cvCode")
	WebElement CVCode;
	
	@FindBy(xpath = "//*[text()='Pay']")
	WebElement Pay;
	
	@FindBy(xpath = "//*[contains(text(),'Confirmed')]")
	WebElement ConfirmMsg;
	
	public CheckOutPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void CartBtn() {
		
		AddToCart.click();
	}
	
	public void CheckOutBtn() {
		
		Checkout.click();
	}
	
	public void SelectBtn() {
		
		Select.click();
	}
	
	public void CardDtls (String CardNum, String ExpMM, String ExpYY, String CvCode) {
		
		CardNumber.sendKeys(CardNum);
		ExpMonth.sendKeys(ExpMM);
		ExpYear.sendKeys(ExpYY);
		CVCode.sendKeys(CvCode);	
		
	}
	
	public void PayBtn() {
		
		Pay.click();
	}
	
	public String OrderConfirmation() {
		
		return ConfirmMsg.getText();
	}
	

}
