@HomePageRegression
Feature: This feature would be used to design Medicare HomePage

  Background: User opens the Medicare Website
    Given User is on HomePage

  Scenario: User wants to view About section
    When User click on About Button
    Then User lands on the About Us page

  Scenario: User wants to view Contact Page
    When User click on Contact Button
    Then User lands on Contact Us page

  Scenario: User wants to view All Products
    When User click on View Product Button
    Then User can view all the Products

  Scenario: User want to search a Particular Product
    When User click on View Product Button
    And enters the Product Name in Search bar "Amoxicillin"
    Then User is able to see that Product

  Scenario: User want to view the Product by Categories
    When User clicks on Antipyretics Button
    Then User is able to see the Products of that Categories
