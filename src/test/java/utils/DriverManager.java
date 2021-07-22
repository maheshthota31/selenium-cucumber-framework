package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class DriverManager {

    WebDriver driver;

    public WebDriver startDriver() throws IOException {

        //TODO:try WebDriverManager

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

//        Properties properties = new Properties();
//        properties.load(new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/config.properties"));
//        switch (properties.getProperty("browser")) {
//            case "chrome":
//                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/drivers/chromedriver");
//                driver = new ChromeDriver();
//        }
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;
    }

    public void stopDriver() {
        driver.quit();
    }
}
