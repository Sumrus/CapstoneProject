@ManageProductRegression
Feature: This feature would be used to design ManageProduct Page

  Scenario Outline: User logged in as Admin and adds new product
    Given User is on HomePage
    When User click on LogIn Button
    And User enters Admin Email and Password "<Email>" and "<Password>"
    And User clicks the LogIn Button
    And User clicks the Manage Product Button
    And User enters the Product Details "<ProductName>","<Brand>","<Description>","<UnitPrice>" and "<Quantity>"
    And User clicks on Upload File Button
    And User Selects the Category for the Product
    And User clicks Save Button
    And User clicks on the Show All Button
    Then User sees the "<ProductName>" name

    Examples: 
      | Email        | Password | ProductName | Brand | Description                                      | UnitPrice | Quantity |
      | vk@gmail.com | admin    | lastproduct | Advil | Ibuprofen is used to reduce fever and treat pain |        50 |       20 |
