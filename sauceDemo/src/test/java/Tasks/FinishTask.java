package Tasks;

import PageObjects.FinishPage;
import PageObjects.LoginPage;
import Validation.FinishValidation;
import Validation.GenericValidation;
import Validation.LoginValidation;
import framework.Browser.Waits;
import org.openqa.selenium.WebDriver;

public class FinishTask {

    private LoginPage loginPage;
    private WebDriver driver;
    private FinishPage finishPage;
    private GenericValidation genericValidation;
    private FinishValidation finishValidation;
    private LoginValidation loginValidation;
    private Waits waits;
    public FinishTask (WebDriver driver){

        this.driver = driver;
        finishPage = new FinishPage(this.driver);
        genericValidation = new GenericValidation(this.driver);
        finishValidation = new FinishValidation(this.driver);
        loginValidation = new LoginValidation(this.driver);
        waits = new Waits(this.driver);
        loginPage = new LoginPage(this.driver);
    }

    public void finalizarCompra()  {
        genericValidation.validationTitlePages("Checkout: Complete!");
        finishValidation.validationSucessoCompra();
        finishPage.getMenuButton().click();
        waits.loadElement(finishPage.getMenuLogoutLink());
        finishPage.getMenuLogoutLink().click();
        waits.loadElement(loginPage.getLoginButton());
        loginValidation.loginValidation();

    }
}
