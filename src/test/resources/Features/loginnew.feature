Feature: OrangeHRM Login

  Background:


  @Smoke @login
  Scenario: Successful login with valid credentials
    Given user is on the OrangeHRM login page
    When user enters username "Admin"
    And  password "admin123"
   And clicks the login button
    Then user should be redirected to the dashboard

  @Regression
  Scenario: Login with invalid password
    When user enters username "Admin" and password "wrongpass"
    And clicks the login button
    Then an error message "Invalid credentials" should be displayed

  @Regression
  Scenario: Login with blank username and password
    When user enters username "" and password ""
    And clicks the login button
    Then an error message "Required" should be displayed below the fields

  @Regression
  Scenario: Login with only username
    When user enters username "Admin" and password ""
    And clicks the login button
    Then an error message "Required" should be displayed for the password field

  @Regression @login
  Scenario: Login with only password
    When user enters username "" and password "admin123"
    And clicks the login button
    Then an error message "Required" should be displayed for the username field