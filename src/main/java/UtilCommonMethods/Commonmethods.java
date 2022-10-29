package UtilCommonMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Commonmethods extends Waits {
    public WebDriver driver;

    public Commonmethods(WebDriver driver)
    {
        super(driver);
        this.driver = driver;
    }

    public void clickonitems(By xpath) {

    }
    public void entertext(By xpath,String text)
    {

    }
}
