package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewRoomPage extends BasePage {
    @FindBy ( xpath = "//div[@id='navbarSupportedContent']/div")
    public WebElement stepBilgisi;

    @FindBy ( xpath = "//h3[text() = 'Ev Tipi']")
    public WebElement evTipiBaslik;

    @FindBy ( xpath = "//p[text() = 'Odanız hangi ev türünde yer alıyor, belirtiniz.']")
    public WebElement evTipiAciklama;

    @FindBy ( xpath = "//small[text() = 'Müstakil Ev']/..")
    public WebElement mustakilEvSecenegi;

    @FindBy ( xpath = "//small[text() = 'Apartman Dairesi']/..")
    public WebElement apartmanDairesiSecenegi;

    @FindBy ( xpath = "//small[text() = 'Stüdyo Daire']/..")
    public WebElement studyoDaireSecenegi;

    @FindBy ( id = "flexRadioDefault1")
    public WebElement odamiKirayaVermekIstiyorumCheckBox;

    @FindBy ( id = "flexRadioDefault2")
    public WebElement karsilikliOdaDegisimiYapmakIstiyorumCheckBox;


}
