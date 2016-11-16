package aug_16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Utils.DriverUtils.getDriver;

public class ProductPage {
    private By addToBag = By.id("add-to-bag");
    private By continueShoping = By.className("btn-secondary");
    private By quantity = By.className("mini-cart-count");
    private By productPrice = By.cssSelector("#productListData > div:nth-child(1) > div:nth-child(1) > div > div > div.prod-info > div.prod-prductPrice > span");

    public void addToBag() {
        getDriver().findElement(addToBag).click();
    }

    public void continueShoping() {
        WebElement waiting = (new WebDriverWait(getDriver(), 10))
                .until(ExpectedConditions.visibilityOfElementLocated(continueShoping));
        getDriver().findElement(continueShoping).click();
    }

    public String getQuantity() {
        return getDriver().findElement(quantity).getText();
    }

    public String expectedQuantity(String expectedQuantity){
        return expectedQuantity;
    }

    public String getPrice(){
        return getDriver().findElement(productPrice).getText();
    }

    public String expectedPrice(String price){
        return price;
    }
}
