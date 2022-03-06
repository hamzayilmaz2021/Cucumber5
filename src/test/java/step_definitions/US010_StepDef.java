package step_definitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.LoginPage;

public class US010_StepDef {

    LoginPage page = new LoginPage();

    @Then("kullanici login sayfasinda email inputunun kullanilabilir oldugunu dogrular")
    public void kullaniciLoginSayfasindaEmailInputununKullanilabilirOldugunuDogrular() {
        boolean isEnabled = page.emailInput.isEnabled();

        Assert.assertTrue(isEnabled);

        //inputun içerisine yazı yaz
        page.emailInput.sendKeys("mail@gmail.com");

        //inputun içerisindeki yazıyı kontrol et
        String text = page.emailInput.getAttribute("value");

        Assert.assertEquals("mail@gmail.com", text);
    }

    @Then("kullanici login sayfasinda password inputunun kullanilabilir oldugunu dogrular")
    public void kullaniciLoginSayfasindaPasswordInputununKullanilabilirOldugunuDogrular() {

        boolean isEnabled = page.sifreInput.isEnabled();

        Assert.assertTrue(isEnabled);

        //inputun içerisine yazı yaz
        page.sifreInput.sendKeys("sifre");

        //inputun içerisindeki yazıyı kontrol et
        String text = page.sifreInput.getAttribute("value");

        Assert.assertEquals("sifre", text);

    }

    @Then("kullanici login sayfasinda email inputunun placeholder degerinin {string} oldugunu dogrular")
    public void kullaniciLoginSayfasindaEmailInputununPlaceholderDegerininOldugunuDogrular(String value) {
        String placeHolder = page.emailInput.getAttribute("placeholder");
        Assert.assertEquals(value, placeHolder);
    }

    @Then("kullanici login sayfasinda password inputunun placeholder degerinin {string} oldugunu dogrular")
    public void kullaniciLoginSayfasindaPasswordInputununPlaceholderDegerininOldugunuDogrular(String value) {
        String placeHolder = page.sifreInput.getAttribute("placeholder");
        Assert.assertEquals(value, placeHolder);
    }

}
