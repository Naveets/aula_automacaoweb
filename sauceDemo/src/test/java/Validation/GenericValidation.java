package Validation;

import PageObjects.GenericPage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class GenericValidation {

    private WebDriver driver;
    private GenericPage genericPage;

    public GenericValidation(WebDriver driver) {

        this.driver = driver;
        genericPage = new GenericPage(this.driver);
    }

    public void validationTitlePages(String texto) {

        try {
            String label = genericPage.getTextTitle().getText();
            Assertions.assertEquals(texto, label);
            Framework.Utils.TakeScreenshot.screenshotPage(driver, texto);
        } catch (Exception e) {
            Framework.Utils.TakeScreenshot.screenshotPage(driver, texto);
            throw e;
        }

    }

    public void validationProduto() {

        try {
            String labelProduto = genericPage.getTextProduto().getText();
            Assertions.assertEquals("Sauce Labs Onesie", labelProduto);
            Framework.Utils.TakeScreenshot.screenshotPage(driver, "Selecionar Produto");
        } catch (Exception e) {
            Framework.Utils.TakeScreenshot.screenshotPage(driver, "Selecionar Produto");
            throw e;
        }
    }
}
