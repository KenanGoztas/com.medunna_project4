package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.WebDriver;
import pages.MainPage2;
import utilities.Driver;

public class MyStepdefs {
    WebDriver driver= Driver.getDriver();
    MainPage2 mainPage2= new MainPage2();
    @Given("Medunna ana sayfasina gider")
    public void medunnaAnaSayfasinaGider() {
        driver.get("http://medunna.com");

    }
    @And("Ana sayfa giris ikonuna tiklar")
    public void anaSayfaGirisIkonunaTiklar() {
        mainPage2.signInRegister2.click();
    }

    @And("Register butonuna tiklar")
    public void registerButonunaTiklar() {
        mainPage2.register.click();
    }

    @And("ssn kutusuna gecerli bir ssn girer")
    public void ssnKutusunaGecerliBirSsnGirer() {
        mainPage2.sSN.sendKeys("123-45-6789");
    }

    @Then("hata mesajinin cikmadigini test eder")
    public void hataMesajininCikmadiginiTestEder() {

        Assert.assertTrue(mainPage2.ssnValid.isDisplayed());
    }

    @And("tarayiciyi kapatir")
    public void tarayiciyiKapatir() {

        Driver.closeDriver();
    }
}
