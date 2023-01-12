@smoke

  Feature: F01_Register | users could register with new
    Scenario:
  Given user go to register page
      When user select gender type
      And user first and last name
      And user enter date of birth
      And user enter valid email
      And user enter company
      And user enter password and confirm password
      And user click register
      Then User login Successfully



