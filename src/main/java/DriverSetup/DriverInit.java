package DriverSetup;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class DriverInit {

    public static WebDriver driver;

    public DriverInit() {
        if(driver   ==  null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
    }
    public static WebDriver getDriver(){
        return driver;
    }

    public static void close(){
        driver.quit();
    }



}





