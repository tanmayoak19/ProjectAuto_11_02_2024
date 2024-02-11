package Scripts.MarketingAndLease;

import PageMethods.HomePage;
import PageMethods.MarketingAndLeasePage;
import UtilityFolder.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCaseTwo extends BaseTest {

    WebDriver driver;



HomePage homePage   =   new HomePage();
MarketingAndLeasePage marketingAndLeasePage =   new MarketingAndLeasePage();

    /*

    Test Case-2
    --------------------------------------------------------------------------------
    1:  Navigate to https://www.entrata.com/
    2:  Check that Page heading is displayed
    3:  Move to and assert the navigation Bar contents.
    4:  Navigate to Products and click on Management and Lease page
    5:  Assert that  Management and Lease page is displayed.
    6:  Scroll down to Request demo button and assert it is displayed properly
    --------------------------------------------------------------------------------

     */

    @Test(groups = "Marketing")
    public void navigateToMarketingAndLeasePage(){
        homePage.waitForElementsToBeVisible(homePage.acceptCookies).isDisplayed();
        String acceptCookies   =   homePage.waitForElementsToBeVisible(homePage.acceptCookies).getText();
        Assert.assertEquals(acceptCookies,"Accept Cookies");
        homePage.waitForElementsToBeVisible(homePage.acceptCookies).click();
        homePage.waitForElementsToBeVisible(homePage.homePageHeading).isDisplayed();
        Assert.assertTrue(waitForElementsToBeVisible(homePage.waitForElementToBeVisible(homePage.productsOnNavBar)).isDisplayed());
        homePage.moveToElement(homePage.productsOnNavBar).click();
        homePage.waitForElementsToBeVisible(homePage.marketingAndLeaseOnNav).isDisplayed();
        homePage.waitForElementsToBeVisible(homePage.marketingAndLeaseOnNav).click();
        String headingOfmarketingAndLeasePage    =   marketingAndLeasePage.waitForElementsToBeVisible(marketingAndLeasePage.marketingAndLeaseHeading).getText();
        Assert.assertEquals(headingOfmarketingAndLeasePage,"Marketing & Leasing");
        marketingAndLeasePage.scrollTo(marketingAndLeasePage.requestDemo);
        marketingAndLeasePage.waitForElementsToBeVisible(marketingAndLeasePage.requestDemo).isDisplayed();



    }





}
