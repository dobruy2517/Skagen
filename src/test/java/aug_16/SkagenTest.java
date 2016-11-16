package aug_16;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static Utils.DriverUtils.getDriver;

public class SkagenTest {
    @Before
    public void preCondition() {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("chromedriver").getFile());
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        getDriver().manage().window().maximize();
    }

    @After
    public void postCondition() {
        getDriver().close();
    }

    @Test
    public void registerTest() {
        MainPage mainPage = new MainPage();
        mainPage.open();
        mainPage.clickLogIn();

        LoginPage logIn = new LoginPage();
        logIn.clickCreateNewAcount();

        RegisterPage reg = new RegisterPage();
        reg.inputFirstName("First Name");
        reg.inputLastName("Last Name");
        reg.inputEmail("tester@i.ua");
        reg.inputPassword("password8");
        reg.singMeUpButton();

        mainPage.newArrivals();

        NewArrivals arrivals = new NewArrivals();
        arrivals.chooseProduct();

        ProductPage product = new ProductPage();
        product.addToBag();
        product.continueShoping();
        Assert.assertEquals(product.expectedQuantity("(1)"), product.getQuantity());
        Assert.assertEquals(product.expectedPrice("195"), product.getPrice());
    }
}