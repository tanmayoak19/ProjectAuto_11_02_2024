package PageMethods;

import LocatorPages.HomePageLocator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePage extends HomePageLocator {
    WebDriver driver;

    public HomePage(){
        super();
        driver  =   this.getDriver();
    }


//    public void navigate(){
//        navigateToUrl();
//    }


    public void openWatchDemoButton(){

    }

//    public void tearDown(){
//        closeDriver();
//    }


}


