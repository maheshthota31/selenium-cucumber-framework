package step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.HomePage;
import pages.MenPage;
import pages.ProductPage;
import utils.SpecManager;

import java.io.IOException;
import java.security.PublicKey;

public class AddingToCart extends SpecManager {

    private HomePage homePage;
    private MenPage menPage;
    private ProductPage productPage;

    @Before
    public void beforeTest() throws IOException {
        super.beforeScenario();
    }

    @Given("Navigate to Men page")
    public void navigate_to_men_page() {
        homePage = new HomePage(driver);
        menPage = homePage.navigateToMenPage();
    }

    @When("Select Men Shirt")
    public void select_men_shirt() {
        productPage = menPage.selectHoodie();
        productPage.selectSize();
    }

    @Then("It should be added to Cart")
    public void it_should_be_added_to_cart() {
        productPage.selectAddToCart();
        Assert.assertTrue(productPage.addedToCartMessage().contains("Added to cart successfully!"));
    }

    @After
    public void afterTest() {
        super.afterScenario();
    }

}
