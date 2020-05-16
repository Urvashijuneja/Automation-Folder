Feature: As a user I should register
@s1 @smoke @regression
  Scenario: User should be able to register with valid credentials

    Given I am on home page "http://www.faceboook.com"
    When  I enter firstname
    And   I enter surname "Juneja"
    And   I enter mobile number "07971788087"
    And   I enter password "urjuneja"
    And   I select date of birth
    And   I select gender
    Then  I should able to successfully register

  @s2 @regression
  Scenario: User should be able to register with valid credentials

    Given I am on home page url
    When  I enter firstname "Rakesh"
    And   I enter surname "Juneja"
    And   I enter mobile number "07949204285"
    And   I enter password "rjuneja"
    And   I select date of birth
    And   I select gender
    Then  I should able to successfully register

  @s3 @regression
  Scenario Outline: User should Register

    Given I am on home page url
    When  I enter firstname "<firstname>"
    And   I enter surname "<lastname>"
    And   I enter mobile number "<mobnum>"
    And   I enter password "<password>"
    And   I select date of birth
    And   I select gender
    Then I should register with "<msg>"

    Examples:
      | firstname | lastname | mobnum       | password | msg             |
#     | Namrata   | Juneja   | 07808717087 | nrjuneja | Success message |
      | Vani      | Juneja   | 07971788087 | vj       | Failure Message|