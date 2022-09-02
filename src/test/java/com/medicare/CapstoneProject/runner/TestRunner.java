package com.medicare.CapstoneProject.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		plugin = {"pretty", "html:target/cucumber-reports","json:target/Cucumber.json"}, // to generate report
		
		features= "src/test/resources/features",
		glue= {"com.medicare.CapstoneProject.definations"},
		
		/*If you want to run any below condition than Just comment out the 
		 * running one and remove the comment from the one you want to run*/
		
		tags= ("@E2E or @API")
				//tags = ("@ManageProductRegression") /-------just to run manage product feature---------/
				//tags = ("@CheckoutRegression")      /-------just to run Checkout feature---------/
				//tags = ("@HomePageRegression")	  /-------just to run HomePage feature---------/
				//tags = ("@LoginRegressions")		  /-------just to run Login feature---------/
				//tags = ("@UserLogin")				 /-------just to run User Valid login Scenario---------/
				//tags = ("@UserInvalid")			 /-------just to run User InValid login Scenario---------/
				//tags = ("@AdminLogin")			 /-------just to Admin login Scenario--------/
				//tags = ("@SignUp")				 /-------just to run SignUp feature---------/
		
		

)
public class TestRunner {

}
