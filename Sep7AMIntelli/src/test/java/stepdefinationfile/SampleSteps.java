package stepdefinationfile;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import resuable.BaseCode;

public class SampleSteps extends BaseCode {

@Given("xyz")
public void m1() {

    Assert.assertEquals("Press a button",driver.switchTo().alert().getText());
    driver.switchTo().alert().accept();
    driver.switchTo().alert().sendKeys("");

   Boolean oneway= driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_OneWay")).isSelected();

    Assert.assertTrue(oneway);

    Boolean ena =driver.findElement(By.id("custom_date_picker_id_2")).isEnabled();

    Assert.assertFalse(ena);

    driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_LabelMarketStation1")).isDisplayed();
}

}
