package aug_16;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SkagenTest {
    public WebDriver driver;
    @Before
    public void preCondition(){
        System.setProperty("webdriver.chrome.driver", "/home/ihor/Rozetka/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @After
    public void postCondition(){
        driver.close();
    }
    @Test
    public void test(){
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickLogIn();
        mainPage.clickCreateNewAcount();
        mainPage.inputRegData();
        mainPage.singMeUpButton();
        String actualResultEmail = driver.findElement(By.id("tooltipMsg-email")).getText();
        String actualResultPassword = driver.findElement(By.id("tooltipMsg-password")).getText();
        Assert.assertEquals("Please enter a valid email address", actualResultEmail);
        Assert.assertEquals("Passwords need to be at least 7 characters long and include both a number and letter to be valid. Please try again.", actualResultPassword);
    }
}
