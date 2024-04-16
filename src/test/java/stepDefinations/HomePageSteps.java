package stepDefinations;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper.TestContext;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import pages.HomePage;


public class HomePageSteps {

    TestContext testContext;
    HomePage homePage;

    private static Logger log = LogManager.getLogger(HomePageSteps.class);

    public HomePageSteps(TestContext testContext) {
        this.testContext = testContext;
        this.homePage = testContext.getPageObjectManager().getHomePage();
    }

    @And("user navigate to the loginPage")
    public void user_navigate_to_the_loginPage() throws Throwable {
        homePage.navigate();
        log.info("Home page is displayed");
    }
    
    @When("user enters userID and password")
	public void user_enters_user_id_and_password() throws InterruptedException{
		//created HomePage object to call the methods and to initialize the driver
		homePage.enterIdPass();
		//testcontext.reusableUtils.switchToChildWindow();
	}
    @When("clicks on login button")
	public void clicks_on_login_button() throws InterruptedException {
		homePage.login();
		log.info("User Is On Home Page");
	}


   





}