Feature: Navigating to specific accounts in Account Activity


  Scenario Outline: "<Modules>" account redirect
    Given the user is logged in
    When the user clicks on "<Modules>" link on the Account Summary page
    Then the Account Activity page should be displayed
    And Account drop down should have "<Modules>" selected
    Examples:
      | Modules     |
      | Savings     |
      | Brokerage   |
      | Checking    |
      | Credit Card |

#
#  Scenario: Brokerage account redirect
#    Given the user is logged in
#    When the user clicks on "Brokerage" link on the Account Summary page
#    Then the Account Activity page should be displayed
#    And Account drop down should have "Brokerage" selected
#
#  Scenario: Checking account redirect
#    Given the user is logged in
#    When the user clicks on "Checking" link on the Account Summary page
#    Then the Account Activity page should be displayed
#    And Account drop down should have "Checking" selected
#
#  Scenario: Credit Card account redirect
#    Given the user is logged in
#    When the user clicks on "Credit Card" link on the Account Summary page
#    Then the Account Activity page should be displayed
#    And Account drop down should have "Credit Card" selected
#
#  Scenario: Loan account redirect
#    Given the user is logged in
#    When the user clicks on "Loan" link on the Account Summary page
#    Then the Account Activity page should be displayed
#    And Account drop down should have "Loan" selected