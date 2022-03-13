package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.LoginPage;
import pages.NewRoomPage;
import utilities.BrowserUtilities;

public class US056_StepDef {

    LoginPage loginPage = new LoginPage();
    NewRoomPage newRoomPage = new NewRoomPage();

    @Given("kullanici {string} ve {string} bilgileri ile sisteme giris yapar")
    public void kullaniciVeBilgileriIleSistemeGirisYapar(String email, String sifre) {
        loginPage.emailInput.sendKeys(email);
        loginPage.sifreInput.sendKeys(sifre + Keys.ENTER);

        BrowserUtilities.waitFor(5);
    }

    @Then("kullanici ev tipi basliginin gorunur oldugunu dogrular")
    public void kullaniciEvTipiBasligininGorunurOldugunuDogrular() {
        Assert.assertTrue(newRoomPage.evTipiBaslik.isDisplayed());
    }

    @Then("kullanici ev tipi aciklamasinin gorunur oldugunu dogrular")
    public void kullaniciEvTipiAciklamasininGorunurOldugunuDogrular() {
        Assert.assertTrue(newRoomPage.evTipiAciklama.isDisplayed());
    }

    @Then("kullanici ev tipi seceneklerinin gorunur oldugunu dogrular")
    public void kullaniciEvTipiSeceneklerininGorunurOldugunuDogrular() {
        Assert.assertTrue(newRoomPage.mustakilEvSecenegi.isDisplayed());
        Assert.assertTrue(newRoomPage.apartmanDairesiSecenegi.isDisplayed());
        Assert.assertTrue(newRoomPage.studyoDaireSecenegi.isDisplayed());
    }

    @And("kullanici mustakil ev secenegine tiklar")
    public void kullaniciMustakilEvSecenegineTiklar() {
        newRoomPage.mustakilEvSecenegi.click();
    }

    @And("kullanici mustakil ev seceneginin secili oldugunu dogrular")
    public void kullaniciMustakilEvSecenegininSeciliOldugunuDogrular() {
        String cssValue = newRoomPage.mustakilEvSecenegi.getCssValue("border-color");
        Assert.assertEquals("rgb(255, 193, 7)", cssValue);
    }

    @And("kullanici apartman dairesi secenegine tiklar")
    public void kullaniciApartmanDairesiSecenegineTiklar() {
        newRoomPage.apartmanDairesiSecenegi.click();
    }

    @And("kullanici apartman dairesi seceneginin secili oldugunu dogrular")
    public void kullaniciApartmanDairesiSecenegininSeciliOldugunuDogrular() {
        String cssValue = newRoomPage.apartmanDairesiSecenegi.getCssValue("border-color");
        Assert.assertEquals("rgb(255, 193, 7)", cssValue);
    }

    @And("kullanici studyo daire secenegine tiklar")
    public void kullaniciStudyoDaireSecenegineTiklar() {
        newRoomPage.studyoDaireSecenegi.click();
    }

    @And("kullanici studyo daire seceneginin secili oldugunu dogrular")
    public void kullaniciStudyoDaireSecenegininSeciliOldugunuDogrular() {
        String cssValue = newRoomPage.studyoDaireSecenegi.getCssValue("border-color");
        Assert.assertEquals("rgb(255, 193, 7)", cssValue);
    }

    @And("kullanici odami kiraya vermek istiyorum secenegine tiklar")
    public void kullaniciOdamiKirayaVermekIstiyorumSecenegineTiklar() {
        newRoomPage.odamiKirayaVermekIstiyorumCheckBox.click();
    }

    @And("kullanici odami kiraya vermek istiyorum seceneginin secili oldugunu dogrular")
    public void kullaniciOdamiKirayaVermekIstiyorumSecenegininSeciliOldugunuDogrular() {
        newRoomPage.odamiKirayaVermekIstiyorumCheckBox.isSelected();
    }

    @And("kullanici karsilikli oda degisimi yapmak istiyorum secenegine tiklar")
    public void kullaniciKarsilikliOdaDegisimiYapmakIstiyorumSecenegineTiklar() {
        newRoomPage.karsilikliOdaDegisimiYapmakIstiyorumCheckBox.click();
    }

    @And("kullanici karsilikli oda degisimi yapmak istiyorum seceneginin secili oldugunu dogrular")
    public void kullaniciKarsilikliOdaDegisimiYapmakIstiyorumSecenegininSeciliOldugunuDogrular() {
        newRoomPage.karsilikliOdaDegisimiYapmakIstiyorumCheckBox.isSelected();
    }

    @Then("kullanici step durumu bilgisinin {string} oldugunu dogrular")
    public void kullaniciStepDurumuBilgisininOldugunuDogrular(String bilgi) {
        System.out.println(newRoomPage.stepBilgisi.getText());
        Assert.assertTrue(newRoomPage.stepBilgisi.getText().contains(bilgi));
    }
}
