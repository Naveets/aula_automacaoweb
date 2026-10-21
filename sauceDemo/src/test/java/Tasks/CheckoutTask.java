package Tasks;

import PageObjects.CheckoutPage;
import Validation.GenericValidation;
import org.openqa.selenium.WebDriver;

public class CheckoutTask {

    private WebDriver driver;
    private CheckoutPage checkoutPage;
    private GenericValidation genericValidation;

    public CheckoutTask(WebDriver driver) {

        this.driver = driver;
        checkoutPage = new CheckoutPage(this.driver);
        genericValidation = new GenericValidation(this.driver);
    }

    public void preencherCheckout() throws InterruptedException {
        genericValidation.validationTitlePages("Checkout: Your Information");
        checkoutPage.getFirstNameInput().sendKeys("Stevan");
        Thread.sleep(500);
        checkoutPage.getLastNameInput().sendKeys("Soares");
        Thread.sleep(500);
        checkoutPage.getZipCodeInput().sendKeys("123456789");
        Thread.sleep(500);
        checkoutPage.getContinueInput().click();
        genericValidation.validationTitlePages("Checkout: Overview");
        Thread.sleep(500);
        genericValidation.validationProduto();

    }

}
