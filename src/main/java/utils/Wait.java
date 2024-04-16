package utils;

import manager.FileReaderManager;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class Wait {

    private static Logger log = LogManager.getLogger(Wait.class);

    //This method is used to hold the execution till the load the page
    public static void untilPageLoadComplete(WebDriver driver) {
        untilPageLoadComplete(driver, FileReaderManager.getInstance().getConfigReader().getImplicitlyWait());
    }

    public static void untilPageLoadComplete(WebDriver driver, Long timeoutInSeconds){
        until(driver, (d) ->
        {
            Boolean isPageLoaded = (Boolean)((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
            if (!isPageLoaded) System.out.println("Document is loading");
            return isPageLoaded;
        }, timeoutInSeconds);
    }


    //This method is used to handle the conditions for hold of the execution.
    private static void until(WebDriver driver, Function<WebDriver, Boolean> waitCondition, Long timeoutInSeconds){
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        webDriverWait.withTimeout(Duration.ofSeconds(timeoutInSeconds));
        try{
            webDriverWait.until(waitCondition);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    //This method is used to wait till the element is visible.
    public static WebElement untilVisible(WebDriver driver, By by, Integer timeoutInSeconds){
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(by));
        log.info("Element found: " + by);
        return driver.findElement(by);
    }

    //This method is wait for the hardwait.
    public static void hardWait(int timeout){
        try {
            Thread.sleep(timeout);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
