package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.html.HTMLInputElement;
import utilities.Driver;

public class MainPage2 {


    public MainPage2() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
//    @FindBy(className="appointment-btn scrollto")
//    public WebElement makeAnAppointment;
   // @FindBy(xpath="//a[@class='d-flex align-items-center dropdown-toggle nav-link']") public  WebElement signInRegister;
    @FindBy(xpath="//li[@id='account-menu']") public  WebElement signInRegister2;

    @FindBy(xpath="//span[normalize-space()='Sign in']") public  WebElement signIn;
    @FindBy(xpath="//span[normalize-space()='Register']") public  WebElement register;

    @FindBy(xpath="//input[@id='ssn']") public  WebElement sSN;
    @FindBy(xpath = "//input[@class='is-touched is-dirty av-valid form-control']") public WebElement ssnValid;
    @FindBy(xpath="//input[@id='firstName']") public  WebElement firstName;
    @FindBy(xpath="//input[@id='lastName']") public  WebElement lastName;
    @FindBy(xpath="//input[@id='username']") public  WebElement username;
    @FindBy(xpath="//input[@id='email']") public  WebElement email;
    @FindBy(xpath="//input[@id='firstPassword']") public  WebElement newPassword;
    @FindBy(xpath="//input[@id='secondPassword']") public  WebElement newPasswordConfirmation;
    @FindBy(xpath="//button[@id='register-submit']//span[contains(text(),'Register')]") public  WebElement registerButton;


}
