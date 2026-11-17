Feature: login Validation

  Background:
#    Given  Iam in the login page


  @login @regression @sanity
  Scenario: login with valid user name & valid password
    Given user in the login page
    When user login with valid username and valid password
#    When login with valid username "Admin" & valid password"admin123"
#    When login with valid username "Admin"
#  And     valid password"admin123"
    Then successful login
#    And i can naviagte to the homepage

  @smoke
#  Scenario: login with valid user name &  invalid password
##    Given Iam in the login page
#    When login with valid username "Admin" & Invalid password"admin12"
#    Then unsuccessful login
##    But user is not able to navigate to the home page
#
 @login
  Scenario Outline: Login with Multiple credentials
    When login with a <username> & a <password>
    Then successful/unsuccessful login
    Examples:
      | username | password |  |
      | Admin    | admin123 |  |
      | Admin    | admin12  |  |
      | asw      | 123      |  |