import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Deneme {
   public static WebDriver driver;
    public static void main(String[] args) {
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.get("http://amazon.com");
        //MainPage1 mainPage= new MainPage1();
        Driver dr= new Driver();
        Didi main = new Didi();

        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(option);
       driver.get("http://medunna.com");
       WebElement signInRegister = driver.findElement(By.xpath("//li[@id='account-menu']"));
        signInRegister.click();

        WebElement register= driver.findElement(By.xpath("//span[normalize-space()='Register']"));
        register.click();
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("First Name");


    }
}
