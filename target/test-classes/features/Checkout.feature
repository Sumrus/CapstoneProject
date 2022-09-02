@CheckoutRegression
Feature: This feature would be used to design Checkout Page

  Scenario Outline: Adding the item into the cart and going for Checkout
    Given User is on HomePage
    When User click on LogIn Button
    And User enters the Valid Email and Password "<Email>" and "<Password>"
    And User clicks the LogIn Button
    And User click on View Product Button
    And User click on the cart Button
    And User click on the Checkout Button
    And User click on the Select Button
    And User enter the card detail "<CardNumber>" , "<Exp Date MM>" , "<Exp Date YY>" and "<CV Code>"
    And User clicks on the Pay Button
    Then User is able to see the Confirmaton Msg "Your Order is Confirmed!!"

    Examples: 
      | Email                 | Password | CardNumber      | Exp Date MM | Exp Date YY | CV Code |
      | sumit.rusia@gmail.com |     1234 | 411111111111111 |          11 |          22 |     111 |
