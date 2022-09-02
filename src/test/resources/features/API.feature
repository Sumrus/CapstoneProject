@API
Feature: This feature would be used to test the API Requests

  Scenario: Get All Products
    Given The base URI is "http://localhost:8082/medicare/json/data/all/products"
    When I Perform the Get Operation
    Then Response code should be 200

  Scenario: Get Analgesics Product
    Given The base URI is "http://localhost:8082/medicare/json/data/category/2/products"
    When I Perform the Get Operation
    Then Response code should be 200

  Scenario: Get Most Viewed Medicines
    Given The base URI is "http://localhost:8082/medicare/json/data/mv/products"
    When I Perform the Get Operation
    Then Response code should be 200

  Scenario: Get Most Purchased Medicines
    Given The base URI is "http://localhost:8082/medicare/json/data/mp/products"
    When I Perform the Get Operation
    Then Response code should be 200
