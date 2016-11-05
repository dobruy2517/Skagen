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
    private By createNewAcount = By.cssSelector(".account-login>p>a");
    private By firstName = By.id("firstName");
    private By lastName = By.id("lastName");
    private By email = By.id("email");
    private By password = By.id("password");
    private By product_1 = By.cssSelector(".prod-info>a[title=\"Hagen Connected Titanium and Leather Hybrid Smartwatch\"]");
    private By singMeUp = By.cssSelector(".account-register>button");
    private By newArrivals = By.cssSelector("#global-navigation > div.navigation > div > ul > li:nth-child(1) > a");
    private By addToBag = By.id("add-to-bag");
    private By quantity = By.cssSelector("#mini-cart-icon>a>span");
    private By continueShoping = By.cssSelector(".button-box>a.btn-secondary");
    private By curt = By.cssSelector("#mini-cart-icon>a>i");

    public MainPage(){

    }
    
    public void open(){
        getDriver().get("http://www.skagen.com");
    }

    public void close(){
        getDriver().quit();
    }

    public void clickLogIn(){
        getDriver().findElement(logIn).click();

    }

    public void clickCreateNewAcount(){
        getDriver().findElement(createNewAcount).click();
    }

    public void inputRegData(){
        getDriver().findElement(firstName).sendKeys("FirstName");
        getDriver().findElement(lastName).sendKeys("LastName");
        getDriver().findElement(email).sendKeys("test_email@i.ua");
        getDriver().findElement(password).sendKeys("password8");
    }

    public void singMeUpButton(){
        getDriver().findElement(singMeUp).click();
    }

    public void byProducts(){
        getDriver().findElement(newArrivals).click();
        getDriver().findElement(product_1).click();
        getDriver().findElement(addToBag).click();
//        ExplisitWait(15);
        getDriver().findElement(continueShoping).click();
//        getDriver().findElement(newArrivals).click();
        getDriver().findElement(curt).click();
    }

    public String getQuantity(){
        return getDriver().findElement(quantity).getText();
    }

}
