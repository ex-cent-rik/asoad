package pageObject;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import setup.Setup;
/**
 * Created by ashevtsov on 25.08.2015.
 */
public class searchPage {
    public static final String searchPageURL = "http://filenet-n1-dmz.sbrf.ua.loc:9080/WorkplaceXT/ContainerLogin.jsp";
    public static final String ASOAD_logout = "http://filenet-n1-dmz.sbrf.ua.loc:9080/WorkplaceXT/Browse.jsf";
    private WebDriver driver;

    @FindBy(id = "FORM:FnSimpleSearch_objectType_folder")
    WebElement checkBoxFolder;


    @FindBy(id = "FORM:VIEW_search")
    WebElement switchToSearch;


    @FindBy(id = "FORM:FnSimpleSearch_keyword")
    WebElement searchField;

    @FindBy(id= "FORM:FnSimpleSearch_searchButton_link")
    WebElement searchBtn;

    @FindBy(id = "FORM:SIMPLE_SEARCH_RESULT_LIST_noItems")
    WebElement emptysearchResult;

    @FindBy(id = "FORM:SIMPLE_SEARCH_RESULT_LIST_s")
    WebElement searchResult;

    public void search(String s) {
        driver = Setup.getDriver();
        driver.get(ASOAD_logout);
        switchToSearch.click();
        searchField.sendKeys(s);
    //    checkBoxFolder.click();
        searchBtn.click();

    }




//    public boolean isElementPresent("searhResult") {
//        try {
//            driver.findElement((By) searchResult);
//            return true;
//        } catch (NoSuchElementException e) {
//            return false;
//        }
//    }
//    public WebElement searchResult() {
//        return searchResult;
//    }
}