package UtilCommonMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waits {
    public WebDriverWait wait;
    public WebDriver driver;
    public Waits(WebDriver driver)
    {
        this.driver=driver;
    }
    public boolean clickableelement(By xpath,int timeout)
    {
        boolean flag=false;
       wait=new WebDriverWait(driver, Duration.ofSeconds(timeout));
       wait.until(ExpectedConditions.elementToBeClickable(xpath));
       flag = true;
       return flag;
    }
    public boolean iselementpresent(By xpath,int timeout)
    {
        boolean flag=false;
        try
        {
            wait=new WebDriverWait(driver, Duration.ofSeconds(timeout));
            wait.until(ExpectedConditions.presenceOfElementLocated(xpath));
            if(driver.findElement(xpath).isDisplayed())
            {

                flag = true;
            }
        }
        catch(TimeoutException e)
        {
            System.out.println(e.getMessage());
            //System.out.println(xpath+"is not displayed in "+timeout+"seconds");
        }
        catch(NoSuchElementException e){
            System.out.println(e.getMessage());
           // System.out.println(xpath+"element is not found");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

            return flag;
    }
}
