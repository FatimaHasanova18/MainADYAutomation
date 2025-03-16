package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.LoginPage;

import java.time.Duration;

public class LoginStep {
    public LoginPage loginPage;
    private WebDriver driver;
    public LoginStep() {
        loginPage = new LoginPage();
    }

    @Given("The user navigates to the homepage")
    public void navigateToHomepage() {
        String firstpage = "https://ticket.ady.az/";
        loginPage.driver.get(firstpage);
        loginPage.driver.manage().window().maximize();
    }

    @And("The user clicks on the login button")
    public void clickingOnLoginButton() {

        loginPage.clickLoginButton();
    }

    @When("The user enters {string} and {string}")
    public void enterCredentials(String string, String string2) {
        loginPage.clickEmailInput();
        loginPage.clickPasswordInput();
    }

    @Then("Clicks on the Daxil ol button")
    public void clikingOnSubmit() {

        loginPage.clickLogin();
    }
    @Then("Clicks on the logo and proceeds to the homepage")
    public void clickingOnLogo(){

    }



}
