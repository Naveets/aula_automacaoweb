package Validation;

import PageObjects.CheckoutPage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class CheckoutValidation {

    private WebDriver driver;
    private CheckoutPage checkoutPage;

    public CheckoutValidation (WebDriver driver){

        this.driver = driver;
        checkoutPage = new CheckoutPage(this.driver);

    }

    public void validaForm(){

        try{
            Assertions.assertFalse(checkoutPage.getFirstNameInput().getAttribute("value").equalsIgnoreCase(""));
        }catch (Exception e) {
            e.getMessage();
        }
    }
}
