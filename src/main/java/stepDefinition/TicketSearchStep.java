package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TicketSearchPage;

public class TicketSearchStep {
    private TicketSearchPage ticketSearchPage;

    public TicketSearchStep(){
        ticketSearchPage = new TicketSearchPage();
    }

    @And("The user selects {string} as the departure station")
    public void the_user_selects_as_the_departure_station(String station) {
        ticketSearchPage.clickDepartureStation(station);
    }

    @And("The user selects {string} as the arrival station")
    public void the_user_selects_as_the_arrival_station(String station) {
        ticketSearchPage.clickDestinationStation();
    }

    @And("The user selects {string} as the travel date")
    public void the_user_selects_as_the_travel_date(String date) {
      ticketSearchPage.clickDepartureTime();

    }

    @When("The user clicks the search button")
    public void the_user_clicks_the_search_button() {
     ticketSearchPage.clickSearchButton();
    }

    @Then("The search results should display tickets from Bakı to Gəncə on {int}-{int}-{int}")
    public void the_search_results_should_display_tickets_from_bakı_to_gəncə_on(Integer year, Integer month, Integer day) {

    }

    @When("The user clicks the search button without selecting any fields")
    public void the_user_clicks_the_search_button_without_selecting_any_fields() {

    }

    @Then("An error message should be displayed to prompt the user to select stations and date")
    public void an_error_message_should_be_displayed_to_prompt_the_user_to_select_stations_and_date() {

    }

    @When("The user clicks the search button without selecting the arrival station")
    public void the_user_clicks_the_search_button_without_selecting_the_arrival_station() {

    }

    @Then("An error message should be displayed indicating that both stations are required")
    public void an_error_message_should_be_displayed_indicating_that_both_stations_are_required() {

    }

    @Given("The user selects an invalid travel date {string}")
    public void the_user_selects_an_invalid_travel_date(String invalidDate) {

    }

    @Then("An error message should be displayed indicating the invalid date")
    public void an_error_message_should_be_displayed_indicating_the_invalid_date() {

    }
}
