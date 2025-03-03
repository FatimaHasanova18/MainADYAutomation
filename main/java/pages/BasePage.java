package pages;

import reportConfig.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public WebDriver driver;
    public JavascriptExecutor js;

    public BasePage() {
        this.driver = WebDriverManager.getChromeDriver();
        this.js = (JavascriptExecutor) driver;
        PageFactory.initElements(driver, this);
    }

}
