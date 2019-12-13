package util;


import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    DriverManager driverManager;
    ConfigFileReader configFileReader = new ConfigFileReader();

    @BeforeSuite
    public void startDriver(){
        driverManager = new DriverManager();
    }

    @BeforeClass
    public void launchURL(){
        String baseUrl = configFileReader.getConfigPropertyValue("base_url");
        DriverManager.driver.get(baseUrl);
    }

    @AfterSuite
    public void closeDriver(){
        DriverManager.driver.close();
    }
}
