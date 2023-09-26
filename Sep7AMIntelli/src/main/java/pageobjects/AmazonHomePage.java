package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import resuable.BaseCode;

public class AmazonHomePage extends BaseCode {

    private static Select selectCategory;
    private static WebElement categoryElement = driver.findElement(By.id("searchDropdownBox"));
    public static void enterProductName(String productName){

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(productName + Keys.ENTER);
    }

    public static void clickSearchIcon(){

        driver.findElement(By.id("nav-search-submit-button")).click();
    }

    public static int getCategoryDropdownCount(){
        return categoryElement.findElements(By.tagName("option")).size();

    }

    public static String getDropdownvalues(int i){
       return categoryElement.findElements(By.tagName("option")).get(i).getText();
    }
    public static void selectCategoryByIndex(int index){
        Select selectCategory = new Select(categoryElement);
        selectCategory.selectByIndex(index);

    }
    public static void selectCategoryByVisibleText(String text){
        Select selectCategory = new Select(categoryElement);
        selectCategory.selectByVisibleText(text);
    }
    public static void selectCategoryByValue(String value){
        select();
        selectCategory.selectByValue(value);

    }

    public static void select(){

        selectCategory = new Select(categoryElement);

        driver.findElement(By.xpath("//label[text()='Username']"));

    }

    public static String getValueFromTable(int columnIndex){

       return driver.findElement(By.xpath("//table[@class='wikitable']//tr//td["+columnIndex+"]")).getText();
    }

    public static String getValueFromTable(int rowIndex, int couInd){

       return driver.findElement(By.xpath("//table[@class='wikitable']//tr["+rowIndex+"]//td["+couInd+"]")).getText();
    }

    public static String getValueFromTable(String text){
      return   driver.findElement(By.xpath("//td[normalize-space(text())='"+text+"']/following-sibling::td")).getText();
    }



}
