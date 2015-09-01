package tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObject.loginPage;
import setup.Setup;

/**
 * Created by ashevtsov on 31.08.2015.
 */
public class loginWithIncorectPass {
    public static final String login = "p8admin";
    public static final String incorectPass = "Pp123456";
    private static WebDriver driver;

    @Before
    public void setUp() {
        driver = Setup.getDriver();
    }

    @Test
    public void autorization() {

        loginPage page = PageFactory.initElements(driver, loginPage.class);
        page.login(login);
        page.pass(incorectPass);
        String j= driver.getTitle();
        Assert.assertEquals("IBM FileNet Workplace XT Log in", j);
    }

}
