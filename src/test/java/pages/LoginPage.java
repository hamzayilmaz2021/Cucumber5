package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy ( name = "email")
    public WebElement emailInput;

    @FindBy ( name = "sifre")
    public WebElement sifreInput;

    @FindBy ( xpath = "//a[text() = 'Şifremi Unuttum']")
    public WebElement sifremiUnuttumLink;

}
