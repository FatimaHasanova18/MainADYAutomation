@TestCalculation
  Feature: TestCalculation  function
    Scenario Outline: User calculates the price of cargo
      Given the user navigates to the cargo price calculation section
      And the user selects "<departure_station>" as the departure station of calculation
      And the user selects "<arrival_station>" as the arrival station of calculation
      And the user selects "<cargo_type>" as the cargo type of calculation
      And the user selects "<cargo_name>" as the cargo name of calculation
      And the user enters "<cargo_weight>" as the cargo weight of calculation
      And the user selects "<cargo_owner>" as the cargo owner of calculation
      And the user selects "<cargo_nationality>" as the cargo nationality of calculation
      When the user clicks the calculate button of calculation
      Then the system displays the cargo price details of calculation

      Examples:
        | departure_station | arrival_station             | cargo_type       | cargo_name         | cargo_weight | cargo_owner  | cargo_nationality |
        | СУМГАИТ          | МОСКВА-ТОВАРНАЯ-КУРСКАЯ     | Реф. контейнер   | Сахар тростниковый | 100          | Собственный  | АЗЕРБАЙДЖАН       |
