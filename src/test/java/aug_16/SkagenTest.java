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
    public void registerTest(){
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickLogIn();
        mainPage.clickCreateNewAcount();
        mainPage.inputRegData();
        mainPage.singMeUpButton();
    }

    @Test
    public void byProducts(){
        MainPage page = new MainPage(driver);
        page.open();
        page.byProducts();
        String expResult_1 = driver.findElement(By.cssSelector("#mini-cart-icon>a>span")).getText();
        Assert.assertEquals("1", expResult_1);
        String expResult_2 = driver.findElement(By.cssSelector(".total>span:nth-child(2)")).getText();
        Assert.assertEquals("£195.00", expResult_2);
    }
}
