package UtilityFolder;

import DriverSetup.DriverInit;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import javax.swing.*;
import java.time.Duration;
import java.util.List;

import static java.awt.SystemColor.window;

public class BaseTest extends DriverInit {

    WebDriver driver;

    //Initialized the Base class constructor and passed the driver from Driver Init class.
    public BaseTest(){
        driver=getDriver();
    }

    WebDriverWait wait  =   new WebDriverWait(getDriver(),Duration.ofMillis(100));


    @BeforeSuite(alwaysRun = true)
    // Method to navigate to the URL
    public void navigateToUrl() {
        driver.get("https://www.entrata.com/");
        driver.manage().window().maximize();
        System.out.println("Navigated to Entrata.com");
    }

   // @AfterSuite
    public void closeDriver(){
        close();
    }

    //Explicit wait (Wait for specific element by selector value)
    public WebElement waitForPresenceOfElement(By selector){
        WebElement element = wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.presenceOfElementLocated(selector));
        return element;
    }


    //Explicit wait (Wait for specific web element and return element)
    public WebElement waitForElementToBeVisible(WebElement element){
        wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOf(element));
        return element;
    }

    //Explicit wait (Wait for specific web element and return web element)
    public WebElement waitForElementToBeVisible(By element){
        WebElement webElement= wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(element));
        return webElement;
    }



    //Explicit wait (Wait for all web elements and return element)
    public WebElement waitForElementsToBeVisible(WebElement elements){
        wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfAllElements(elements));
        return elements;
    }


    public WebElement moveToElement(WebElement element){
      new Actions(driver).moveToElement(element).build().perform();
      return element;
    }


    public JavascriptExecutor js ;


    public WebElement scrollTo(WebElement element){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView()",element);
        return element;
    }








}
