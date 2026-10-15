package Tasks;

import PageObjects.LoginPage;
import org.openqa.selenium.WebDriver;

public class LoginTask {

    private WebDriver driver;
    private LoginPage loginPage;

    public LoginTask (WebDriver driver){

        this.driver = driver;
        loginPage = new LoginPage(this.driver);
    }
    public void efetuarLogin() throws InterruptedException {
        loginPage.getUserNameInput().sendKeys("standard_user");
        Thread.sleep(5000);
        loginPage.getUserPasswordInput().sendKeys("secret_sauce");
        Thread.sleep(5000);
        loginPage.getLoginButton().click();
        Thread.sleep(5000);
    }

}
