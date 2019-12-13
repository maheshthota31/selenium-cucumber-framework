package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.BaseTest;
import util.DriverManager;

public class HomePage extends BaseTest {

    @FindBy(className = "nav-link text-white")
    private WebElement loginLink;

    @FindBy(className = "list-group-item list-group-item-action")
    private WebElement bagsLink;

    public HomePage(){
        PageFactory.initElements(DriverManager.driver, this);
    }

    public void clickOnLogin(){
        loginLink.click();
    }

    public BagsPage clickOnBagsCategory(){
        bagsLink.click();
        return new BagsPage();
    }

}
