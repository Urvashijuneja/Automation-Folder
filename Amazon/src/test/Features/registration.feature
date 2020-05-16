Feature: As a user I should register

  Scenario: User should be able to register with valid credentials

    Given I am on home page
    When  I enter yourname "Urvashi"
    And   I enter email "urvashi.punjabi@gmail.com"
    And   I enter password "urjuneja"
    And   I reenter password "urjuneja"
    Then  I should able to successfully register