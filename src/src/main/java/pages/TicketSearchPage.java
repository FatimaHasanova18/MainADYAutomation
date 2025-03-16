package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TicketSearchPage extends BasePage {

    private WebDriverWait wait;

    public TicketSearchPage() {
        super();
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(2)); // WebDriverWait obyektini burada yarat
    }

    @FindBy(xpath = "//*[@id='vue-layout']/form/div[1]/div[1]/input")
    private WebElement departureStation;
    @FindBy(xpath = "//*[@id=\"vue-layout\"]/form/div[1]/div[1]/ul/li[1]/button")
    private WebElement departureButton;

    @FindBy(xpath = "/html/div//div/div[1]/div/div/a[2]/svg")
    private WebElement xbtn;

    @FindBy(xpath = "//*[@id='vue-layout']/form/div[1]/div[2]/input")
    private WebElement destinationStation;

    @FindBy(xpath = "//*[@id='vue-layout']/form/div[1]/div[1]/div/ul/li/button")
    private WebElement selectStation;

    @FindBy(xpath = "//*[@id=\"vue-layout\"]/form/div[2]/div[1]/input")
    private WebElement departureTime;

    @FindBy(xpath = "//*[@id='vue-layout']/form/div[3]/div/input")
    private WebElement arrivalTime;

    @FindBy(xpath = "//*[@id='vue-layout']/form/div[4]/input")
    private WebElement numberOfPassengers;

    @FindBy(xpath = "//*[@id='vue-layout']/form/div[1]/div[2]/div/ul/li[7]/button")
    private WebElement genceButton;

    @FindBy(xpath = "//*[@id=\"vue-layout\"]/form/div[2]/div[2]/div[2]/div[2]/div[1]/table/tbody/tr[3]/td[4]/span")
    private WebElement dateTime;

    @FindBy(xpath = "//*[@id=\"vue-layout\"]/form/button")
    private WebElement searchButton;

    @FindBy(xpath = "//*[@id=\"vue-layout\"]/form/div[2]/div[2]")
    private WebElement calendar;

    // @FindBy(xpath = "/html/body/header/div/div/div[1]/div[1]/div/div[1]/div")

    public void clickDepartureStation(String station) {
        departureButton.click();
    }

    public void clickDestinationStation() {
        wait.until(ExpectedConditions.elementToBeClickable(destinationStation)).click();
        wait.until(ExpectedConditions.elementToBeClickable(genceButton)).click();
    }
    public void clickDepartureTime() {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(departureTime));
            JavascriptExecutor js = (JavascriptExecutor) driver;

            js.executeScript("arguments[0].removeAttribute('readonly');", departureTime);
            departureTime.click();

            wait.until(ExpectedConditions.visibilityOf(calendar));

            wait.until(ExpectedConditions.elementToBeClickable(dateTime));
            js.executeScript("arguments[0].click();", dateTime);

        } catch (Exception e) {
            System.out.println("Element tapılmadı ya da klik edilə bilmədi: " + e.getMessage());
        }
    }




    public void clickSearchButton() {

        wait.until(ExpectedConditions.elementToBeClickable(searchButton)).click();
    }

    public void clickNumberOfPassengers() {
        //   wait.until(ExpectedConditions.elementToBeClickable(numberOfPassengers)).click();
    }
}
