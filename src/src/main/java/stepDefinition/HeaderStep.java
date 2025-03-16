package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HeaderPage;

public class HeaderStep {
    private HeaderPage headerPage;

    public HeaderStep() {
        headerPage = new HeaderPage();
    }

    @Given("the user navigates to the homepage")
    public void the_user_navigates_to_the_homepage() {
        String headerpage = "https://ticket.ady.az/";
        headerPage.driver.get(headerpage);
        headerPage.driver.manage().window().maximize();
    }

    @And("the user clicks on the first  header message")
    public void the_user_clicks_on_the_header_message() {
        headerPage.tarifOdenisHeader();
        headerPage.gedisHaqqiLink();
        headerPage.tarifOdenisHeader();
        headerPage.odenisUsullariLink();
        headerPage.tarifOdenisHeader();
        headerPage.biletSenediLink();
        headerPage.tarifOdenisHeader();
        headerPage.biletReturnLink();
        headerPage.tarifOdenisHeader();
        headerPage.elektronBiletLink();
    }

    @When("the user clicks on the second  header message")
    public void the_dropdown_opens() {
        headerPage.sernisinSInifleriLink();
        headerPage.birinciSinifLink();
        headerPage.sernisinSInifleriLink();
        headerPage.biznesClassLink();
        headerPage.sernisinSInifleriLink();
        headerPage.standartPlusLink();
        headerPage.sernisinSInifleriLink();
        headerPage.standartSinifLink();
    }

    @When("the user clicks on the third  header message")
    public void the_user_selects_an_element_from_the_dropdown() {
        headerPage.dasimaQaydalariLink();
        headerPage.usaqlarlaSeyahetLink();
        headerPage.dasimaQaydalariLink();
        headerPage.elYukleriLink();
        headerPage.dasimaQaydalariLink();
        headerPage.heyvanlarlaSeyahetLink();

    }

    @Then("the corresponding page should open successfully")
    public void the_corresponding_page_should_open_successfully() {

    }
}
