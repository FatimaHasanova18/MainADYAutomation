package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CargoTransportationPage;

public class CargoTransportationStep {
    private CargoTransportationPage cargoTransportationPage;

    public CargoTransportationStep() {
        cargoTransportationPage = new CargoTransportationPage();
    }

    @Given("the user navigates to the cargo section")
    public void the_user_navigates_to_the_cargo_section() {
        String cargopage = "https://freight.ady.az/az";
        cargoTransportationPage.driver.get(cargopage);
        cargoTransportationPage.driver.manage().window().maximize();
    }

    @And("the user selects {string} as the departure station")
    public void the_user_selects_as_the_departure_station(String string1) {
        cargoTransportationPage.setCargoTransportationDeparture(string1);
    }

    @And("the user selects {string} as the destination station")
    public void the_user_selects_as_the_destination_station(String string1) {
        cargoTransportationPage.setCargoTransportationDestionation(string1);
    }

    @And("the user selects {string} as the type of cargo")
    public void the_user_selects_as_the_type_of_cargo(String cargoType) {
        cargoTransportationPage.clickCargoTransportationType();
    }

    @And("the user selects type of cargo")
    public void the_user_selects_type_of_cargo() {
        cargoTransportationPage.chooseConteyner();
    }

    @When("the user clicks the calculate button")
    public void the_user_clicks_the_calculate_button() {
        cargoTransportationPage.clickCargoTransportationButton();
    }

    @Then("the user should be navigated to the cargo details page")
    public void the_user_should_be_navigated_to_the_cargo_details_page() {

    }
}
