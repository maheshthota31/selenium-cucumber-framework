import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BagsPage;
import pages.CartPage;
import pages.HomePage;
import pages.ProductPage;
import util.BaseUtil;

public class UserJourneyTest extends BaseUtil {
    public HomePage homePage;
    public BagsPage bagsPage;
    public ProductPage productPage;
    public CartPage cartPage;

    public int quantity = 2;

    @Test
    public void clickOnBagsCategory(){
        homePage = new HomePage();
        Assert.assertTrue(homePage.isBagsCategoryDisplayed());
        bagsPage = homePage.clickOnBagsCategory();
        Assert.assertTrue(bagsPage.isRubyOnRailsToteBagExists());
        productPage = bagsPage.clickOnProduct();
        cartPage = productPage.enterQuantityAndAddToCart(quantity);
        Assert.assertEquals(Integer.parseInt(cartPage.getQuantity()), quantity);
    }
}
