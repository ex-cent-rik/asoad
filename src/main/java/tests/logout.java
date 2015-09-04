package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObject.homePage;
import pageObject.loginPage;
import setup.Setup;

/**
 * Created by ashevtsov on 04.09.2015.
 */
public class logout {
    public static final String login = "p8admin";
    public static final String pass = "Pp1234567";
    private static WebDriver driver;

    @Before
    public void setUp() {
        driver = Setup.getDriver();
    }

    @Before
    public void autorization() {

        loginPage page = PageFactory.initElements(driver, loginPage.class);
        page.login(login);
        page.pass(pass);
    }

    @Test

    public void logout () {
        homePage page = PageFactory.initElements(driver, homePage.class);
        page.logout();
        String i= driver.getTitle();
        Assert.assertEquals("IBM FileNet Workplace XT Log in", i);
        String t=driver.findElement(By.xpath(".//*[@id='loginForm']/div/div[2]/div[2]")).getText();
        Assert.assertEquals("Enter your user name and password, then click Log in.", t);
    }
}
