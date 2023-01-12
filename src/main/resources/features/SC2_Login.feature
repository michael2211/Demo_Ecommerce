@smoke
  Feature: users could use login functionality to use their accounts
    Scenario: user could login with valid email and password
    Given user go to login page
    When user login with valid users
    And user press on login button
    Then user login to the system successfully

    Scenario: user could login with invalid email and password
    Given user go to login page again
    When user login with invalid users
    And user press on login button again
    Then user could not login to the system