package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.HomePage;
import utilities.Driver;

public class US001_StepDef {

    HomePage page = new HomePage();

    @Given("kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String adres) {
        Driver.getDriver().get(adres);
    }

    @Then("kullanici seyahatin tadini cikartin yazisinin gorunur oldugunu dogrular")
    public void kullaniciSeyahatinTadiniCikartinYazisininGorunurOldugunuDogrular() {
        boolean isDisplayed =  page.seyahatinTadiniCikartin.isDisplayed();
        Assert.assertTrue(isDisplayed);
    }
}
