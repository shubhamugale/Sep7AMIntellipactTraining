package stepdefinationfile;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pageobjects.AmazonHomePage;
import pageobjects.SearchPage;
import pageobjects.SpiceJetHomePage;
import resuable.BaseCode;
import resuable.ReadExcel;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class AmazonSteps extends BaseCode {

    @Given("user navigates to amazon")
    public void naviagteUrl() throws IOException {

        BaseCode.launchBrowser();
   }

    @Given("user enter the {string} and click search icon")
    public void userEnterTheAndClickSearchIcon(String product) throws IOException {

        AmazonHomePage.enterProductName(ReadExcel.getDataFromExcel("Product",0,0));
        AmazonHomePage.clickSearchIcon();
    }

    @Then("Validate the title of page")
    public void validateTheTitleOfPage() {

        Assert.assertEquals("Amazon.in : iphone",SearchPage.getTitleOfPage());

//        if(SearchPage.getTitleOfPage().equals("Amazon.in : iphone")){
//            System.out.println("match");
//        }else{
//            System.out.println("not match");
//        }
    }

    @Given("user extracts the value from the categrogy dropdown")
    public void userExtractsTheValueFromTheCategrogyDropdown() {

        List<String> dropval = new ArrayList<>();
      //0 < 43
        for (int i = 0 ; i < AmazonHomePage.getCategoryDropdownCount() ;i++ ){
         String va = AmazonHomePage.getDropdownvalues(i);
           dropval.add(va);
        }

        for(String d :dropval){
            System.out.println(d);
        }

    }

    @Given("user selects the value from the category dropdown")
    public void userSelectsTheValueFromTheCategoryDropdown() {

        AmazonHomePage.selectCategoryByVisibleText("");
    }

    @Given("user clicks the babywishlist")
    public void userClicksTheBabywishlist() {

        Actions a = new Actions(driver);
        WebElement signInElement =driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        a.clickAndHold(signInElement).build().perform();
      //  driver.findElement(By.linkText("Baby Wishlist")).click();

        driver.findElement(By.partialLinkText("by Wish")).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));

        Set<String> winPro =driver.getWindowHandles();
        for(String wi:winPro){
            driver.switchTo().window(wi);
            System.out.println(driver.getTitle());
            if(driver.getTitle().equals("baby")){
              break;
            }
        }
        driver.switchTo().defaultContent();


    }

    @Given("user selects the value in from dropdown")
    public void userSelectsTheValueInFromDropdown() {

        SpiceJetHomePage.clickFromDropdown();
        SpiceJetHomePage.selectValueInFromDropdown(1,2);

    }

    @Given("user drag and drop the box")
    public void userDragAndDropTheBox() {

        WebElement frameElement = driver.findElement(By.className("demo-frame"));
        driver.switchTo().frame(frameElement);
        Actions action = new Actions(driver);

       WebElement source = driver.findElement(By.id("draggable"));
       WebElement target = driver.findElement(By.id("droppable"));

        action.dragAndDrop(source,target).build().perform();

         driver.switchTo().defaultContent();
    }

    @Given("User handles the table")
    public void userHandlesTheTable() {

        WebElement ey = driver.findElement(By.xpath("//table[@class='infobox vcard']"));

      //  ey.findElements(By.tagName("th")).size();
      List<WebElement> colOneElements =  ey.findElements(By.tagName("th"));
       List<String> colOnevalues = new ArrayList<String>();
      for(WebElement k:colOneElements){
          colOnevalues.add(k.getText());
      }
        System.out.println(colOnevalues);

      List<String> colTwovale = new ArrayList<String>();
        for (int i = 1 ; i <ey.findElements(By.tagName("td")).size();i++){
            colTwovale.add(ey.findElements(By.tagName("td")).get(i).getText());
        }
        System.out.println(colTwovale);

        WebElement v = driver.findElement(By.xpath("//table[@class='wikitable']"));
       List <WebElement> g= v.findElements(By.xpath("//tr//td[3]"));
       for (WebElement b:g){
           System.out.println(b.getText());
       }

    }
}
