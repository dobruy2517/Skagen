package aug_16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    WebDriver driver;
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
    private  By headPanel = By.cssSelector("#header-panel>a");

    public MainPage(){

    }

    public MainPage(WebDriver driver){
        this.driver = driver;
    }

    public void open(){
        driver.get("http://www.skagen.com");
    }

    public void close(){
        driver.quit();
    }

    public void clickLogIn(){
        driver.findElement(logIn).click();

    }

    public void clickCreateNewAcount(){
        driver.findElement(createNewAcount).click();
    }

    public void inputRegData(){
        driver.findElement(firstName).sendKeys("FirstName");
        driver.findElement(lastName).sendKeys("LastName");
        driver.findElement(email).sendKeys("test_email@i.ua");
        driver.findElement(password).sendKeys("password8");
    }

    public void singMeUpButton(){
        driver.findElement(singMeUp).click();
    }

    public void byProducts(){
        driver.findElement(newArrivals).click();
        driver.findElement(product_1).click();
        driver.findElement(addToBag).click();
        driver.findElement(headPanel).click();
    }
}
