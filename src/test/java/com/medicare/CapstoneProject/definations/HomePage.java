package com.medicare.CapstoneProject.definations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage  {
	
	WebDriver driver = SetUp.driver;
	
	@FindBy(id = "about")
	WebElement About;
	
	@FindBy(xpath = "//*[text()[contains(., 'This is an about us page')]]")
	WebElement AboutUs;
	
	@FindBy(id = "contact")
	WebElement Contact;
	
	@FindBy(xpath = "//*[text()[contains(., 'This is an contact us page')]]")
	WebElement ContactUs;
	
	@FindBy(xpath = "//*[contains(text(),'View Products')]")
	WebElement ViewProduct;
	
	
	@FindBy(xpath = "//*[@type='search']")
	WebElement Search;
	
	@FindBy(id = "a_Antipyretics")
	WebElement Categories;
	
	public HomePage () {
		
		PageFactory.initElements(driver, this);
	}
	
	public void About() {
		
		About.click();
		
	}
	
	public String AboutUS() {
		
		return AboutUs.getText();
		
	}
	
	public void Contact() {
		Contact.click();
	}
	
	public String ContactUs() {
		
		return ContactUs.getText();
		
	}
	
	public void ViewProduct() {
		
		ViewProduct.click();
	}
	
	public void AllProduct() {
		
		List<WebElement> AllProduct = driver.findElements(By.xpath("//*[@id=\"productListTable\"]/tbody/tr/td[2]"));
		
		int i = 1;
		for (WebElement products : AllProduct) {
			System.out.print(i++);
			System.out.println("\t" + products.getText());
			
		}
		
		
	}
	
	public void Search(String SearchVal) {
		
		Search.sendKeys(SearchVal);
	}
	
	public String SearchResult() {
		
		WebElement SearchResult = driver.findElement(By.xpath("//*[@id=\"productListTable\"]/tbody/tr/td[2]"));
		
		return SearchResult.getText();
		
		
	}
	
	public void Categories() {
		Categories.click();
	}
	
	public void Category() {
		
		List<WebElement> SearchResult = driver.findElements(By.xpath("//*[@id=\"productListTable\"]/tbody/tr/td[2]"));
		
		int i = 1;
		for (WebElement searchProduct : SearchResult) {
			System.out.print(i++);
			System.out.println("\t" + searchProduct.getText());
			
		
	}
}
	
}
