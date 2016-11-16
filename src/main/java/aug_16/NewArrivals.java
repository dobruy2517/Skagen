package aug_16;

import org.openqa.selenium.By;

import static Utils.DriverUtils.getDriver;

public class NewArrivals {
    private By product_1 = By.cssSelector(".prod-info>a[title=\"Hagen Connected Titanium and Leather Hybrid Smartwatch\"]");
    public void chooseProduct() {
        getDriver().findElement(product_1).click();
    }
}
