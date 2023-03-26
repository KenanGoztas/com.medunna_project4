package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.MainPage2;
import utilities.Driver;

public class MyStepdefs {
    WebDriver driver = Driver.getDriver();
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
        mainPage2.sSN.sendKeys("234-56-1234");
    }

    @Then("hata mesajinin cikmadigini test eder")
    public void hataMesajininCikmadiginiTestEder() {
        System.out.println(123);
    }

    @And("tarayiciyi kapatir")
    public void tarayiciyiKapatir() {
        System.out.println(12345);
    }
}
