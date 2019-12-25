package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.BaseUtil;
import util.DriverManager;

public class ProductPage extends BaseUtil {

    @FindBy(id = "add-to-cart-button")
    private WebElement addToCartButton;

    @FindBy(id="quantity")
    private WebElement quantityField;

    public ProductPage(){
        PageFactory.initElements(DriverManager.driver,this);
    }

    public CartPage enterQuantityAndAddToCart(int quantity){
        quantityField.clear();
        quantityField.sendKeys(Integer.toString(quantity));
        addToCartButton.click();
        return new CartPage();
    }

}
