package LocatorPages;

import UtilityFolder.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MarketingAndLeaseLocator extends BaseTest {

    WebDriver driver;
    public MarketingAndLeaseLocator(){
        super();
        driver  =   this.getDriver();
        PageFactory.initElements(driver,this);
}


    @FindBy(how = How.XPATH, using = " //div[@class='product-text']//h1")
    public WebElement marketingAndLeaseHeading;


    @FindBy(how = How.XPATH, using = " //div[@class=\"double-link\"]//*[contains(text(),'Request Demo')]")
    public WebElement requestDemo;


}
