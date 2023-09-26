package pageobjects;

import org.openqa.selenium.By;
import resuable.BaseCode;

public class SalesForceLoginPage extends BaseCode {

    public static void enterUsername(String username){

       // driver.findElement(By.id("username")).sendKeys(username);

      //  driver.findElement(By.xpath("//div[@id='username_container']/child::input[1]")).sendKeys(username);

      //  driver.findElement(By.cssSelector("input[id='username']")).sendKeys(username);

        driver.findElement(By.cssSelector("#username")).sendKeys(username);
    }

    public static void clickLoginButton(){

        driver.findElement(By.id("Login")).click();
    }

    public static void enterPassword(String passwrod){

        driver.findElement(By.name("pw")).sendKeys(passwrod);

    }

    public static String getErrorMessage(){

       return driver.findElement(By.id("error")).getText();

    }

    public static String getValueFromTable(String text){
        return   driver.findElement(By.xpath("//td[normalize-space(text())='"+text+"']/following-sibling::td")).getText();
    }





}
