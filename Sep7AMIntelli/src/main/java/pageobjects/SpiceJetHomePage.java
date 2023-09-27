package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import resuable.BaseCode;

import java.time.Duration;

public class SpiceJetHomePage extends BaseCode {

    public static void clickFromDropdown(){
        driver.findElement(By.xpath("//span[@id='ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXTaction']/following-sibling::input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT']")).click();
    }

    public static void selectValueInFromDropdown(int ulIndex,int liIndex){
        driver.findElement(By.xpath("//div[@id='dropdownGroup1']/descendant::ul["+ulIndex+"]/child::li["+liIndex+"]")).click();
    }

    public static void clickSearch(){

        driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_ButtonSubmit")).click();
    }

    public static void clickCurrency(){

        try {
            driver.findElement(By.xpath("//a[contains(normalize-space(text()),'ency Conv')]")).click();
        }
        catch (TimeoutException s){
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(normalize-space(text()),'ency Conv')]")));
            driver.findElement(By.xpath("//a[contains(normalize-space(text()),'ency Conv')]")).click();
        }
    }


}
