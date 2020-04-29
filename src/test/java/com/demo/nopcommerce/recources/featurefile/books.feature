@Books
  Feature: As a User I want to visit books page onto nopcommerce website
    Scenario: User should navigate to books page successfully
      Given I am on nopcommerce  homepage
      When I click on books link
      Then I should navigate to books page successfully

    Scenario: User should sort books by a to z and verify it
    Given I am on home page
    When I click on books link
    And I click on sort by a to z
    Then I should see books sorted in a to z order

  Scenario: User should sort books by low to high price and verify it
    Given I am on home page
    When I click on books link
    And I click on low to high
    Then I should see books sorted in low to high price order
