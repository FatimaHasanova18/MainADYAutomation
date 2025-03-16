package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.BasePage;
import pages.SearchPage;

public class SearchStep {
    private SearchPage searchPage;

    public SearchStep() {
        searchPage = new SearchPage();
    }

    @Given("the user is on the homepage")
    public void the_user_is_on_the_homepage() {
        String homePage = "https://ticket.ady.az/";
        searchPage.driver.get(homePage);
        searchPage.driver.manage().window().maximize();
    }

    @When("the user clicks the search button")
    public void the_user_clicks_the_search_button() {
        searchPage.getSearchIcon();
    }

    @And("enters {string} in the search field")
    public void enters_in_the_search_field(String searchText) {
        searchPage.getSearchInput(searchText);
        searchPage.getSearchInput(Keys.ENTER.toString());
    }



    @And("presses the Enter key")
    public void presses_the_enter_key() {


    }

    @Then("the user should be redirected to the search results page")
    public void the_user_should_be_redirected_to_the_search_results_page() {

    }

}
