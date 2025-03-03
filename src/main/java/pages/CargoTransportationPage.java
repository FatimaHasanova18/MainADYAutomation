package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CargoTransportationPage extends BasePage {
    private WebDriverWait wait;

    public CargoTransportationPage() {
        super();
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(2));

    }

    @FindBy(xpath = "//*[@id=\"vue-layout\"]/section[1]/div/div[2]/form/div/div[1]/div[1]/input")
    private WebElement cargoTransportationDeparture;
    @FindBy(xpath = "//*[@id=\"vue-layout\"]/section[1]/div/div[2]/form/div/div[1]/div[2]/input")
    private WebElement cargoTransportationDestination;
    @FindBy(xpath = "//*[@id=\"vue-layout\"]/section[1]/div/div[2]/form/div/div[2]/input")
    private WebElement cargoTransportationType;
    @FindBy(xpath = "//*[@id=\"vue-layout\"]/section[1]/div/div[2]/form/div/button")
    private WebElement cargoTransportationButton;
    @FindBy(xpath = "//*[@id=\"vue-layout\"]/section[1]/div/div[2]/form/div/div[2]/ul/li[1]")
    private WebElement conteyner;

    public void chooseConteyner() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement conteynerClickable = wait.until(ExpectedConditions.elementToBeClickable(conteyner));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView(true);", conteynerClickable);

        wait.until(ExpectedConditions.elementToBeClickable(conteynerClickable));
        conteynerClickable.click();
    }


    public void clickCargoTransportationType() {
        cargoTransportationType.click();
    }

    public void setCargoTransportationDeparture(String station1) {
        wait.until(ExpectedConditions.visibilityOf(cargoTransportationDeparture));
        cargoTransportationDeparture.sendKeys(station1);
        cargoTransportationDeparture.sendKeys(Keys.ENTER);
    }

    public void setCargoTransportationDestionation(String station1) {
        wait.until(ExpectedConditions.visibilityOf(cargoTransportationDestination));
        cargoTransportationDestination.sendKeys(station1);
        cargoTransportationDestination.sendKeys(Keys.ENTER);
    }


    public void clickCargoTransportationButton() {
        cargoTransportationButton.click();
    }
}
