package LocatorPages;

import UtilityFolder.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PropertyManagementPageLocator extends BaseTest {

    WebDriver driver;
    public PropertyManagementPageLocator(){
        super();
        driver  =   this.getDriver();
        PageFactory.initElements(driver,this);
    }


    @FindBy(how = How.XPATH, using = "//div[@class='product-text']//h1")
    public WebElement propertyManagementPageHeading;


    @FindBy(how = How.XPATH, using = "//div[@class='button-holder']//*[contains(text(),'Watch Demo')]")
    public WebElement watchDemoOnPropertyManagement;

    // Watch Demo form locators.

    @FindBy(how = How.XPATH, using = "//input[@name=\"FirstName\"]")
    public WebElement firstName;

    @FindBy(how = How.XPATH, using = "//input[@name=\"LastName\"]")
    public WebElement lastName;

    @FindBy(how = How.XPATH, using = "//input[@name=\"Email\"]")
    public WebElement email;

    @FindBy(how = How.XPATH, using = "//input[@name=\"Company\"]")
    public WebElement companyName;

    @FindBy(how = How.XPATH, using = "//input[@name=\"Phone\"]")
    public WebElement phone;

    @FindBy(how = How.XPATH, using = "//input[@name=\"Title\"]")
    public WebElement jobTitle;

    @FindBy(how = How.XPATH, using = "//select[@name=\"Unit_Count__c\"]")
    public WebElement unitCount;

}







