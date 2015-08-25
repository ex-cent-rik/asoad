package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import setup.Setup;

/**
 * Created by ashevtsov on 24.08.2015.
 */
public class homePage {
    public static final String ASOAD_logout = "http://filenet-n1-dmz.sbrf.ua.loc:9080/WorkplaceXT/Browse.jsf";
    private WebDriver driver;

    @FindBy(id = "FORM:LOGOUT")
    WebElement logoutBtn;


    public void logout() {
        driver = Setup.getDriver();
        driver.get(ASOAD_logout);
        logoutBtn.click();
    }
}
