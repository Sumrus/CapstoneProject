package com.medicare.CapstoneProject.definations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class SetUp {
	
	public static WebDriver driver;
	 
	@Before
	public void setUp() {
		
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
			
		
		 driver = new ChromeDriver();
		 
		
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
	}
	
	@After
	public void TearDown() {
		
		driver.close();
		
	}

}
