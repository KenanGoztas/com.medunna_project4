package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MainPage {
    public MainPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(className="appointment-btn scrollto")
    public WebElement makeAnAppointment;
    @FindBy(xpath="//a[@class='d-flex align-items-center dropdown-toggle nav-link']") public static WebElement signInRegister;
    @FindBy(xpath="//li[@id='account-menu']") public static WebElement signInRegister2;

    @FindBy(xpath="//span[normalize-space()='Sign in']") public static WebElement signIn;
    @FindBy(xpath="//span[normalize-space()='Register']") public static WebElement register;

    @FindBy(xpath="//input[@id='ssn']") public static WebElement sSN;
    @FindBy(xpath="//input[@id='firstName']") public static WebElement firstName;
    @FindBy(xpath="//input[@id='lastName']") public static WebElement lastName;
    @FindBy(xpath="//input[@id='username']") public static WebElement username;
    @FindBy(xpath="//input[@id='email']") public static WebElement email;
    @FindBy(xpath="//input[@id='firstPassword']") public static WebElement newPassword;
    @FindBy(xpath="//input[@id='secondPassword']") public static WebElement newPasswordConfirmation;
    @FindBy(xpath="//button[@id='register-submit']//span[contains(text(),'Register')]") public static WebElement registerButton;


}
