package Tasks;

import PageObjects.FinishPage;
import Validation.FinishValidation;
import Validation.GenericValidation;
import Validation.LoginValidation;
import org.openqa.selenium.WebDriver;

public class FinishTask {

    private WebDriver driver;
    private FinishPage finishPage;
    private GenericValidation genericValidation;
    private FinishValidation finishValidation;
    private LoginValidation loginValidation;
    public FinishTask (WebDriver driver){

        this.driver = driver;
        finishPage = new FinishPage(this.driver);
        genericValidation = new GenericValidation(this.driver);
        finishValidation = new FinishValidation(this.driver);
        loginValidation = new LoginValidation(this.driver);
    }

    public void finalizarCompra() throws InterruptedException {
        genericValidation.validationTitlePages("Checkout: Complete!");
        Thread.sleep(500);
        finishValidation.validationSucessoCompra();
        Thread.sleep(500);
        finishPage.getMenuButton().click();
        Thread.sleep(1000);
        finishPage.getMenuLogoutLink().click();
        Thread.sleep(1000);
        loginValidation.loginValidation();

    }
}
