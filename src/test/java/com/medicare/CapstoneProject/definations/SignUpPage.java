package com.medicare.CapstoneProject.definations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	public class SignUpPage {
	
	   WebDriver driver = SetUp.driver;
	
			@FindBy(id = "signup")
			WebElement SignUp;
			
			@FindBy(id="firstName")
			WebElement FirstName;
			
			@FindBy(id = "lastName")
			WebElement LastName;
			
			@FindBy(id = "email")
			WebElement Email;
			
			@FindBy(id = "contactNumber")
			WebElement ContactNumber;
			
			@FindBy(id = "password")
			WebElement Password;
			
			@FindBy(id = "confirmPassword")
			WebElement ConfirmPassword;
			
			@FindBy(id = "role1")
			WebElement Role;
			
			@FindBy(name = "_eventId_billing")
			WebElement NextBilling;
			
			@FindBy(id = "addressLineOne")
			WebElement LineOne;
			
			@FindBy(id = "addressLineTwo")
			WebElement LineTwo;
			
			@FindBy(id = "city")
			WebElement City;
			
			@FindBy(id = "postalCode")
			WebElement PostalCode;
			
			@FindBy(id = "state")
			WebElement State;
			
			@FindBy(id = "country")
			WebElement Country;
			
			@FindBy(name = "_eventId_confirm")
			WebElement NextConfirm;
			
			@FindBy(xpath = "//*[contains(text(),'Confirm')]")
			WebElement Confirm;
			
			@FindBy(xpath = "//*[contains(text(),'Welcome')]")
			WebElement Welcome;
			
	public SignUpPage () {
		
		PageFactory.initElements(driver, this);
	}
	
	public void SignUpBtn() {
		
		SignUp.click();
	}
	
	public void Name(String firstNameVal, String lastNameVal) {
		
		FirstName.sendKeys(firstNameVal);
		LastName.sendKeys(lastNameVal);
		
	}
	
	public void PersonalDtls(String emailVal, String contactNum, String passwordVal, String confirmPwdVal) {
		
		Email.sendKeys(emailVal);
		ContactNumber.sendKeys(contactNum);
		Password.sendKeys(passwordVal);
		ConfirmPassword.sendKeys(confirmPwdVal);
	
		
	}
	
	public void Role() {
		
		Role.click();
	}
	
	public void NextBilling() {
		
		NextBilling.click();
		
		
	}
	
	public void NextConfirm() {
		
		
		NextConfirm.click();
		
		
	}
	public void Confirm() {
	
	
	Confirm.click();
	
}
	
	public void AddressDtls (String lineOneVal, String lineTwoVal, String cityVal, String postalVal, String stateVal, String countryVal) {
		
		LineOne.sendKeys(lineOneVal);
		LineTwo.sendKeys(lineTwoVal);
		City.sendKeys(cityVal);
		PostalCode.sendKeys(postalVal);
		State.sendKeys(stateVal);
		Country.sendKeys(countryVal);
	}
	
	public String WelcomeMsg () {
		
		return Welcome.getText();	
		
	}

}
