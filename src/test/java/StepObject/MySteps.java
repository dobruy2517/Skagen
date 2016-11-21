package StepObject;

import aug_16.LoginPage;
import aug_16.MainPage;
import aug_16.RegisterPage;
import org.jbehave.core.annotations.*;
import org.jbehave.core.annotations.When;

public class MySteps {
    MainPage main = new MainPage();
    LoginPage login = new LoginPage();
    RegisterPage register = new RegisterPage();

    @Given("registered page opened")
    public void openRegiterPage(){
        main.open();
        main.clickLogIn();
        login.clickCreateNewAcount();
    }

    @When("Inputing value to corresponding text fields: $name, $lastName, $eMail, $pass is OK")
    public void inputRegisterInformation(String name, String lastName, String eMail, String pass){
        register.inputFirstName(name);
        register.inputLastName(lastName);
    }
}
