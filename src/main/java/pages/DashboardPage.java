package pages;

import io.cucumber.datatable.DataTable;
import manager.FileReaderManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utils.Wait;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

//This will handle all the object and methods of Search Result page.
public class DashboardPage {

    WebDriver driver;
    Integer timeout = (int)FileReaderManager.getInstance().getConfigReader().getImplicitlyWait();


    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public By dashBoardText = By.xpath("//h6[text()='Dashboard']");
	public By profileButton = By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']");
	public By logout = By.xpath("(//a[@class='oxd-userdropdown-link'])[4]");
	public By userName = By.cssSelector("p[class='oxd-userdropdown-name']");
	public By userNameDash = By.xpath("//label[text()='Username']/parent::div/following-sibling::div/input");
	public By admin = By.xpath("//span[text()='Admin']/parent::a");
	public By userRoleDropdown = By.xpath("(//div[@class='oxd-select-text--after'])[1]");
	public By userRole = By.xpath("//div[@role='listbox']/div[2]");
	public By empName = By.cssSelector("[class='oxd-autocomplete-wrapper']>div>input");
	public By statusDropdown = By.xpath("(//div[@class='oxd-select-text--after'])[2]");
	public By status = By.xpath("//div[@role='listbox']/div[2]");
	public By search = By.cssSelector("button[type='submit']");
	
	
	
	public void validateUserName() {
		String user = driver.findElement(userName).getText();
		if(user.contains("manda user")) {
			System.out.println("User Name Is Correct:" +user);
		}else {
			System.out.println("User Name Is Incorrect:" +user);
		}
	}	
	public void systemSearch(String user) throws InterruptedException, AWTException {
		driver.findElement(admin).click();
		Thread.sleep(2000);
		driver.findElement(userNameDash).sendKeys(user);
		driver.findElement(userRoleDropdown).click();
		driver.findElement(userRole).click();
		driver.findElement(empName).sendKeys("Ranga");
		Robot robot = new Robot();
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		driver.findElement(statusDropdown).click();
		driver.findElement(status).click();
		driver.findElement(search).click();
		
	}
	
	public void Logout() throws InterruptedException {
//		String el=driver.findElement(dashBoardText).getText();
//		System.out.println(el);
		driver.findElement(profileButton).click();
		driver.findElement(logout).click();
		System.out.println(driver.getTitle());
	}


}