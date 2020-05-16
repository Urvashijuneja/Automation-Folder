Feature: As a user I should able to reorder product

  Scenario: User should be able to reorder product by searching preorders

    Given I am on home page
    When  I click on signin button on home page"
    And   I enter email "urvashi.punjabi@gmail.com"
    And   I click on continue button
    And   I enter password "urnr2916"
    And   I click signin button
    And   I click buyagain menu
    And   I enter search text "mario spray"
    And   I click searchorders button
    And   I click buyitagain   button
    And   I click addtobasket  buttton
    And   I click proceedtocheckout button
    Then  I should able to successfully reorder