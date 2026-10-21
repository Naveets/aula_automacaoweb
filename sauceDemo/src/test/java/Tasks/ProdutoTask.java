package Tasks;

import PageObjects.CartPage;
import PageObjects.ProdutoPage;
import Validation.GenericValidation;
import org.openqa.selenium.WebDriver;

public class ProdutoTask {

    private WebDriver driver;
    private ProdutoPage produtoPage;
    private GenericValidation genericValidation;
    private CartPage cartPage;

    public ProdutoTask (WebDriver driver){

        this.driver = driver;
        produtoPage = new ProdutoPage(this.driver);
        genericValidation = new GenericValidation(this.driver);
        cartPage = new CartPage(this.driver);

    }

    public void selecionarProduto() throws InterruptedException{

        produtoPage.getAddToCartButton().click();
        Thread.sleep(5000);
        produtoPage.getCartButton().click();
        Thread.sleep(5000);
        genericValidation.validationTitlePages("Your Cart");
        genericValidation.validationProduto();
        Thread.sleep(5000);
        cartPage.getCheckoutButton().click();
    }
}
