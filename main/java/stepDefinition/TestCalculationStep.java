package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import pages.TestCalculationPage;

//import static reportConfig.WebDriverManager.driver;

//import static reportConfig.WebDriverManager.driver;

public class TestCalculationStep {
    private TestCalculationPage testCalculationPage;

    public TestCalculationStep() {
        testCalculationPage = new TestCalculationPage();
    }

    @Given("the user navigates to the cargo price calculation section")
    public void the_user_navigates_to_the_cargo_price_calculation_section() {
        String calculationPage = "https://freight.ady.az/az/tarif-kalkulyatoru?countryDep=%D0%90%D0%97%D0%95%D0%A0%D0%91%D0%90%D0%99%D0%94%D0%96%D0%90%D0%9D&countryDst=%D0%A0%D0%9E%D0%A1%D0%A1%D0%98%D0%AF&shipmentType=car";
        testCalculationPage.driver.get(calculationPage);
        testCalculationPage.driver.manage().window().maximize();

    }

    @And("the user selects {string} as the departure station of calculation")
    public void the_user_selects_as_the_departure_station_of_calculation(String string) {
        testCalculationPage.departureCalculation(string);
    }

    @And("the user selects {string} as the arrival station of calculation")
    public void the_user_selects_as_the_arrival_station_of_calculation(String string) {
        testCalculationPage.arrivalCalculation(string);
    }

    @And("the user selects {string} as the cargo type of calculation")
    public void the_user_selects_as_the_cargo_type_of_calculation(String string) {
        testCalculationPage.cargoTypeCalculation(string);
//testCalculationPage.dropdown();
//testCalculationPage.dropdownInput();
    }

    @And("the user selects {string} as the cargo name of calculation")
    public void the_user_selects_as_the_cargo_name_of_calculation(String string) {
        testCalculationPage.cargoNameCalculation(string);
    }

    @And("the user enters {string} as the cargo weight of calculation")
    public void the_user_enters_as_the_cargo_weight_of_calculation(String string) {
        testCalculationPage.cargoNumberCalculation(string);
    }

    @And("the user selects {string} as the cargo owner of calculation")
    public void the_user_selects_as_the_cargo_owner_of_calculation(String string) {
        testCalculationPage.cargoPersonCalculation(string);
    }

    @And("the user selects {string} as the cargo nationality of calculation")
    public void the_user_selects_as_the_cargo_nationality_of_calculation(String string) {
        testCalculationPage.nationalityCalculation(string);
    }

    @When("the user clicks the calculate button of calculation")
    public void the_user_clicks_the_calculate_button_of_calculation() {
    //    testCalculationPage.calculate();
    }

    @Then("the system displays the cargo price details of calculation")
    public void the_system_displays_the_cargo_price_details_of_calculation() {

    }
}
