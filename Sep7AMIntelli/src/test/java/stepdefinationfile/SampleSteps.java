package stepdefinationfile;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import resuable.BaseCode;

public class SampleSteps extends BaseCode {

@Given("xyz")
public void m1() {

    Assert.assertEquals("Amazon: BestSeller",driver.getTitle());
}

}
