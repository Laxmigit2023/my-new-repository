Feature: Login Validation

  Scenario: login to OrangeHrm page using valid username and valid password
    Given user is on OrangeHrm login page
    When user enters valid userename  and password
    Then user should be redirected to the dashboard page