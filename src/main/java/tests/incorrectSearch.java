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
import pageObject.searchPage;
import setup.Setup;

/**
 * Created by ashevtsov on 04.09.2015.
 */
public class incorrectSearch {
    public static final String login = "p8admin";
    public static final String pass = "Pp1234567";
    public static final String searchText = "grgb";
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
    public void incorrectSearch() {

        searchPage page = PageFactory.initElements(driver, searchPage.class);
        page.search(searchText);
        boolean isSearchResultEmpty = driver.findElement(By.id("FORM:SIMPLE_SEARCH_RESULT_LIST_noItems")).isDisplayed();
        Assert.assertTrue(isSearchResultEmpty);
        String t=driver.findElement(By.id("FORM:SIMPLE_SEARCH_RESULT_LIST_noItems")).getText();
        Assert.assertEquals("No items found", t);

    }

    @After
    public void logout () {
        homePage page = PageFactory.initElements(driver, homePage.class);
        page.logout();
    }
}
