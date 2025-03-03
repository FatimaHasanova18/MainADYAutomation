package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class TestCalculationPage extends BasePage {
    private WebDriverWait wait;
    private JavascriptExecutor js;

    public TestCalculationPage() {
        super();
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(2));
    }

    @FindBy(xpath = "//*[@id=\"all_parts\"]/section/div/form/div[3]/div[2]/div/div[1]/div/app-quicksearch/div/comment()[1]")
    private WebElement departureCalculation;

    @FindBy(xpath = "//*[@id=\"all_parts\"]/section/div/form/div[1]/div[2]/div/div[4]/app-quicksearch/div/input")
    private WebElement arrivalCalculation;

    @FindBy(xpath = "//*[@id='all_parts']/section/div/form/div[2]/div[3]/div/div[1]/div/app-quicksearch/div")
    private WebElement cargoTypeCalculation;

    @FindBy(xpath = "//*[@id='all_parts']/section/div/form/div[2]/div[3]/div/div[2]/div/app-quicksearch/div")
    private WebElement cargoPersonCalculation;

    @FindBy(xpath = "//*[@id=\"all_parts\"]/section/div/form/div[3]/div[2]/div/div[1]/div/app-quicksearch/div/comment()[1]")
    private WebElement cargoNameCalculation;

    @FindBy(xpath = "//*[@id='all_parts']/section/div/form/div[3]/div[2]/div/div[2]/div/app-num-input/input")
    private WebElement cargoNumberCalculation;

    @FindBy(xpath = "//*[@id='all_parts']/section/div/form/div[3]/div[2]/div/div[3]/div/app-quicksearch/div")
    private WebElement cargoNationality;

    @FindBy(xpath = "//*[@id='all_parts']/section/div/form/div[3]/div[2]/div/div[4]/div/label[2]/span")
    private WebElement dangerousClick;

    @FindBy(xpath = "//*[@id='all_parts']/section/div/form/button")
    private WebElement calculateClickButton;

    private void enterText(WebElement element, String text) {
        try {
            // 1. Scroll edirik ki, element ekranda görünsün
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView(true);", element);
            Thread.sleep(500); // Qısa gecikmə

            // 2. Elementin kliklənməsini gözləyirik
            wait.until(ExpectedConditions.elementToBeClickable(element)).click();
            Thread.sleep(300); // Bəzi səhifələrdə klikdən sonra yavaş yüklənir

            // 3. `sendKeys()` ilə mətn yazmağa çalışırıq
            element.sendKeys(text + Keys.ENTER);

            // 4. Əgər mətn yazılmazsa, `JavascriptExecutor` ilə yazırıq
            if (!element.getAttribute("value").equals(text)) {
                js.executeScript("arguments[0].value = arguments[1];", element, text);
            }

        } catch (Exception e) {
            System.out.println("Error interacting with element: " + element + " - " + e.getMessage());
        }
    }

    public void departureCalculation(String departure) {
        enterText(departureCalculation, departure);
    }

    public void arrivalCalculation(String arrival) {
        enterText(arrivalCalculation, arrival);
    }

    public void cargoTypeCalculation(String type) {
        enterText(cargoTypeCalculation, type);
    }

    public void cargoPersonCalculation(String cargoPerson) {
        enterText(cargoPersonCalculation, cargoPerson);
    }

    public void cargoNameCalculation(String cargoName) {
        enterText(cargoNameCalculation, cargoName);
    }

    public void cargoNumberCalculation(String number) {
        enterText(cargoNumberCalculation, number);
    }

    public void nationalityCalculation(String nationality) {
        enterText(cargoNationality, nationality);
    }

    public void clickDangerousCheckbox() {
        try {
           // scrollToElement(dangerousClick);
            wait.until(ExpectedConditions.elementToBeClickable(dangerousClick)).click();
        } catch (Exception e) {
            System.out.println("Error clicking dangerous checkbox: " + e.getMessage());
        }
    }
}
