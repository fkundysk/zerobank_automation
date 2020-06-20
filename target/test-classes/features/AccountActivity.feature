Feature: Account Activity


  @wip
  Scenario: Account Activity Page
    Given the user should be on Account Activity page
    When  Following options should be on Account drop down
      | Savings     |
      | Checking    |
      | Loan        |
      | Credit Card |
      | Brokerage   |

    And   Default option should be "Saving"
    Then  Following column names should be on Transactions table
      | Date        |
      | Description |
      | Deposit     |
      | Withdrawal  |
