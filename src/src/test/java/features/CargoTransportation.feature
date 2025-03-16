@CargoTransportation
Feature: Cargo Transportation Calculation

  Scenario Outline: Successfully calculating cargo amount
    Given the user navigates to the cargo section
    And the user selects "<departure_station>" as the departure station
    And the user selects "<destination_station>" as the destination station
    And the user selects "<cargo_type>" as the type of cargo
    And the user selects type of cargo
    When the user clicks the calculate button
    Then the user should be navigated to the cargo details page

    Examples:
      | departure_station | destination_station | cargo_type |
      | Азербайджан       | Россия              | Vaqon      |
