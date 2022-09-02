package com.medicare.CapstoneProject.definations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageProductPage {
	
	WebDriver driver = SetUp.driver;
	
	@FindBy(xpath = "//*[@id=\"manageProduct\"]/a")
	WebElement ManageProduct;
	
	@FindBy(id = "name")
	WebElement Name;
	
	@FindBy(id = "brand")
	WebElement Brand;
	
	@FindBy(id = "description")
	WebElement Description;
	
	@FindBy(id = "unitPrice")
	WebElement UnitPrice;
	
	@FindBy(id = "quantity")
	WebElement Quantity;
	
	@FindBy(id = "file")
	WebElement UploadFile;
	
	@FindBy(xpath = "//*[@id=\"categoryId\"]/option[2]")
	WebElement Category;
	
	@FindBy(xpath = "//*[@id=\"productsTable_length\"]/label/select/option[4]")
	WebElement ShowAll;
	
	@FindBy(name = "submit")
	WebElement Save;
	
	
 public ManageProductPage () {
		
		PageFactory.initElements(driver, this);
	}
 
 public void ManageProduct() {
	 
	 ManageProduct.click();
 }
 
 public void ProductDtls(String productName, String brand, String description, String unitPrice, String Qty) {
	 
	 Name.sendKeys(productName);
	 Brand.sendKeys(brand);
	 Description.sendKeys(description);
	 UnitPrice.sendKeys(unitPrice);
	 Quantity.sendKeys(Qty);
	 
 }
 
 public void Upload() {
	 
	 UploadFile.sendKeys("/Users/sumitrusia/Desktop/Classes/Phase 5/Drug.png");
	 
	 
 }
 
 public void Category() {
	 
	 Category.click();
 }
 
 public void Save() {
	 
	 Save.click();
 }
 
 public void ShowBtn() {
	 
	 ShowAll.click();
 }
 
 public String AddedProduct() {
	 
	 List<WebElement> Products = driver.findElements(By.xpath("//*[@id=\"productsTable\"]/tbody/tr/td[3]"));
	 
	String elementText = Products.get(Products.size()-1).getText();;
	 

	 return elementText;
	 
	
 }
 }
 


