@E2E
Feature: This feature would be used to run E2E test for User

Background: User opens the Medicare Website
    Given User is on HomePage
    
    Scenario Outline: End to End test
    
    When User click on LogIn Button
    And User enters the Valid Email and Password "<Email>" and "<Password>"
    And User clicks the LogIn Button
    And User click on View Product Button
    And User click on the cart Button
    And User click on the Checkout Button
    And User click on the Select Button
    And User enter the card detail "<CardNumber>" , "<Exp Date MM>" , "<Exp Date YY>" and "<CV Code>"
    And User clicks on the Pay Button
    And User is able to see the Confirmaton Msg "Your Order is Confirmed!!"
    And User click on the Continue Shopping Button
    Then User sees the All Product page

    Examples: 
      | Email                 | Password | CardNumber      | Exp Date MM | Exp Date YY | CV Code |
      | sumit.rusia@gmail.com |     1234 | 411111111111111 |          11 |          22 |     111 |
