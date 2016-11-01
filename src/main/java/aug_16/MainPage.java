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
    private By singMeUp = By.cssSelector(".account-register>button");
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
        driver.findElement(email).sendKeys("dobruy251  @gmail.com");
        driver.findElement(password).sendKeys("password");
    }

    public void singMeUpButton(){
        driver.findElement(singMeUp).click();
    }
}
