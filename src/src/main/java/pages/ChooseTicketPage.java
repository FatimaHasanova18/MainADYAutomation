package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ChooseTicketPage extends BasePage {
    public ChooseTicketPage() {
        super();
    }

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    @FindBy(xpath = "//*[@id=\"all_parts\"]/section[2]/div/ul/li[1]")
    private WebElement twentyeightFebTicket;
    @FindBy(xpath = "//*[@id=\"all_parts\"]/section[2]/div/ul/li[2]")
    private WebElement firstMarchTicket;
    @FindBy(xpath = "//*[@id=\"all_parts\"]/section[2]/div/ul/li[3]")
    private WebElement secondMarchTicket;
    @FindBy(xpath = "//*[@id=\"all_parts\"]/section[2]/div/ul/li[4]")
    private WebElement thirdMarchTicket;
    @FindBy(xpath = "//*[@id=\"all_parts\"]/section[2]/div/ul/li[5]")
    private WebElement fourthMarchTicket;
    @FindBy(xpath = "//*[@id=\"all_parts\"]/section[2]/div/ul/li[6]")
    private WebElement fifthMarchTicket;
    @FindBy(xpath = "//*[@id=\"all_parts\"]/section[2]/div/ul/li[7]")
    private WebElement sixthMarchTicket;
    @FindBy(xpath = "//*[@id=\"all_parts\"]/section[3]/div/div/div[3]/ul[1]/li[2]")
    private WebElement standartplusTicket;
    @FindBy(xpath = "//*[@id=\"all_parts\"]/section[3]/div/div/div[3]/ul[1]/li[3]")
    private WebElement businessTicket;
    @FindBy(xpath = "//*[@id=\"all_parts\"]/section[3]/div/div/div[3]/ul[1]/li[4]")
    private WebElement firstclassTicket;
    @FindBy(xpath = "//*[@id=\"all_parts\"]/section[3]/div/div[1]/div[3]/a")
    private WebElement getTicket;
    @FindBy(xpath = "//*[@id=\"all_parts\"]/section/div/div[3]/div[3]/div[2]/div/div/div[2]/div[1]/div[1]/ul[1]/li")
    private WebElement suit6;
    @FindBy(xpath = "//*[@id=\"all_parts\"]/section/div/div/div[1]/div[2]/a")
    private WebElement choosesuit;
    @FindBy(xpath = "//*[@id=\"all_parts\"]/section/div/div[4]")
    private WebElement totalAmountBtn;
    @FindBy(id = "payment1")
    private WebElement azeriCardRadioBtn;
    @FindBy(id = "agreement")
    private WebElement agreementBtn;
    @FindBy(id = "agreement2")
    private WebElement agreement2Btn;
    @FindBy(xpath = "//*[@id=\"all_parts\"]/section/div/div[5]/button")
    private WebElement paymentBtn;

    public void clickPaymentBtn() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", paymentBtn);

        try {
            Thread.sleep(1000); // Kiçik gözləmə
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        wait.until(ExpectedConditions.elementToBeClickable(paymentBtn));

        js.executeScript("arguments[0].click();", paymentBtn);
        // paymentBtn.click();
    }

    public void clickAgreementBtn2() {
        // agreement2Btn.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", agreement2Btn);

        try {
            Thread.sleep(1000); // Kiçik gözləmə
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        wait.until(ExpectedConditions.elementToBeClickable(agreement2Btn));


        js.executeScript("arguments[0].click();", agreement2Btn);
    }

    public void clickAgrreementBtn() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", agreementBtn);

        try {
            Thread.sleep(1000); // Kiçik gözləmə
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        wait.until(ExpectedConditions.elementToBeClickable(agreementBtn));

        js.executeScript("arguments[0].click();", agreementBtn);
        // agreementBtn.click();
    }

    public void clickAzericart() {
        //azeriCardRadioBtn.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", azeriCardRadioBtn);

        try {
            Thread.sleep(1000); // Kiçik gözləmə
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        wait.until(ExpectedConditions.elementToBeClickable(azeriCardRadioBtn));


        js.executeScript("arguments[0].click();", azeriCardRadioBtn);
    }

    public void clickTotalAmountBtn() {
        totalAmountBtn.click();
    }

    public void clickChooseSuit() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", choosesuit);

        try {
            Thread.sleep(1000); // Kiçik gözləmə
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Elementin klik edilə biləcəyini gözləyirik
        wait.until(ExpectedConditions.elementToBeClickable(choosesuit));

        // JavaScript ilə klik edirik
        js.executeScript("arguments[0].click();", choosesuit);
        // choosesuit.click();
    }

    public void clicktSuit6() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", suit6);

        try {
            Thread.sleep(1000); // Kiçik gözləmə
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Elementin klik edilə biləcəyini gözləyirik
        wait.until(ExpectedConditions.elementToBeClickable(suit6));

        // JavaScript ilə klik edirik
        js.executeScript("arguments[0].click();", suit6);
        // choosesuit.click();
        // suit6.click();
    }

    public void clickTwentyFebTicket() {
        twentyeightFebTicket.click();
    }

    public void clickFirstMarchTicket() {
        wait.until(ExpectedConditions.elementToBeClickable(firstMarchTicket)); // Elementin klik edilə biləcəyinə əmin olun
        firstMarchTicket.click(); // Klikləyirik
    }

    public void clickSecondMarchTicket() {
        wait.until(ExpectedConditions.elementToBeClickable(secondMarchTicket));
        secondMarchTicket.click();

    }

    public void clickThirdMarchTicket() {
        wait.until(ExpectedConditions.elementToBeClickable(thirdMarchTicket));
        thirdMarchTicket.click();
    }

    public void clickFourthMarchTicket() {
        wait.until(ExpectedConditions.elementToBeClickable(fourthMarchTicket));
        fourthMarchTicket.click();
    }

    public void clickFifthMarchTicket() {
        wait.until(ExpectedConditions.elementToBeClickable(fifthMarchTicket));
        fifthMarchTicket.click();
    }

    public void clickSixthMarchTicket() {
        wait.until(ExpectedConditions.elementToBeClickable(sixthMarchTicket));
        sixthMarchTicket.click();
    }

    public void clickStandartplusTicket() {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("full-page-loader")));

        wait.until(ExpectedConditions.elementToBeClickable(standartplusTicket));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", standartplusTicket);
    }

    public void clickBusinessTicket() {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("full-page-loader")));

        wait.until(ExpectedConditions.elementToBeClickable(businessTicket));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", businessTicket);
    }


    public void clickFirstClassTicket() {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("full-page-loader")));

        wait.until(ExpectedConditions.elementToBeClickable(firstclassTicket));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", firstclassTicket);
    }

    public void clickGetTicket() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", getTicket);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        wait.until(ExpectedConditions.elementToBeClickable(getTicket));
        js.executeScript("arguments[0].click();", getTicket);
    }
}
