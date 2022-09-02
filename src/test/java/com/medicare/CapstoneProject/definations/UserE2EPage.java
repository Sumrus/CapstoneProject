package com.medicare.CapstoneProject.definations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserE2EPage {
	
	WebDriver driver = SetUp.driver;
	
	@FindBy(xpath = "//*[@href='/medicare/show/all/products']")
	WebElement ContinueShoping;
	
	@FindBy(xpath = "//*[@class='breadcrumb']/li[2]")
	WebElement AllProducts;
	
	 public UserE2EPage () {
			
			PageFactory.initElements(driver, this);
		}
	 
	 public void ContinueShop() {
		 
		 ContinueShoping.click();
	 }
	 
	 public String Allproducts() {
		 
		 return AllProducts.getText();
	 }

}
