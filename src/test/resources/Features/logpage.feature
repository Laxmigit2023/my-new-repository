Feature: login validation with data table
  Scenario: Login to OrangeHRM using valid and invalid credentials
    Given user is on OrangeHRM login page
    When user enters OrangeHRM login credentials
      | username | password |
      | Admin    | admin123 |
      | Admin    | wrong123 |
      | user123  | admin123 |
    Then login result should be validated
    And page logout should be performed for successful login