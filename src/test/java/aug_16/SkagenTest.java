package aug_16;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static Utils.DriverUtils.getDriver;

public class SkagenTest {
    @Before
    public void preCondition(){
        System.setProperty("webgetDriver().chrome.driver", "chromedriver");
        getDriver().manage().window().maximize();
    }
        @After
    public void postCondition(){
        getDriver().close();
    }
    @Test
    public void registerTest(){
        MainPage mainPage = new MainPage();
        mainPage.open();
        mainPage.clickLogIn();
        mainPage.clickCreateNewAcount();
        mainPage.inputRegData();
        mainPage.singMeUpButton();
    }

    @Test
    public void byProducts(){
        MainPage page = new MainPage();
        page.open();
        page.byProducts();
        Assert.assertEquals("(1)", page.getQuantity());
        String expResult_2 = getDriver().findElement(By.cssSelector(".total>span:nth-child(2)")).getText();
        Assert.assertEquals("£195.00", expResult_2);
    }
}
