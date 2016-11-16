package aug_16;

import org.openqa.selenium.By;

import static Utils.DriverUtils.getDriver;

public class MenPage {
    private By imageMenPage = By.cssSelector("[alt^=\"Hagen Connected Titanium\"]");
//    private By visbleEye = By

    public void getFirstProduct(){
        getDriver().findElement(imageMenPage);
    }

//    public boolean isPresent()
}
