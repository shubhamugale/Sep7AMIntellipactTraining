package pageobjects;

import org.openqa.selenium.By;
import resuable.BaseCode;

public class SearchPage extends BaseCode {

    public static String getTitleOfPage(){

       // driver.findElement(By.id("aravinth"));
       return driver.getTitle();
    }
}
