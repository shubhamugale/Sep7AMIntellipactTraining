package resuable;

import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ApplyWait extends BaseCode {

    public static void applyExplicitWait(int wait){

        WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(wait));
    }
}
