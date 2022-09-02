@LoginRegressions
Feature: This feature would be used to Validate Login Page

  Background: User opens the Medicare website
    Given User is on HomePage

	@UserLogin
  Scenario Outline: User is able to LogIn with Valid Credentials
    When User click on LogIn Button
    And User enters the Valid Email and Password "<Email>" and "<Password>"
    And User clicks the LogIn Button
    Then User is able LogIn sccessfully

    Examples: 
      | Email                 | Password |
      | sumit.rusia@gmail.com |     1234 |
	
	@UserInvalid
  Scenario Outline: User gets the Error when LogIn with Invalid Credentials
    When User click on LogIn Button
    And User Enters Invalid Email and Password "<Email>" and "<Password>"
    And User clicks the LogIn Button
    Then User get the Error message "Login"

    Examples: 
      | Email        | Password |
      | ls@gmail.com | as1234   |

	@AdminLogin
  Scenario Outline: Admin is able to LogIn
    When User click on LogIn Button
    And User enters Admin Email and Password "<Email>" and "<Password>"
    And User clicks the LogIn Button
    Then User is able to see the Admin Page

    Examples: 
      | Email        | Password |
      | vk@gmail.com | admin    |
