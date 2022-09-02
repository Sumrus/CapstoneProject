@E2E
Feature: This feature would be used for Admin end to end test

  Background: User opens the Medicare Website
    Given User is on HomePage

  Scenario Outline: Admin End To End Test
    When User click on LogIn Button
    And User enters Admin Email and Password "<Email>" and "<Password>"
    And User clicks the LogIn Button
    And User clicks the Manage Product Button
    And User enters the Product Details "<ProductName>","<Brand>","<Description>","<UnitPrice>" and "<Quantity>"
    And User clicks on Upload File Button
    And User Selects the Category for the Product
    And User clicks Save Button
    And User clicks on the Show All Button
    And User sees the "<ProductName>" name
    And User clicks on logout Button
    Then User is landed back to Login Page

    Examples: 
      | Email        | Password | ProductName     | Brand | Description                                      | UnitPrice | Quantity |
      | vk@gmail.com | admin    | ibuprofenTablet | Advil | Ibuprofen is used to reduce fever and treat pain |        50 |       20 |
