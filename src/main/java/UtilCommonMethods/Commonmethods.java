package UtilCommonMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Commonmethods extends Waits {
    public WebDriver driver;

    public Commonmethods(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void clickonitems(By xpath, int timeout) {
        if (iselementpresent(xpath, timeout)) {
            driver.findElement(xpath).click();
        }

    }

    public void entertext(By xpath, String text, int timeout) {
        if (iselementpresent(xpath, timeout)) {
            driver.findElement(xpath).sendKeys(text);
        }

    }

    public void MouseoverAction(By xpath, int timeout) {
        WebElement ele = driver.findElement(xpath);
        Actions builder = new Actions(driver);
        builder.moveToElement(ele).build().perform();
        if (iselementpresent(xpath, timeout)) {
            driver.findElement(xpath).click();
        }
    }

    public void ToRightClick(By xpath, int timeout) {
        WebElement ele = driver.findElement(xpath);
        Actions builder = new Actions(driver);
        builder.contextClick(ele).build().perform();
        if (iselementpresent(xpath, timeout)) {
            driver.findElement(xpath).click();
        }
    }

    public void ToDoubleClick(By xpath, int timeout) {
        WebElement ele = driver.findElement(xpath);
        Actions builder = new Actions(driver);
        builder.doubleClick(ele).build().perform();
        if (iselementpresent(xpath, timeout)) {
            driver.findElement(xpath).click();
        }
    }

    public void DragandDrop(By xpath, int timeout) {
        WebElement from = driver.findElement(xpath);
        WebElement to = driver.findElement(xpath);
        Actions builder = new Actions(driver);
        builder.dragAndDrop(from, to).build().perform();
        if (iselementpresent(xpath, timeout)) {
            driver.findElement(xpath).click();
        }
    }

    public void gettext(By xpath, int timeout) {
        if (iselementpresent(xpath, timeout)) {
            driver.findElement(xpath).getText();
        }
    }

    public void allwindows(By xpath, int timeout, String extitle) {
        String currentwindow = driver.getWindowHandle();
        Set<String> allwindows = driver.getWindowHandles();
        for (String window : allwindows) {
            driver.switchTo().window(window);
            String web = driver.getTitle();
            if (web.equals(extitle)) {
                break;
            }
        }
        if (iselementpresent(xpath, timeout))
        {
            driver.findElement(xpath).isDisplayed();
        }
    }
    public void firstwindow(By xpath,int timeout)
    {
        ArrayList<String> all = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(all.get(2));
        driver.navigate().refresh();
        if(iselementpresent(xpath, timeout))
        {
            driver.findElement(xpath).isDisplayed();
        }
    }
    public void Lastwindow(By xpath,int timeout)
    {
        ArrayList<String> all = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(all.get(2));
        driver.navigate().refresh();
        if(iselementpresent(xpath, timeout))
        {
            driver.findElement(xpath).isDisplayed();
        }
    }
    public void getoptions(By xpath,String itemname,int timeout)
    {
        WebElement ele = driver.findElement(xpath);
        Select dropdown = new Select(ele);
        List<WebElement> items = dropdown.getOptions();
        boolean flag=false;
        for (int i = 0; i <= items.size() - 1; i++)
        {
            String itemname1 = items.get(i).getText();
            //System.out.println(itemname);
            if(itemname.equals(itemname1))
            {
                // WebElement ele1=driver.findElement(By.xpath(""));
                dropdown.selectByVisibleText(itemname);
                flag=true;
                break;
            }
        }
        if(flag==false)
        {
            Assert.fail(itemname+" "+"is not available in the dropdown");
        }
    }
    public void selectitemBytext(By xpath, String itemname)
    {
        WebElement ele = driver.findElement(xpath);
        Select item = new Select(ele);
        item.selectByVisibleText(itemname);
    }
    public void selectitembyIndex(By xpath,int index)
    {
        WebElement ele=driver.findElement(xpath);
        Select item=new Select(ele);
        item.deselectByIndex(index);
    }
}
