package pageobjects;

import org.openqa.selenium.By;
import resuable.BaseCode;

public class SpiceJetHomePage extends BaseCode {

    public static void clickFromDropdown(){
        driver.findElement(By.xpath("//span[@id='ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXTaction']/following-sibling::input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT']")).click();
    }

    public static void selectValueInFromDropdown(int ulIndex,int liIndex){
        driver.findElement(By.xpath("//div[@id='dropdownGroup1']/descendant::ul["+ulIndex+"]/child::li["+liIndex+"]")).click();
    }


}
