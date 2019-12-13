package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.BaseTest;
import util.DriverManager;

public class ProductPage extends BaseTest {

    @FindBy(id = "add-to-cart-button")
    private WebElement addToCartButton;

    @FindBy(id="quantity")
    private WebElement quantity;

    public ProductPage(){
        PageFactory.initElements(DriverManager.driver,this);
    }

    public void enterQuantityAndAddToCart(){
        quantity.sendKeys("2");
        addToCartButton.click();
    }

}
