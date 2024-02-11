package PageMethods;

import LocatorPages.MarketingAndLeaseLocator;
import org.openqa.selenium.WebDriver;

public class MarketingAndLeasePage extends MarketingAndLeaseLocator {

    WebDriver driver;
    public MarketingAndLeasePage(){
        super();
        driver  = this.getDriver();
    }



}
