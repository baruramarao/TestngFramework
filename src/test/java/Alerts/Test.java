package Alerts;

import DriverFactory.Base;
import Pages.Homepage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

public class Test extends Base
 {

     public Homepage hpage;

     @BeforeMethod
     public void setup()
     {
         driver.get("https://demoqa.com/alerts");
         hpage=new Homepage(driver);
     }
     @org.testng.annotations.Test
     public void handleAlerts()
     {
         Assert.assertTrue(hpage.verifytoolsqaimage());

     }

 }
