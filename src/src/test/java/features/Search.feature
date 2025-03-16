@Search
Feature: Search Functionality

  Scenario Outline: User searches for a specific item
    Given the user is on the homepage
    When the user clicks the search button
    And enters "<Vaqon>" in the search field
    And presses the Enter key
    Then the user should be redirected to the search results page

    Examples:
      | Vaqon  |
      | Yük vaqonu |
      | Sərnişin vaqonu |

