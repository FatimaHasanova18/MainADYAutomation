package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderPage extends BasePage {
    public HeaderPage() {
        super();

    }

    @FindBy(xpath = "/html/body/header/div/div/div[1]/div[2]/nav/ul/li[1]")
    private WebElement tarifOdenisLink;

    public void tarifOdenisHeader() {
        tarifOdenisLink.click();
    }

    @FindBy(xpath = "/html/body/header/div/div/div[1]/div[2]/nav/ul/li[1]/ul/li[2]")
    private WebElement gedisHaqqi;

    public void gedisHaqqiLink() {
        gedisHaqqi.click();
    }

    @FindBy(xpath = "/html/body/header/div/div/div[1]/div[2]/nav/ul/li[1]/ul/li[3]")
    private WebElement odenisUsullari;

    public void odenisUsullariLink() {
        odenisUsullari.click();
    }

    @FindBy(xpath = "/html/body/header/div/div/div[1]/div[2]/nav/ul/li[1]/ul/li[4]")
    private WebElement biletSenedi;

    public void biletSenediLink() {
        biletSenedi.click();
    }

    @FindBy(xpath = "/html/body/header/div/div/div[1]/div[2]/nav/ul/li[1]/ul/li[5]")
    private WebElement biletReturn;

    public void biletReturnLink() {
        biletReturn.click();
    }

    @FindBy(xpath = "/html/body/header/div/div/div[1]/div[2]/nav/ul/li[1]/ul/li[6]")
    private WebElement elektronBilet;

    public void elektronBiletLink() {
        elektronBilet.click();
    }

    @FindBy(xpath = "/html/body/header/div/div/div[1]/div[2]/nav/ul/li[2]")
    private WebElement sernisinSInifleri;

    public void sernisinSInifleriLink() {
        sernisinSInifleri.click();
    }

    @FindBy(xpath = "/html/body/header/div/div/div[1]/div[2]/nav/ul/li[2]/ul/li[2]")
    private WebElement birinciSinif;

    public void birinciSinifLink() {
        birinciSinif.click();
    }

    @FindBy(xpath = "/html/body/header/div/div/div[1]/div[2]/nav/ul/li[2]/ul/li[3]")
    private WebElement biznesClass;

    public void biznesClassLink() {
        biznesClass.click();
    }

    @FindBy(xpath = "/html/body/header/div/div/div[1]/div[2]/nav/ul/li[2]/ul/li[4]")
    private WebElement standartPlus;

    public void standartPlusLink() {
        standartPlus.click();
    }

    @FindBy(xpath = "/html/body/header/div/div/div[1]/div[2]/nav/ul/li[2]/ul/li[5]")
    private WebElement standartSinif;

    public void standartSinifLink() {
        standartSinif.click();
    }

    @FindBy(xpath = "/html/body/header/div/div/div[1]/div[2]/nav/ul/li[3]")
    private WebElement dasimaQaydalari;

    public void dasimaQaydalariLink() {
        dasimaQaydalari.click();
    }

    @FindBy(xpath = "/html/body/header/div/div/div[1]/div[2]/nav/ul/li[3]/ul/li[2]")
    private WebElement usaqlarlaSeyahet;

    public void usaqlarlaSeyahetLink() {
        usaqlarlaSeyahet.click();
    }

    @FindBy(xpath = "/html/body/header/div/div/div[1]/div[2]/nav/ul/li[3]/ul/li[3]")
    private WebElement elYukleri;

    public void elYukleriLink() {
        elYukleri.click();
    }

    @FindBy(xpath = "/html/body/header/div/div/div[1]/div[2]/nav/ul/li[3]/ul/li[4]")
    private WebElement heyvanlarlaSeyahet;

    public void heyvanlarlaSeyahetLink() {
        heyvanlarlaSeyahet.click();
    }

}
