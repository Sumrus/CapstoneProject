@SignUp
Feature: This feature would be used to design the SignUp page of the application

  Scenario Outline: User is able to land on the SignUp Page
    Given User is on HomePage
    When User clicks on the SignUp Button and land on the SignUp Page
    And User enters the Personal Details "<First Name>","<Last Name>","<Email>","<Contact Number>","<Password>" and "<Confirm Password>"
    And User selects the Role as User
    And User clicks on the Next Button and land on the Sign Up-Address page
    And User enters the Address Details "<Line One>","<Line Two>","<City>","<Postal Code>","<State>" and "<Country>"
    And User clicks on the Next Button and land on the confirmation page
    And User clicks on the Confirm Button
    Then User is able to SignUp successfully and "Welcome!" message is dispalyed

    Examples: 
      | First Name | Last Name | Email        | Contact Number | Password | Confirm Password | Line one | Line Two | City   | Postal Code | State  | Country |
      | Rahul      | Jain      | RJ21@gmail.com |   111133334444 |     1111 |             1111 | Apt      | Dundrum  | Dublin | D16         | Dublin | Ireland |
