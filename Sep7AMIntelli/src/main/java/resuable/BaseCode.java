package resuable;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseCode {

    public static WebDriver driver;
    public static Properties prob;
    public static void launchBrowser() throws IOException {

     FileInputStream fis = new FileInputStream(new File("src/main/resources/configuration/utility.properties"));
     prob = new Properties();
     prob.load(fis);
     if(prob.getProperty("browser").equalsIgnoreCase("chrome")){
         driver = new ChromeDriver();
     }
     else if(prob.getProperty("browser").equalsIgnoreCase("edge")){
         driver = new EdgeDriver();
     }
     else if (prob.getProperty("browser").equalsIgnoreCase("safari")) {
         driver = new SafariDriver();
     }
     else{
            throw new InvalidArgumentException("Enter the correct browser name");
     }

          //local variable
        driver.navigate().to(prob.getProperty("testenvi"));
        driver.manage().window().maximize();

    }

}
