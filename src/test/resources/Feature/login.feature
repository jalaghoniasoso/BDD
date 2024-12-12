Feature: Login functionalty

#  Scenario: Successful login

#    Given The user is on the login page
#    When The user enters valid credentials
#    Then The user is redirected to the dashboard

#    Given The user is on the login page
#    When The user enters valid credentials
#    And user is "admin" and password is "123456:
#    Then The user is redirected to the dashboard

  Background:
    Given check if user is exist

  Scenario Outline: login with different username
    Given The user is on the login page
    When The user enters valid credentials
    And username is "<username>" and password is "<password>"
    Then status code is "<status>"
    Examples:
      | username  | password | status |
      | admin     | 1234     | 200    |
      | user      | 231456   | 200    |
      | moderator | 7777     | 400    |
      | user      | 231456   | 200    |
      | user      | 231456   | 200    |