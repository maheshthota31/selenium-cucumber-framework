package utils;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class SpecManager {

    public WebDriver driver;
    DriverManager driverManager = new DriverManager();


    public void beforeScenario() throws IOException {
        driver = driverManager.startDriver();
        driver.get("https://demo.spreecommerce.org/");
    }

    public void afterScenario() {
        driverManager.stopDriver();
    }
}
