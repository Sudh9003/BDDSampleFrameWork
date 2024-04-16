package helper;

import manager.DriverManager;
import manager.PageObjectManager;
import org.openqa.selenium.WebDriver;

//Test Context class which will hold all the objects state throughout the execution.This is used to share data among the step definition classes and wire them up.
public class TestContext {

    private DriverManager driverManager;
    private PageObjectManager pageObjectManager;


    public TestContext(){
        driverManager = new DriverManager();
        pageObjectManager = new PageObjectManager(driverManager.getDriver());


    }

    //This will return the current webdriver manager object
    public DriverManager getWebDriverManager() {
        return driverManager;
    }
    //This will return the current page object manager object
    public PageObjectManager getPageObjectManager() {
        return pageObjectManager;
    }


}