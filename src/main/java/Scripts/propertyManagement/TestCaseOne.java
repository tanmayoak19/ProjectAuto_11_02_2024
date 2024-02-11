package Scripts.propertyManagement;

import PageMethods.HomePage;
import PageMethods.PropertyManagementPage;
import UtilityFolder.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCaseOne extends BaseTest {

    WebDriver driver;


    HomePage homePage = new HomePage();
    PropertyManagementPage propertyManagementPage = new PropertyManagementPage();

    /*

    Test Case-1
    --------------------------------------------------------------------------------
    1:  Navigate to https://www.entrata.com/
    2:  Check that Page heading is displayed
    3:  Move to and assert the navigation Bar contents
    4:  Navigate to Products and click on Product management
    5:  Assert that product management page is displayed.
    --------------------------------------------------------------------------------

     */

    @Test(groups = "PropertyManagement")
    public void navigateToPropertyManagementPage() {
        homePage.waitForElementsToBeVisible(homePage.acceptCookies).isDisplayed();
        String acceptCookies = homePage.waitForElementsToBeVisible(homePage.acceptCookies).getText();
        Assert.assertEquals(acceptCookies, "Accept Cookies");
        homePage.waitForElementsToBeVisible(homePage.acceptCookies).click();
        homePage.waitForElementsToBeVisible(homePage.homePageHeading).isDisplayed();
        homePage.moveToElement(homePage.productsOnNavBar).click();
        homePage.waitForElementsToBeVisible(homePage.propertyManagementOnNav).isDisplayed();
        homePage.waitForElementsToBeVisible(homePage.propertyManagementOnNav).click();
        String propMgmtheader   =   propertyManagementPage.waitForElementsToBeVisible(propertyManagementPage.propertyManagementPageHeading).getText();
        Assert.assertEquals(propMgmtheader,"Property Management");
    }

 /*

    Test Case-3
    --------------------------------------------------------------------------------
    1:  Navigate to https://www.entrata.com/
    2:  Check that Page heading is displayed
    3:  Move to and assert the navigation Bar contents
    4:  Navigate to Products and click on Product management
    5:  Assert that product management page is displayed.

    ******* Note this TC-3 is dependent on the TC-1 ******

    6:  Click on watch Demo button
    7:  Fill all the detail in the form mentioned.

    --------------------------------------------------------------------------------

     */

    @Test(groups = "PropertyManagement", dependsOnMethods = {"navigateToPropertyManagementPage"})
    public void clickOnWatchDemoInPropertyManagement() {

        propertyManagementPage.waitForElementsToBeVisible(propertyManagementPage.propertyManagementPageHeading).isDisplayed();
        propertyManagementPage.waitForElementsToBeVisible(propertyManagementPage.watchDemoOnPropertyManagement).isDisplayed();
        propertyManagementPage.waitForElementsToBeVisible(propertyManagementPage.watchDemoOnPropertyManagement).click();
        propertyManagementPage.waitForElementsToBeVisible(propertyManagementPage.firstName).sendKeys("Test");
        propertyManagementPage.waitForElementsToBeVisible(propertyManagementPage.lastName).sendKeys("User-1");
        propertyManagementPage.waitForElementsToBeVisible(propertyManagementPage.email).sendKeys("Test@123");
        propertyManagementPage.waitForElementsToBeVisible(propertyManagementPage.companyName).sendKeys("TestCompany");
        propertyManagementPage.waitForElementsToBeVisible(propertyManagementPage.phone).sendKeys("1234567890");
        propertyManagementPage.selectFromUnitCount("1 - 10");
        propertyManagementPage.waitForElementsToBeVisible(propertyManagementPage.jobTitle).sendKeys("Tester");
        System.out.println("Form is filled properly");

    }


}
