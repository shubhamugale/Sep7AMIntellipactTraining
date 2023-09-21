package automationbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AutomationCode {

    public static void main(String[] args) {


        WebDriver d = new EdgeDriver();

 //       driver.get("https://login.salesforce.com/");

        d.navigate().to("https://login.salesforce.com/");
        d.navigate().refresh();

        d.findElement(By.xpath("//input[@id='username']")).sendKeys("aravinth");

        d.findElement(By.xpath("//input[@type='password']")).sendKeys("123");

        d.findElement(By.xpath("//input[@name='Login']")).click();

    }


}
