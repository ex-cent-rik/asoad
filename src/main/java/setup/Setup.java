package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by ad on 22.06.2015.
 */
public class Setup {

    static WebDriver driver;


    public static WebDriver getDriver() {

        if (driver == null) {
            driver = new FirefoxDriver();
//            DesiredCapabilities capability = DesiredCapabilities.firefox();
//            try {
//                driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
//            } catch (MalformedURLException e) {
//                e.printStackTrace();
//            }
//            capability.setBrowserName("firefox");
//            capability.setVersion("38.0.1");
        }
        return driver;
    }
}