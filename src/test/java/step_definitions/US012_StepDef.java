package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.LoginPage;
import utilities.Driver;

public class US012_StepDef {

    LoginPage page = new LoginPage();

    @Then("kullanici {string} linkinin aktif ve gorunur oldugunu dogrular")
    public void kullaniciLinkininAktifVeGorunurOldugunuDogrular(String arg0) {
        Assert.assertTrue(page.sifremiUnuttumLink.isDisplayed());
        Assert.assertTrue(page.sifremiUnuttumLink.isEnabled());
    }

    @Then("kullanici {string} linkinin alti cizili oldugunu dogrular")
    public void kullaniciLinkininAltiCiziliOldugunuDogrular(String arg0) {
        String cssValue = page.sifremiUnuttumLink.getCssValue("text-decoration");
        Assert.assertTrue( cssValue.contains("underline"));
    }

    @And("kullanici {string} linkine tiklar")
    public void kullaniciLinkineTiklar(String arg0) {
        page.sifremiUnuttumLink.click();
    }

    @Then("kullanici sayfa adresinin {string} ifadesini icerdigini dogrular")
    public void kullaniciSayfaAdresininIfadesiniIcerdiginiDogrular(String endPoint) {
        String currentUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(currentUrl.contains(endPoint));
    }
}
