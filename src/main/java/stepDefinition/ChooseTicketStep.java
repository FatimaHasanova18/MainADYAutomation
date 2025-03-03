package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasePage;
import pages.ChooseTicketPage;

public class ChooseTicketStep extends BasePage {
    private ChooseTicketPage chooseTicketPage;

    public ChooseTicketStep() {
        chooseTicketPage = new ChooseTicketPage();
    }

    @Given("the user navigates to the choose ticket page")
    public void the_user_navigates_to_the_choose_ticket_page() {

    }

    @And("the user selects a suitable ticket")
    public void the_user_selects_a_suitable_ticket() {
        chooseTicketPage.clickGetTicket();
    }

    @And("the user selects a suitable date")
    public void the_user_selects_a_suitable_date() {
      //  chooseTicketPage.clickFifthMarchTicket();
     //   chooseTicketPage.clickFourthMarchTicket();
//        chooseTicketPage.clickSixthMarchTicket();
//        chooseTicketPage.clickThirdMarchTicket();
//        chooseTicketPage.clickTwentyFebTicket();
//        chooseTicketPage.clickFirstMarchTicket();
    }

    @And("the user clicks the choose area button")
    public void the_user_clicks_the_choose_area_button() {
//        chooseTicketPage.clickBusinessTicket();
//        chooseTicketPage.clickStandartplusTicket();
//        chooseTicketPage.clickFirstClassTicket();
    }

    @And("the user clicks choose suiteButton")
    public void the_user_clicks_the_choose_suiteButton() {
        chooseTicketPage.clickChooseSuit();
    }

    @And("the user selects the appropriate seats")
    public void the_user_selects_the_appropriate_seats() {
        chooseTicketPage.clicktSuit6();
    }

    @And("the user clicks the total amount button")
    public void the_user_clicks_the_total_amount_button() {

        chooseTicketPage.clickTotalAmountBtn();
    }

    @And("the user selects a payment type")
    public void the_user_selects_a_payment_type() {
        chooseTicketPage.clickAzericart();
        chooseTicketPage.clickAgrreementBtn();
        chooseTicketPage.clickAgreementBtn2();

    }

    @When("the user clicks the payment button")
    public void the_user_clicks_the_payment_button() {
chooseTicketPage.clickPaymentBtn();
    }

    @Then("the user is redirected to the card details page")
    public void the_user_is_redirected_to_the_card_details_page() {

    }
}
