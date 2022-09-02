package com.medicare.CapstoneProject.definations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

 public class LoginPage {
	
	WebDriver driver = SetUp.driver;
	
	@FindBy(id = "login")
	WebElement LogIn;
	
	@FindBy(id = "username")
	WebElement Email;
	
	@FindBy(id = "password")
	WebElement Password;
	
	@FindBy(xpath = "//*[@type='submit']")
	WebElement Submit;
	
	@FindBy(xpath = "//*[@class='panel-heading']")
	WebElement ErrorMsg;
	
	@FindBy(id = "dropdownMenu1")
	WebElement User;
	
 public LoginPage () {
		
		PageFactory.initElements(driver, this);
	}
 
 
 public void LogInBtn () {
	 
	 LogIn.click();
	 
 }
 
 public void Credentials (String email, String password) {
	 
	 Email.sendKeys(email);
	 Password.sendKeys(password);
	 
 }
 
 public void Submit() {
	 
	 Submit.click();
	 
 }
 
 public String ErrorMsg() {
	 
	 return ErrorMsg.getText();
	 
	 
 }
 
 public String User() {
	 
	 return User.getText();
 }

}
