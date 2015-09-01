package tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObject.loginPage;
import pageObject.searchPage;
import setup.Setup;

/**
 * Created by ashevtsov on 26.08.2015.
 */
public class search {
    public static final String login = "p8admin";
    public static final String pass = "Pp1234567";
    public static final String searchText = "Антонюк";
    private static WebDriver driver;

    @Before
    public void setUp() {
        driver = Setup.getDriver();
    }

    @Test
    public void autorization() {

        loginPage page = PageFactory.initElements(driver, loginPage.class);
        page.login(login);
        page.pass(pass);
        String j= driver.getTitle();
        Assert.assertEquals("FileNet Workplace XT - Browse", j);
    }


    @Test
    public void search() {

        searchPage page = PageFactory.initElements(driver, searchPage.class);
        page.search(searchText);
        String i= driver.getTitle();
        Assert.assertEquals("FileNet Workplace XT - Search", i);
//        String y= driver.getTitle();
//        Assert.assertTrue(page.searhResult);
    }
}
