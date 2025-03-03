package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage{
    public SearchPage() {
        super();
    }

    @FindBy(xpath = "/html/body/header/div/div/div[1]/div[2]/form/label")
    private WebElement searchIcon;

    @FindBy(xpath = "/html/body/header/div/div/div[1]/div[2]/form/div/input")
    private WebElement searchInput;

    public void getSearchIcon() {
        searchIcon.click();
    }
    public void getSearchInput(String text) {
        searchInput.click();
        searchInput.sendKeys(text);
    }
}
