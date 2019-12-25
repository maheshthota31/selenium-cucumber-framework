package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.BaseUtil;
import util.DriverManager;

public class CartPage extends BaseUtil {

    @FindBy(id = "order_line_items_attributes_0_quantity")
    private WebElement quantity;

    @FindBy(id = "update-button")
    private WebElement update;

    @FindBy(id = "checkout-link")
    private WebElement checkOut;

    public CartPage(){
        PageFactory.initElements(DriverManager.driver, this);
    }

    public String getQuantity(){
        return quantity.getAttribute("value");
    }

    public void clickUpdateButton(){
        update.click();
    }

    public void clickCheckOutLink(){
        checkOut.click();
    }
}
