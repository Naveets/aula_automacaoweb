package Tasks;

import PageObjects.ProdutoPage;
import org.openqa.selenium.WebDriver;

public class ProdutoTask {

    private WebDriver driver;
    private ProdutoPage produtoPage;

    public ProdutoTask (WebDriver driver){

        this.driver = driver;
        produtoPage = new ProdutoPage(this.driver);
    }

    public void selecionarProduto() throws InterruptedException{

        produtoPage.getAddToCartButton().click();
        Thread.sleep(5000);
        produtoPage.getCartButton().click();

    }
}
