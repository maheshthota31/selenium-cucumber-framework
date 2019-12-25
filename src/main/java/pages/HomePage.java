package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.BaseUtil;
import util.DriverManager;

import java.util.List;

public class HomePage extends BaseUtil {

    @FindBy(className = "nav-link text-white")
    private WebElement loginLink;

    @FindBy(xpath = "//*[text()=\"Bags\"]")
    private WebElement bagsLink;

    @FindAll(@FindBy(xpath = "//*[text()=\"Bags\"]"))
    private List<WebElement> bagLinks;

    public HomePage(){
        PageFactory.initElements(DriverManager.driver, this);
    }

    public LoginPage clickOnLogin(){

        loginLink.click();
        return new LoginPage();
    }

    public BagsPage clickOnBagsCategory(){
        bagsLink.click();
        return new BagsPage();
    }

    public boolean isBagsCategoryDisplayed(){
        if(bagLinks.size()>0){
            return true;
        }
        return true;
    }

}
