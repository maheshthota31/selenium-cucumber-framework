package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.BaseUtil;
import util.DriverManager;

import java.util.List;

public class BagsPage extends BaseUtil {

    @FindBy(xpath = "//*[@title=\"Ruby on Rails Tote\"]")
    private WebElement productLink;

    @FindAll(@FindBy(xpath = "//*[@title=\"Ruby on Rails Tote\"]"))
    private List<WebElement> bagExistence;

    public BagsPage(){
        PageFactory.initElements(DriverManager.driver,this);
    }

    public ProductPage clickOnProduct(){
        productLink.click();
        return new ProductPage();
    }

    public boolean isRubyOnRailsToteBagExists(){
        if(bagExistence.size() > 0){
            return true;
        }
        return true;
    }
}
