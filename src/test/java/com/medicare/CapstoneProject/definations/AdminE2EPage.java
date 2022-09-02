package com.medicare.CapstoneProject.definations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminE2EPage {
	
	WebDriver driver = SetUp.driver;
	
	@FindBy(id = "dropdownMenu1")
	WebElement User;
	
	@FindBy(xpath = "//*[@id=\"logout\"]/a")
	WebElement LogOut;
	
	@FindBy(xpath = "//*[@class='panel-heading']")
	WebElement LogoutConfirmation;
	
 public AdminE2EPage () {
			
			PageFactory.initElements(driver, this);
		}
	 
	 
public void User() {
	
	User.click();
}

public void LogOut() {
	
	LogOut.click();
}

public String Confirmation() {
	
	return LogoutConfirmation.getText();
}

}
