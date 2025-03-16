package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends BasePage {
    public LoginPage() {
        //super();
    }

    @FindBy(xpath = "/html/body/header/div/div/div[2]/a/img")
    private WebElement profileImage;

    @FindBy(css = "#login_form_by_email > div:nth-child(4) > input")
    private WebElement emailinput;

    @FindBy(css = "#login_form_by_email > div.form-group.form-group--password.mb-0 > div > input")
    private WebElement passwordinput;

    @FindBy(id = "login_by_email")
    private WebElement loginbtn;
    @FindBy(xpath = "//a[@class='header__logo']")
    private WebElement logo;

    public void clickLoginButton() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", profileImage);
    }

    public void clickEmailInput() {
        emailinput.click();
        emailinput.sendKeys("test");
    }

    public void clickPasswordInput() {
        passwordinput.click();
        passwordinput.sendKeys("Test25");
    }

    public void clickLogin() {
        loginbtn.click();
    }

    public void homepage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(logo));
        element.click();
    }

}


