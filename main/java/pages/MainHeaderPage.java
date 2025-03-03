package pages;

import io.cucumber.java.en.And;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainHeaderPage extends BasePage {
    public MainHeaderPage() {
        super();
    }

    @FindBy(xpath = "/html/body/header/div/div/div[1]/div[1]/nav/ul/li[1]")
    private WebElement korporativ;

    public void clickKorporativ() {
        korporativ.click();
    }

    @FindBy(xpath = "/html/body/header/div/div/div[1]/div[1]/nav/ul/li[2]")
    private WebElement sernisin;

    public void clickSernisin() {
        sernisin.click();
    }

    @FindBy(xpath = "/html/body/header/div/div/div[1]/div[1]/nav/ul/li[3]")
    private WebElement yukDasinma;

    public void clickYukDasinma() {
        yukDasinma.click();
    }

    @FindBy(xpath = "/html/body/header/div/div/div[1]/div[1]/nav/ul/li[4]")
    private WebElement media;

    public void clickmedia() {
        media.click();
    }

    @FindBy(xpath = "/html/body/header/div/div/div[1]/div[1]/nav/ul/li[5]")
    private WebElement blog;

    public void clickblog() {
        blog.click();
    }

    @FindBy(xpath = "/html/body/header/div/div/div[1]/div[1]/nav/ul/li[6]")
    private WebElement elaqe;

    public void clickElaqe() {
        elaqe.click();
    }

    @FindBy(xpath = "/html/body/header/div/div/div[1]/div[1]/div/div[1]")
    private WebElement changeLangugae;

    public void clickChangeLanguge() {
        changeLangugae.click();
    }

    @FindBy(xpath = "/html/body/header/div/div/div[1]/div[1]/div/div[1]/ul/li[1]")
    private WebElement english;

    public void clickEnglish() {
        english.click();
    }
}
