package aug_16;

import org.openqa.selenium.By;

import static Utils.DriverUtils.getDriver;

public class LoginPage {
    private By createNewAcount = By.cssSelector(".account-login>p>a");

    public void clickCreateNewAcount() {
        getDriver().findElement(createNewAcount).click();
    }
}
