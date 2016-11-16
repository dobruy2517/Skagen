package aug_16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static Utils.DriverUtils.getDriver;

public class MainPage {
    private By logIn = By.id("utility-nav-signup");
    private By newArrivals = By.cssSelector("#global-navigation > div.navigation > div > ul > li:nth-child(1) > a");
    private By curt = By.cssSelector("#mini-cart-icon>a>i");
    private By linkMen = By.cssSelector("[class=\"\"]>[title=\"Men\"]");

    public MainPage() {

    }

    public void open() {
        getDriver().get("http://www.skagen.com");
    }

    public void close() {
        getDriver().quit();
    }

    public void clickLogIn() {
        getDriver().findElement(logIn).click();
    }

    public void newArrivals() {
        getDriver().findElement(newArrivals).click();
    }


    public void curt() {
        getDriver().findElement(curt).click();
    }

    public void clickOnMenLink(){
        getDriver().findElement(linkMen).click();
    }
}
