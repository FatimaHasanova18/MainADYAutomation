@ChooseTicket
Feature: Choose Ticket Function

  Scenario: Search for tickets from a specific station in a country
    Given the user navigates to the choose ticket page
    And the user selects a suitable date
    And the user selects a suitable ticket
    And the user clicks choose suiteButton
    And the user clicks the choose area button
    And the user selects the appropriate seats
    And the user clicks the total amount button
    And the user selects a payment type
    When the user clicks the payment button
    Then the user is redirected to the card details page

#    Examples:
#      | Ticket Type      | Area      | Seats      | Payment Type |
#      | Standard Ticket  | Zone A    | Seat 12    | Credit Card  |