import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BagsPage;
import pages.HomePage;
import pages.LoginPage;
import util.BaseUtil;

public class LoginTest extends BaseUtil {

    public HomePage homePage;
    public BagsPage bagsPage;

    @Test
    public void loginTest(){
        homePage = new HomePage();


    }
}
