package com.medicare.CapstoneProject.definations;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APIStepDeff {
	
	Response response;
	RequestSpecification request;
	
	@Given("The base URI is {string}")
	public void the_base_uri_is(String URI) {
		
		request = RestAssured.given().baseUri(URI);
	   
	}

	@When("I Perform the Get Operation")
	public void i_perform_the_get_operation() {
		
		response = request.get();
	    
	}

	@Then("Response code should be {int}")
	public void response_code_should_be(int ResponseCode) {
		
		Assert.assertEquals(ResponseCode, 200);
		
	    
	}

}
