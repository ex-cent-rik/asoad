package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageObject.homePage;
import pageObject.loginPage;
import pageObject.searchPage;
import setup.Setup;

import java.util.NoSuchElementException;


/**
 * Created by ashevtsov on 26.08.2015.
 */
public class search {
    public static final String login = "p8admin";
    public static final String pass = "Pp1234567";
    public static final String searchText1 = "Антонюк";
    public static final String searchText2 = "нюк";
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
    public void search() {

    searchPage page = PageFactory.initElements(driver, searchPage.class);
    page.search(searchText1);
    boolean isSearchResultPresent = driver.findElement(By.id("FORM:SIMPLE_SEARCH_RESULT_LIST_s")).isDisplayed();
    Assert.assertTrue(isSearchResultPresent);
    }

    @After

    public void logout () {
    homePage page = PageFactory.initElements(driver, homePage.class);
    page.logout();
    }

}
