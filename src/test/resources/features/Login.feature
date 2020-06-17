@wip
Feature: Users should be able to login

  Background:
    Given the user is on the login page


  Scenario: Login with valid credentials
    When the user enter the valid credentials
    Then the user should be able to login
    And Summary page should be displayed


  Scenario Outline: Not login with invalid credentials
    When the user enter "<username>" "<password>" credentials
    Then the user should not be able to login
    And Error message should be displayed
    Examples:
      | username  | password  |
      | username1 | password  |
      | username  | password1 |
      |           | password  |
      | username  |           |


