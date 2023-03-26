package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.MainPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US001Steps {
    MainPage mainPage= new MainPage();
    @Given("Medunna ana sayfasina gider")
    public void medunna_ana_sayfasina_gider() throws InterruptedException {
        System.out.println(123);
        Driver.getDriver().get(ConfigReader.getProperties("url"));
        Thread.sleep(4000);
    }

    @And("Ana sayfa giris ikonuna tiklar")
    public void anaSayfaGirisIkonunaTiklar() {
        mainPage.signInRegister2.click();

    }

    @And("Register butonuna tiklar")
    public void registerButonunaTiklar() {
        mainPage.register.click();
    }

    @And("ssn kutusuna gecerli bir ssn girer")
    public void ssnKutusunaGecerliBirSsnGirer() {
        mainPage.sSN.sendKeys("123-45-6789");
    }

    @Then("hata mesajinin cikmadigini test eder")
    public void hataMesajininCikmadiginiTestEder() {
        Assert.assertTrue(mainPage.sSN.getAttribute("class").contains("valid"));

    }

    @And("tarayiciyi kapatir")
    public void tarayiciyiKapatir() {
        Driver.closeDriver();
    }
}
