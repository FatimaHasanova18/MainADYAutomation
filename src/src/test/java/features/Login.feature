@Login
Feature: Login function

  Scenario Outline: Successful login with valid credentials
    Given The user navigates to the homepage
    And The user clicks on the login button
    When The user enters "<email>" and "<password>"
    Then Clicks on the Daxil ol button
    Then Clicks on the logo and proceeds to the homepage

    Examples:
      | email            | password |
      | test@example.com | Test1234 |

