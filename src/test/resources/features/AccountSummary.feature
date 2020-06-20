Feature: Account Summary Page


  Scenario: Page Options
    Given the user is logged in
    When the user should be able to Account Summary Page
    Then the user should see following options
      | Cash Accounts       |
      | Investment Accounts |
      | Credit Accounts     |
      | Loan Accounts       |