
package pageObject;

        import org.openqa.selenium.Keys;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;
        import setup.Setup;

/**
 * Created by ad on 22.06.2015.
 */
public class loginPage {

    public static final String ASOAD_login = "http://filenet-n1-dmz.sbrf.ua.loc:9080/WorkplaceXT/ContainerLogin.jsp";
    private WebDriver driver;

    @FindBy(id = "j_username")
    WebElement loginField;

    @FindBy(id = "j_password")
    WebElement passField;

    @FindBy(xpath = "html/body/form/div/div[2]/table/tbody/tr/td[2]")
    WebElement loginBtn;


    public void login(String s) {
        driver = Setup.getDriver();
        driver.get(ASOAD_login);
        loginField.sendKeys(s);
    }

    public void pass(String s) {
        passField.sendKeys(s);
        loginBtn.click();
    }
}