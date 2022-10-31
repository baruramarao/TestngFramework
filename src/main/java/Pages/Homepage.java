package Pages;

import Locators.ToolsqaHomepageLocators;
import UtilCommonMethods.Commonmethods;
import UtilCommonMethods.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage extends Commonmethods implements ToolsqaHomepageLocators
{
    public WebDriver driver;

    public Homepage(WebDriver driver)
    {
        super(driver);
        this.driver = driver;
    }
    public boolean verifytoolsqaimage()
    {
       return iselementpresent(toolsqaimage,30);
    }
}
