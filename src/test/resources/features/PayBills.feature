Feature: Zero-Pay Bills



  Scenario: Successfully pay operation
    Given The user should on Pay Bills Page
    When The user tries to make a payment with valid values
    Then  Message should be displayed

    Scenario: Unsuccessfully pay operation
      Given The user should on Pay Bills Page
      When The user tries to make a payment with invalid values
      Then  Message should be displayed