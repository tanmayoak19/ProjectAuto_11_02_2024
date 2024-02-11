package LocatorPages;

import UtilityFolder.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePageLocator extends BaseTest {

WebDriver driver;

public HomePageLocator(){
    super();
    driver  =   this.getDriver();
    PageFactory.initElements(driver,this);

}


    @FindBy(how = How.XPATH, using = "//div[@class='hero-left']//h1")
    public WebElement homePageHeading;

    @FindBy(how = How.XPATH, using = "//div[@class='main-header-grid']//a[@title='Entrata Home Page']")
    public WebElement homeTitle;

    @FindBy(how = How.XPATH, using = "//div[@class='cookie-button-holder']//*[contains(text(),'Accept Cookies')]")
    public WebElement acceptCookies;

    @FindBy(how = How.XPATH, using = "//div[@class='header-nav-item']//*[contains(text(),'Products')]")
    public WebElement productsOnNavBar;

    @FindBy(how = How.XPATH, using = "//div[@class='nav-group']//*[contains(text(),'Property Management')]")
    public WebElement propertyManagementOnNav;

    @FindBy(how = How.XPATH, using = "//div[@class=\"nav-group\"]//*[contains(text(),'Marketing & Leasing')]")
    public WebElement marketingAndLeaseOnNav;


    @FindBy(how = How.XPATH, using = "//div[@class='cookie-button-holder']//button[contains(text(),'Decline cookies')]")
    public WebElement declineCookies;


}
