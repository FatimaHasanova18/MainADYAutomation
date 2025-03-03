@TicketSearch
Feature: TicketSearch function
  Scenario: Search for tickets from a specific station
    Given The user navigates to the homepage
    And The user selects "Bakı" as the departure station
    And The user selects "GƏNCƏ" as the arrival station
    And The user selects "2025-03-08" as the travel date
    When The user clicks the search button
    Then The search results should display tickets from Bakı to Gəncə on 2025-02-27

# @TicketSearch @regression
#  Scenario: Search for tickets with empty fields
#    Given The user navigates to the homepage
#    When The user clicks the search button without selecting any fields
#    Then An error message should be displayed to prompt the user to select stations and date
#
#  Scenario: Search for tickets with only one station selected
#    Given The user navigates to the homepage
#    And The user selects "Bakı" as the departure station
#    When The user clicks the search button without selecting the arrival station
#    Then An error message should be displayed indicating that both stations are required
#
#  Scenario: Search for tickets with invalid date
#    Given The user navigates to the homepage
#    And The user selects "Bakı" as the departure station
#    And The user selects "Gəncə" as the arrival station
#    And The user selects an invalid travel date "2025-02-30"
#    When The user clicks the search button
#    Then An error message should be displayed indicating the invalid date