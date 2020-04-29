#@Login
#Feature:As a user I want to login into nopcommerce website
#
#  Scenario: User should navigate to login page successfully
#    Given  I am on nopcommerce  homepage
#    When  I click on login link
#    Then I should navigate to login page successfully
#
#  Scenario: User should login successfully with valid credentials
#    Given I am on nopcommerce  homepage
#    When I click on login link
#    And I enter email "abc@yahoomail.com"
#    And I enter password "Tajmahal06"
#    And I click on login button
#    Then I should login successfully
#
#  Scenario Outline: Verify the error message with invalid credentials
#    Given I am on nopcommerce  homepage
#    When I click on login link
#    And I enter email "<username>"
#    And I enter password "<password>"
#    And I click on login button
#    Then I Should see the error message "<errorMessage>"
#    Examples:
#      | username           | password  | errorMessage                                                     |
#      | abcd1234@gmail.com | xyz1234   | Login was unsuccessful. Please correct the errors and try again. |
#      | abcd1235@gmail.com | xyz1235   | Login was unsuccessful. Please correct the errors and try again. |
#      | abcd1236@gmail.com | xyz1236   | Login was unsuccessful. Please correct the errors and try again. |
#      | abc123@gmail.com   | xyz12356  | Login was unsuccessful. Please correct the errors and try again. |
#      | ab123@gmail.com    | xyz12367  | Login was unsuccessful. Please correct the errors and try again. |
