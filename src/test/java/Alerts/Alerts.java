package Alerts;

import DriverFactory.Base;
import Pages.Homepage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Alerts extends Base
 {

     public Homepage hpage;

     @BeforeMethod
     public void setup()
     {
         driver.get("https://demoqa.com/alerts");
         hpage=new Homepage(driver);
     }
     @Test
     public void handleAlerts()
     {
         Assert.assertTrue(hpage.verifytoolsqaimage());
     }
 }
