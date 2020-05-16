Feature: As a user I should register

  Scenario: User should be able to register with valid credentials

    Given I am on home page
    When  I enter firstname "Urvashi"
    And   I enter surname "Juneja"
    And   I enter mobile number "07971788087"
    And   I enter password "urjuneja"
    And   I select date of birth
    And   I select gender
    Then  I should able to successfully register