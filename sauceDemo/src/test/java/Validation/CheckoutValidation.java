package Validation;

import PageObjects.CheckoutPage;
import framework.Utils.FileOperations;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class CheckoutValidation {

    private WebDriver driver;
    private CheckoutPage checkoutPage;

    public CheckoutValidation(WebDriver driver) {

        this.driver = driver;
        checkoutPage = new CheckoutPage(this.driver);

    }

    public void validaForm() {

        try {
            Assertions.assertFalse(checkoutPage.getFirstNameInput().getAttribute("value").equalsIgnoreCase(""));
        } catch (Exception e) {
            e.getMessage();
        }
    }


    public void validaCamposForm() {
        try {

            String name = FileOperations.getProperties("form").getProperty("primeiroNome");
            String lastName = FileOperations.getProperties("form").getProperty("segundoNome");
            String zipCode = FileOperations.getProperties("form").getProperty("cep");


            Assertions.assertEquals(name, checkoutPage.getFirstNameInput().getAttribute("value"));
            Assertions.assertEquals(lastName, checkoutPage.getLastNameInput().getAttribute("value"));
            Assertions.assertEquals(name, checkoutPage.getZipCodeInput().getAttribute("value"));


        } catch (Exception e) {

            e.getMessage();
        }
    }
}