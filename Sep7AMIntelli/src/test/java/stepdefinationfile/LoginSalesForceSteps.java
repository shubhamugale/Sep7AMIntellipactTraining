package stepdefinationfile;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import pageobjects.SalesForceLoginPage;
import resuable.BaseCode;
import resuable.ReadExcel;

import java.io.FileNotFoundException;
import java.io.IOException;

public class LoginSalesForceSteps {


@Given("user navigates to salesforce login page")
    public void loginPage() throws IOException {

    BaseCode.launchBrowser();

}


    @And("user clicks on login button")
    public void clickLoginButton() {

        SalesForceLoginPage.clickLoginButton();
    }

    @Then("user should navigate to homepage")
    public void validateHomepage() {

    }

    @Then("user validate the error message")
    public void validateError() {


 //   Assert.assertEquals("check your username and password. If you still can't log in, contact your Salesforce administrator.",SalesForceLoginPage.getErrorMessage());


    if(SalesForceLoginPage.getErrorMessage().equals("Please check your username and password. If you still can't log in, contact your Salesforce administrator.")){

       Assert.assertTrue(true);
    }
    else{
        Assert.assertTrue(false);
    }

    }

    @When("user enters the username {string} and password {string}")
    public void enterCredi(String a, String b) throws IOException {

        SalesForceLoginPage.enterUsername(ReadExcel.getDataFromExcel("logindetails",0,0));

        SalesForceLoginPage.enterPassword(ReadExcel.getDataFromExcel("logindetails",1,0));

    }






}
