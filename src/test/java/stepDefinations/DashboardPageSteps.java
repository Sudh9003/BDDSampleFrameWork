package stepDefinations;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import helper.TestContext;

import java.awt.AWTException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import pages.DashboardPage;

public class DashboardPageSteps {

    TestContext testContext;
    DashboardPage dashboardPage;

    private static Logger log = LogManager.getLogger(DashboardPageSteps.class);

    public DashboardPageSteps(TestContext testContext) {
        this.testContext = testContext;
        this.dashboardPage = testContext.getPageObjectManager().getSearchResultPage();
    }

    @Then("validate user name at dashboardpage")
    public void validate_user_name_at_dashboardpage() throws InterruptedException {
    	dashboardPage.validateUserName();
    	log.info("Correct User Name Is Displayed at DashBoard Page");
    }
    
    @Then("user validate system user {string} search option")
    public void user_validate_system_user_search_option(String user) throws InterruptedException, AWTException{
    	dashboardPage.systemSearch(user);
    	log.info("Search Button Clicked");
    }

    @Then("user should be able to logout")
    public void user_should_be_able_to_logout() throws InterruptedException {
    	Thread.sleep(2000);
    	dashboardPage.Logout();
    	log.info("User Should be Logged Out");
    }
}