Feature: Login

  Scenario: Login To Shop
    Given User goes to login page
    When User enters email "alex322@mailinator.com" and password "JZfHyx6f"
    And User clicks on login button
    Then User "alex322@mailinator.com" should be logged to application