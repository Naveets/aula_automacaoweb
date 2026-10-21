package Validation;

import PageObjects.LoginPage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class LoginValidation {

    private WebDriver driver;
    private LoginPage loginPage;

    public LoginValidation(WebDriver driver) {

        this.driver = driver;
        loginPage = new LoginPage(this.driver);

    }

    public void loginValidation() {
        try {
            Assertions.assertTrue(loginPage.getLoginButton().isDisplayed());

        } catch (Exception e) {
            e.getMessage();
        }
    }

}
