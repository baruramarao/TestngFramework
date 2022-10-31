package UtilCommonMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Commonmethods extends Waits {
    public WebDriver driver;

    public Commonmethods(WebDriver driver)
    {
        super(driver);
        this.driver = driver;
    }

    public void clickon(By xpath,int timeout)
    {
        if(iselementpresent(xpath,timeout))
        {
            driver.findElement(xpath).click();

        }

    }
    public void entertext(By xpath,int timeout,String text)
    {
        if(iselementpresent(xpath,timeout))
        {
            driver.findElement(xpath).sendKeys(text);
        }
    }
    public void mousehoveractions(By xpath,int timeout)
    {
        WebElement ele=driver.findElement(xpath);
        Actions builder=new Actions(driver);
        builder.moveToElement(ele).build().perform();
        if(iselementpresent(xpath,timeout))
        {
        driver.findElement(xpath);
        }
       }
    public void Rightclick(By xpath,int timeout) {
        WebElement ele = driver.findElement(xpath);
        Actions builder = new Actions(driver);
        builder.moveToElement(ele).build().perform();
        if (iselementpresent(xpath, timeout))
        {
            driver.findElement(xpath);
        }
    }
    public void doubleclick(By xpath,int timeout)
    {
        WebElement ele = driver.findElement(xpath);
        Actions builder = new Actions(driver);
        builder.moveToElement(ele).build().perform();
        if (iselementpresent(xpath, timeout))
        {
            driver.findElement(xpath);
        }
    }
    public void draganddrop(By xpath, int timeout)
    {
        WebElement ele=driver.findElement(xpath);
        Actions builder=new Actions(driver);
        builder.moveToElement(ele).build().perform();
        if(iselementpresent(xpath,timeout))
        {
            driver.findElement(xpath);
        }
    }
    public String companyname(By xpath,int timeout,String text) throws InterruptedException
    {
        WebElement ele=driver.findElement(xpath);
         if(iselementpresent(xpath,timeout))
     {
        driver.findElement(xpath);
     }
        String text1=ele.getText();
        return text1;
    }
    public  void getoptions(By xpath,String itemname,int timeout)
    {
        WebElement ele=driver.findElement(xpath);
        if(iselementpresent(xpath,timeout))
        {
        driver.findElement(xpath);
        Select dropdown=new Select(ele);
        List<WebElement> items=dropdown.getOptions();
        for(int i=0;i<= items.size()-1;i++)
        {
            String itemname1=items.get(i).getText();
            // System.out.println(itemname);
            if (itemname == itemname1);
        }
    }
    }
    public void allwindows(By extitle,int timeout,By xpath)
    {
       String currentwindow=driver.getWindowHandle();
       Set<String>allwindows=driver.getWindowHandles();
       for (String window:allwindows)
       {
           driver.switchTo().window(window);
           if(driver.getTitle().equals(extitle)){
               break;
           }
       }
       if(iselementpresent(xpath,timeout));
    }
    public void firstwindow(By xpath,int timeout)
    {
        if(iselementpresent(xpath,timeout));
        {

            ArrayList<String>all=new ArrayList<>(driver.getWindowHandles());
            driver.switchTo().window(all.get(1));
            driver.switchTo().window(all.get(0));
            driver.navigate().refresh();
        }
    }
    public void lasttwindow(By xpath,int timeout)
    {
            if(iselementpresent(xpath,timeout));
        {
            ArrayList<String>all=new ArrayList<>(driver.getWindowHandles());
            driver.switchTo().window(all.get(1));
            driver.switchTo().window(all.get(0));
            driver.navigate().refresh();
        }

    }


        public void selectitembytext(By xpath,String itemname,int timeout)
    {
        WebElement ele=driver.findElement(xpath);{
        if(iselementpresent(xpath,timeout)){
    }
        Select item=new Select(ele);
        item.selectByVisibleText(itemname);
    }
    }

    public void selectitembyindex(By xpath,int index,int timeout)
    {
        WebElement ele=driver.findElement(xpath);

        if(iselementpresent(xpath,timeout))
        {
        driver.findElement(xpath);}
        Select item=new Select(ele);
        item.selectByIndex(index);
    }
    public void gettext(By xpath,int timeout)
    {
      WebElement ele=driver.findElement(xpath);
      {
      if(iselementpresent(xpath,timeout))
      ele.getText();

      }
    }

}
