package Tasks;

import PageObjects.CheckoutPage;
import Validation.CheckoutValidation;
import Validation.GenericValidation;
import framework.Utils.FakersGenerations;
import org.openqa.selenium.WebDriver;

public class CheckoutTask {

    private WebDriver driver;
    private CheckoutPage checkoutPage;
    private GenericValidation genericValidation;
    private CheckoutValidation checkoutValidation;
    private FakersGenerations fakersGenerations;

    public CheckoutTask(WebDriver driver) {

        this.driver = driver;
        checkoutPage = new CheckoutPage(this.driver);
        genericValidation = new GenericValidation(this.driver);
        checkoutValidation = new CheckoutValidation(this.driver);
        fakersGenerations = new FakersGenerations();
    }

    public void preencherCheckout()  {
        genericValidation.validationTitlePages("Checkout: Your Information");
        checkoutPage.getFirstNameInput().sendKeys(fakersGenerations.getFirstName());
        checkoutPage.getLastNameInput().sendKeys(fakersGenerations.getLastName());
        checkoutPage.getZipCodeInput().sendKeys(fakersGenerations.getZipCode());
        checkoutValidation.validaForm();
        checkoutPage.getContinueInput().click();
        genericValidation.validationTitlePages("Checkout: Overview");
        genericValidation.validationProduto();

    }

}
