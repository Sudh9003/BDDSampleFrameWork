package pages;

import manager.FileReaderManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utils.Wait;

import java.util.List;

//This will handle all the object and methods of home page.
public class HomePage {

    WebDriver driver;
    Integer timeout = (int)FileReaderManager.getInstance().getConfigReader().getImplicitlyWait();

    public By userName = By.cssSelector("input[name='username']");
	public By password = By.cssSelector("input[name='password']");


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    //Navigate to the home page.
    public void navigate(){
        driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
        Wait.untilPageLoadComplete(driver);
    }
    
    public void enterIdPass() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(userName).sendKeys("Admin");;
		driver.findElement(password).sendKeys("admin123");
	}
    
    public void login() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
	    System.out.println(driver.getTitle());
	}
    




}