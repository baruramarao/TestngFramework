package DriverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class Base {
    public WebDriver driver;

    @BeforeSuite
    public void initialisedriver()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\IdeaProjects\\sample2\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    }
}
