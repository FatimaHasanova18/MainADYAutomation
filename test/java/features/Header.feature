@Header
Feature: Header Functionality

  Scenario: User interacts with the header dropdown
    Given the user navigates to the homepage
    And the user clicks on the first  header message
    When the user clicks on the second  header message
    And the user clicks on the third  header message
    Then the corresponding page should open successfully
