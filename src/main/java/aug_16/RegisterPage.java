package aug_16;

import org.openqa.selenium.By;

import static Utils.DriverUtils.getDriver;

public class RegisterPage {
    private By firstName = By.id("firstName");
    private By lastName = By.id("lastName");
    private By email = By.id("email");
    private By password = By.id("password");
    private By singMeUp = By.cssSelector(".account-register>button");

    public void inputFirstName(String name) {
       getDriver().findElement(firstName).sendKeys(name);
    }

    public void inputLastName(String last_name) {
        getDriver().findElement(lastName).sendKeys(last_name);
    }

    public void inputEmail(String mail) {
        getDriver().findElement(email).sendKeys(mail);
    }

    public void inputPassword(String pass){
        getDriver().findElement(password).sendKeys(pass);
    }

    public void singMeUpButton() {
        getDriver().findElement(singMeUp).click();
    }

}