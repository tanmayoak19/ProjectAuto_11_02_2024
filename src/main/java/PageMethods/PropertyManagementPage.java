package PageMethods;

import LocatorPages.PropertyManagementPageLocator;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.IValue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class PropertyManagementPage extends PropertyManagementPageLocator {

    WebDriver driver;
    Select select;

    public PropertyManagementPage(){
        super();
        driver  =   this.getDriver();
    }


    //Method to select the value from dropdown in form
    public void selectFromUnitCount(String value){
        select  =   new Select(unitCount);
        select.selectByVisibleText(value);
    }


}
