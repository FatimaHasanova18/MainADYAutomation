package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.MainHeaderPage;

public class MainHeaderStep {
    private MainHeaderPage mainHeaderPage;

    public MainHeaderStep() {
        mainHeaderPage = new MainHeaderPage();
    }

    @Given("the user clicks and navigates to the homepage")
    public void the_user_clicks_and_navigates_to_the_homepage() {
        String mainHeaderpage = "https://ticket.ady.az/";
        mainHeaderPage.driver.get(mainHeaderpage);
        mainHeaderPage.driver.manage().window().maximize();
    }

    @And("the user clicks on the Korporativ header")
    public void the_user_clicks_on_the_korporativ_header() {
        mainHeaderPage.clickKorporativ();
    }

    @And("the user clicks on the Sərnişin Daşımaları header")
    public void the_user_clicks_on_the_sərnişin_daşımaları_header() {
        mainHeaderPage.clickSernisin();
    }

    @And("the user clicks on the Yük Daşımaları header")
    public void the_user_clicks_on_the_yük_daşımaları_header() {
        mainHeaderPage.clickYukDasinma();
    }

    @And("the user clicks on the Media header")
    public void the_user_clicks_on_the_media_header() {
        mainHeaderPage.clickmedia();
    }

    @And("the user clicks on the Bloq header")
    public void the_user_clicks_on_the_bloq_header() {
        mainHeaderPage.clickblog();
    }

    @And("the user clicks on the Əlaqə header")
    public void the_user_clicks_on_the_əlaqə_header() {
        mainHeaderPage.clickElaqe();
    }
    @And("the user change language")
    public void the_user_change_language() {
        mainHeaderPage.clickChangeLanguge();
        mainHeaderPage.clickEnglish();
    }
}
