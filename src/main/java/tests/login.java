package tests;

        import org.junit.After;
        import org.junit.Before;
        import org.junit.Test;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.support.PageFactory;
        import pageObject.homePage;
        import setup.Setup;
        import pageObject.loginPage;
        import org.junit.Assert;

/**
 * Created by ad on 22.06.2015.
 */
public class login {

    public static final String login = "p8admin";
    public static final String pass = "Pp1234567";
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
        Assert.assertEquals("FileNet Workplace XT - Обзор", j);
    }

    @Test

    public void logout () {
        homePage page = PageFactory.initElements(driver, homePage.class);
        page.logout();
        String i= driver.getTitle();
        Assert.assertEquals("IBM FileNet Workplace XT Вход в систему", i);
    }

    // @After
    //  public void tearDown() {driver.close();}
}
