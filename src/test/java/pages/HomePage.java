package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePage {

    @FindBy ( xpath = "//h1[text() = 'Seyahatin Tadını Çıkartın!']")
    public WebElement seyahatinTadiniCikartin;


}
