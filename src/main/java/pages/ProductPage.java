package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage {

    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(xpath = "//*[@aria-label='L']")
    private WebElement lSize;

    @FindBy(id = "add-to-cart-button")
    private WebElement addToCart;

    @FindBy(xpath = "//*[@id='content']/div[4]/div/div/div[2]/div/div[1]/div[2]")
    private WebElement addedToCartMessage;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 30);

    }

    public void selectSize() {
        wait.until(ExpectedConditions.elementToBeClickable(lSize));
        lSize.click();
    }

    public void selectAddToCart() {
        addToCart.click();
    }

    public String addedToCartMessage() {
        wait.until(ExpectedConditions.visibilityOf(addedToCartMessage));
        return addedToCartMessage.getText();
    }


}
