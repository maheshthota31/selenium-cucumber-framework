package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.BaseTest;
import util.DriverManager;

public class BagsPage extends BaseTest {

    @FindBy(xpath = "//*[@title=\"Ruby on Rails Tote\"]")
    public WebElement productLink;

    public BagsPage(){
        PageFactory.initElements(DriverManager.driver,this);
    }

    public ProductPage clickOnProduct(){
        productLink.click();
        return new ProductPage();
    }
}
